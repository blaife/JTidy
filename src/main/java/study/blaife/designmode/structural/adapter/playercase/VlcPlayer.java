package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: Vlc播放器
 * @Author: magd39318
 * @Date: 2021/8/30 10:56
 */
public class VlcPlayer implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
