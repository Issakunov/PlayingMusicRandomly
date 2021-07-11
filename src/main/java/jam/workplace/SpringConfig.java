package jam.workplace;

import org.springframework.context.annotation.*;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public Miagi miagi() {
        return new Miagi();
    }
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(),rockMusic(),miagi());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
