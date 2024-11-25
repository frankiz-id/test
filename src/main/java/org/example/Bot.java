package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "TutorialBot";
    }

    @Override
    public String getBotToken() {
        return "4839574812:AAFD39kkdpWt3ywyRZergyOLMaJhac60qc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

}