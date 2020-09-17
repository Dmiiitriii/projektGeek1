package HW88;



import javax.swing.*;
import java.awt.*;

public class SettingWindows extends JFrame {
    private GameWindow gameWindow;
    private ResultWindow resultWindow;


    static final int WINDOW_X = GameWindow.WINDOW_X+50;
    static final int WINDOW_Y = GameWindow.WINDOW_Y + 50;
    static final int WINDOW_WIDTH = 405;
    static final int WINDOW_HEIGHT = 400;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    static int MODE_H_VS_A = 0;
    static int MODE_H_VS_H = 1;


    private JRadioButton jrbHumVsAi;
    private JRadioButton jrbHumVsHum;
    private ButtonGroup gameModeGroup;

    private JSlider slFieldSize;
    private JSlider slWiningLength;




    public SettingWindows(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_X,WINDOW_Y,WINDOW_WIDTH,WINDOW_HEIGHT);

        setTitle("Setting");

        setLayout(new GridLayout(8,1));
        add(new JLabel("Choose game mode: "));

        jrbHumVsAi = new JRadioButton("HumVsAi", true);
        jrbHumVsHum = new JRadioButton("HumVsHum");
        jrbHumVsHum.setEnabled(false);
        gameModeGroup = new ButtonGroup();  //объединяем в группу кнопки, чтобы выбирался только один из вариантов
        gameModeGroup.add(jrbHumVsAi);
        gameModeGroup.add(jrbHumVsHum);

        add(jrbHumVsAi);
        add(jrbHumVsHum);


        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        add(new JLabel("Choose field size: "));
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintLabels(true);
        slFieldSize.setPaintTicks(true);
        add(slFieldSize);

        slWiningLength = new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);
        add(new JLabel("Choose wining length: "));
        slWiningLength.setMajorTickSpacing(1);
        slWiningLength.setPaintLabels(true);
        slWiningLength.setPaintTicks(true);
        add(slWiningLength );

        slFieldSize.addChangeListener(e->{
            slWiningLength.setMaximum(slFieldSize.getValue());
        });

        JButton buttonStartGame = new JButton("Start game");
        add(buttonStartGame);

        buttonStartGame.addActionListener(e->{
            int mode;
            if (jrbHumVsAi.isSelected()){
                mode = MODE_H_VS_A;
            } else{
                mode = MODE_H_VS_H;
            }


            int fieldSize = slFieldSize.getValue();
            int winningLength = slWiningLength.getValue();

            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = winningLength;
            Logic.initMap();
            Logic.isFinishedGame = false;


            gameWindow.startNewGame(mode, fieldSize, winningLength);


            setVisible(false);
        });



        setVisible(false);
    }
}
