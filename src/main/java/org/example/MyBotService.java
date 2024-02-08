package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {
    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu Alaykum! Bizning botdan foydalanish uchun ro'yxatdan o'ting.\n" +
                "\n" +
                "Здравствуйте! Чтобы пользоваться нашим ботом вам необходимо пройти регистрацию.\n" +
                "\n" +
                "Hello! First you need to register to use our bot.");
        return sendMessage;

    }

    public SendMessage language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tilni tanlang :)" +
                "\n" +
                "\n" +
                "Выберите язык :)" +
                "\n" +
                "\n" +
                "Choose your language :)");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("O'zbekcha \uD83C\uDDFA\uD83C\uDDFF");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Русский \uD83C\uDDF7\uD83C\uDDFA");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("English \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button2);
        rows.add(row);
        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = sendMessage(chatId);
        sendMessage.setText("Xush Kelibsiz... :)" +
                "\n" +
                "Buyurtma beramizmi? ☺\uFE0F");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Buyurtma berish \uD83D\uDECD");
        row.add(button);
        rows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Biz bilan aloqa \uD83D\uDCDE");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Sozlamalar ⚙\uFE0F");
        row1.add(button2);

        rows.add(row1);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Orqaga");
        row3.add(button3);
        rows.add(row3);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage phoneNumber(Long chatId) {
        SendMessage sendMessage = sendMessage(chatId);
        sendMessage.setText("Iltimos raqamingizni biz bilan ulashing");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Contact");
        button4.setRequestContact(true);
        row4.add(button4);
        rows.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Tilni tanlang \uD83D\uDD01");
        row5.add(button5);
        rows.add(row5);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);

        sendMessage.setChatId(chatId);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage mainMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Nimadan boshlaymiz ?");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Taomnoma \uD83C\uDF7D");
        row.add(button);
        rows.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Tovuq \uD83C\uDF57");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Gazaklar \uD83C\uDF5F");
        row1.add(button2);
        rows.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Kombo \uD83E\uDD64\uD83C\uDF5F");
        row2.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Pitsa \uD83C\uDF55");
        row2.add(button4);
        rows.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText(" Saladlar \uD83E\uDD57");
        row3.add(button5);

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Burgerlar \uD83C\uDF54");
        row3.add(button6);
        rows.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Lavash \uD83C\uDF2F");
        row4.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Ichimliklar \uD83E\uDD64");
        row4.add(button8);
        rows.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("⬅\uFE0F Ortaqa qaytish");
        row5.add(button9);
        rows.add(row5);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto Taomnoma(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("C:\\Users\\Qobil\\IdeaProjects\\Magazin\\Loook\\src\\main\\java\\org\\example\\photoes\\img.png")));
        return photo;
    }
    public SendPhoto Taomnoma1(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File( "C:\\Users\\Qobil\\IdeaProjects\\Magazin\\Loook\\src\\main\\java\\org\\example\\photoes\\img_1.png")));
        return photo;
    }
    public SendPhoto Taomnoma2(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File("C:\\Users\\Qobil\\IdeaProjects\\Magazin\\Loook\\src\\main\\java\\org\\example\\photoes\\img_2.png")));
        return photo;
    }
    public SendPhoto Taomnoma3(Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(chatId);
        photo.setPhoto(new InputFile(new File( "C:\\Users\\Qobil\\IdeaProjects\\Magazin\\Loook\\src\\main\\java\\org\\example\\photoes\\img_3.png")));
        return photo;
    }



}




