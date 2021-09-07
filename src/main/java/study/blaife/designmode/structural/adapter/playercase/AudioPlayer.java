package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: 音频媒体
 * @Author: magd39318
 * @Date: 2021/8/30 11:03
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(Constant.MP3_TYPE)) {
            System.out.println("Playing mp3 file. name: " + fileName);
        } else if (audioType.equalsIgnoreCase(Constant.VLC_TYPE)
            || audioType.equalsIgnoreCase(Constant.MP4_TYPE)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
