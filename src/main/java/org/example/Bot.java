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
        if(update.hasMessage() && update.getMessage().hasText()){
            if(update.getMessage().getText().equals("/start")){
                System.out.println("Сработал /start");
            }
        }else if(update.hasCallbackQuery()){
            System.out.println("Сработал hasCallbackQuery");
        }
    }

}