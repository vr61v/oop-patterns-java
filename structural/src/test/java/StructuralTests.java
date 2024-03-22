import adapter.ShareToTelegram;
import adapter.ShareToVk;
import adapter.entities.TelegramChatMessages;
import adapter.entities.VkChatMessages;
import adapter.models.Message;
import decorator.entities.FilmService;
import decorator.entities.ForeignService;
import decorator.entities.MusicService;
import decorator.entities.RussianService;
import decorator.models.Service;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StructuralTests {
    @Test
    public void testAdapter(){
        var telegramChat = new TelegramChatMessages();
        var vkChat = new VkChatMessages();
        var telegram = new ShareToTelegram(telegramChat);
        var vk = new ShareToVk(vkChat);

        var telegramMessage = new Message("Telegram message", "Hello, world!", "vr61v");
        var vkMessage = new Message("Vk message", "Hello, world!", "vr61v");

        telegram.share(telegramMessage);
        vk.share(vkMessage);

        var expectedTg = telegramChat.getMessages().getFirst();
        var expectedVk = vkChat.getMessages().getFirst();

        Assertions.assertEquals(expectedTg.getBody(), telegramMessage.getBody());
        Assertions.assertEquals(expectedTg.getSender(), telegramMessage.getSender());
        Assertions.assertNull(expectedTg.getImg());

        Assertions.assertEquals(expectedVk.getBody(), vkMessage.getBody());
        Assertions.assertEquals(expectedVk.getSender(), vkMessage.getSender());
    }

    @Test
    public void testDecorator(){
        Service foreignMusic = new ForeignService();
        foreignMusic = new MusicService("Spotify", foreignMusic);
        Assertions.assertEquals(foreignMusic.getName(), "Foreign service music from Spotify");
        Assertions.assertEquals(foreignMusic.getPrice(), 249);

        Service russianFilm = new RussianService();
        russianFilm = new FilmService("Kinopoisk", russianFilm);
        Assertions.assertEquals(russianFilm.getName(), "Russian service film from Kinopoisk");
        Assertions.assertEquals(russianFilm.getPrice(), 199);
    }
}
