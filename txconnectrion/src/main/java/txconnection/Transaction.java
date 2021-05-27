package txconnection;

import org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl;
import com.arjuna.ats.internal.jta.transaction.arjunacore.subordinate;

public class Transaction {

    TransactionImple ti = new TransactionImple();
    TxConnectionManagerImpl tm = new TxConnectionManagerImpl();
}
