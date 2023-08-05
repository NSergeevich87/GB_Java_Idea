package jobagencyResult;

import jobagency.Observer;

// Это интерфейс рассылки наблюдателям
// Он может регистрировать наблюдателей, избавляться от них, и рассылать им всем сообщения
public interface Publisher {
    void registerObserver(jobagency.Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String nameCompany, int salary);
}
