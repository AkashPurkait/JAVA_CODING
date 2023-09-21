// Design an interface Database with methods connect() and disconnect(). Implement classes
// MySQLDatabase and OracleDatabase that implement the Database interface. Override the
// methods for database-specific operations.

interface Database {
    void connect();

    void disconnect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println(" ~DATABASE CONNECT WITH THE MySQL~ ");
    }

    public void disconnect() {
        System.out.println(" ~DATABASE DISCONNECT FROM THE MySQL~ ");
    }
}

class OracleDatabase implements Database {
    public void connect() {
        System.out.println(" ~DATABASE CONNECT WITH THE ORACLE~ ");
    }

    public void disconnect() {
        System.out.println(" ~DATABASE DISCONNECT FROM THE ORACLE~ ");
    }
}

class connectingdatabase {
    public static void main(String[] args) {
        System.out.println(" CONNECTING TO SERVER ");
        Database MySQL = new MySQLDatabase();
        MySQL.connect();
        MySQL.disconnect();
        Database Oracle = new OracleDatabase();
        Oracle.connect();
        Oracle.disconnect();
    }
}