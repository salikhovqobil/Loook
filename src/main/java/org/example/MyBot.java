package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        MyBotService myBotService = new MyBotService();
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();
            Long id = update.getMessage().getChat().getId();
            info(firstName,lastName,id,text);

            if (text.equals("/start")){
                try {
                    execute(myBotService.sendMessage(chatId));
                    execute(myBotService.phoneNumber(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tilni tanlang \uD83D\uDD01")){
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O'zbekcha \uD83C\uDDFA\uD83C\uDDFF")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Orqaga")){
                try {
                    execute(myBotService.phoneNumber(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Buyurtma berish \uD83D\uDECD")){
                try {
                    execute(myBotService.mainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Taomnoma \uD83C\uDF7D")){
                try {
                    execute(myBotService.Taomnoma(chatId));
                    execute(myBotService.Taomnoma1(chatId));
                    execute(myBotService.Taomnoma2(chatId));
                    execute(myBotService.Taomnoma3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Ortaqa qaytish")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public String getBotUsername() {
        return "loook_test1_bot";
    }

    @Override
    public String getBotToken() {
        return "6776764316:AAE-biYLMG2h6Z1trCDcIUQx8HrZePKWA8o";
    }
    private void info(String firstName, String lastName, Long id, String text) {
        System.out.println("----------Malumotlar----------");

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        System.out.println(
                "FirstName -> " + firstName + "\n" +
                        "LastName -> " + lastName + "\n" +
                        "Id -> " + id + "\n" +
                        "Text -> " + text
        );
    }
}
