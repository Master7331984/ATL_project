package ClientWithStream;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String clientName;
    double debtClient;

    public Client(String clientName, double debtClient) {
        this.clientName = clientName;
        this.debtClient = debtClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getDebtClient() {
        return debtClient;
    }

    public void setDebtClient(double debtClient) {
        this.debtClient = debtClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", debtClient=" + debtClient +
                '}';
    }
}
