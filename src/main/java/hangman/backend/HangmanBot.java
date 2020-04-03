package hangman.backend;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HangmanBot extends TelegramLongPollingBot {

    public HangmanBot() {
        super();
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        /*
        if (update.hasMessage() && update.getMessage().hasText()) {
            Collection<Method> methodsWithAnnotation = AnnotationUtils.getMethodsWithAnnotation(this.getClass(), HandlingCommand.class);

            Message message = update.getMessage();
            String command = getCommandFromMessage(message);

            methodsWithAnnotation.forEach(method -> {
                        HandlingCommand annotation = method.getAnnotation(HandlingCommand.class);
                        if (annotation.value().equals(command)) {
                            try {
                                method.invoke(this, update.getMessage());
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            );
        }*/
    }

    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public String getBotToken() {
        return "";
    }


}