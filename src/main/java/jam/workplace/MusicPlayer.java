package jam.workplace;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        int index = new Random().nextInt(3);

        return "Playing: " + musicList.get(new Random().nextInt(musicList.size())).getSong().get(index);
    }
}
