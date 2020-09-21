package web.endpoints;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class SimpleServer extends WebSocketServer {

    ArrayList<WebSocket> clients = new ArrayList<WebSocket>();

    public SimpleServer(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        clients.add(conn);
        System.out.println(clients);
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        clients.remove(conn);
        System.out.println(clients);
        System.out.println("closed " + conn.getRemoteSocketAddress() + " with exit code " + code + " additional info: " + reason);
    }

    @Override
        public void onMessage(WebSocket conn, String message) {
        int pos = Integer.parseInt(message) + 1;
        broadcast(String.valueOf(pos));
        System.out.println("received message from "	+ conn.getRemoteSocketAddress() + ": " + message);
    }

    @Override
    public void onMessage( WebSocket conn, ByteBuffer message ) {
        System.out.println("received ByteBuffer from "	+ conn.getRemoteSocketAddress());
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("an error occurred on connection " + conn.getRemoteSocketAddress()  + ":" + ex);
    }

    @Override
    public void onStart() {
        System.out.println("server started successfully");
    }

    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;

        WebSocketServer server = new SimpleServer(new InetSocketAddress(host, port));
        server.run();
    }
}