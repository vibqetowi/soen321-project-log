package com.google.firebase.database.tubesock;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.logging.LogWrapper;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class WebSocket {
    static final byte OPCODE_BINARY = 2;
    static final byte OPCODE_CLOSE = 8;
    static final byte OPCODE_NONE = 0;
    static final byte OPCODE_PING = 9;
    static final byte OPCODE_PONG = 10;
    static final byte OPCODE_TEXT = 1;
    private static final int SSL_HANDSHAKE_TIMEOUT_MS = 60000;
    private static final String THREAD_BASE_NAME = "TubeSock";
    private final int clientId;
    private WebSocketEventHandler eventHandler;
    private final WebSocketHandshake handshake;
    private final Thread innerThread;
    private final LogWrapper logger;
    private final WebSocketReceiver receiver;
    private volatile Socket socket;
    private final String sslCacheDirectory;
    private volatile State state;
    private final URI url;
    private final WebSocketWriter writer;
    private static final AtomicInteger clientCount = new AtomicInteger(0);
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private static ThreadFactory threadFactory = Executors.defaultThreadFactory();
    private static ThreadInitializer intializer = new ThreadInitializer() { // from class: com.google.firebase.database.tubesock.WebSocket.1
        @Override // com.google.firebase.database.tubesock.ThreadInitializer
        public void setName(Thread thread, String str) {
            thread.setName(str);
        }
    };

    /* renamed from: com.google.firebase.database.tubesock.WebSocket$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State = iArr;
            try {
                iArr[State.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State[State.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State[State.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State[State.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$database$tubesock$WebSocket$State[State.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public WebSocket(ConnectionContext connectionContext, URI uri) {
        this(connectionContext, uri, null);
    }

    private synchronized void closeSocket() {
        if (this.state == State.DISCONNECTED) {
            return;
        }
        this.receiver.stopit();
        this.writer.stopIt();
        if (this.socket != null) {
            try {
                this.socket.close();
            } catch (Exception e10) {
                this.eventHandler.onError(new WebSocketException("Failed to close", e10));
            }
        }
        this.state = State.DISCONNECTED;
        this.eventHandler.onClose();
    }

    private Socket createSocket() {
        String scheme = this.url.getScheme();
        String host = this.url.getHost();
        int port = this.url.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e10) {
                throw new WebSocketException(c.r("unknown host: ", host), e10);
            } catch (IOException e11) {
                throw new WebSocketException("error while creating socket to " + this.url, e11);
            }
        } else if (scheme != null && scheme.equals("wss")) {
            if (port == -1) {
                port = 443;
            }
            SSLSessionCache sSLSessionCache = null;
            try {
                if (this.sslCacheDirectory != null) {
                    sSLSessionCache = new SSLSessionCache(new File(this.sslCacheDirectory));
                }
            } catch (IOException e12) {
                this.logger.debug("Failed to initialize SSL session cache", e12, new Object[0]);
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(SSL_HANDSHAKE_TIMEOUT_MS, sSLSessionCache).createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new WebSocketException("Error while verifying secure socket to " + this.url);
            } catch (UnknownHostException e13) {
                throw new WebSocketException(c.r("unknown host: ", host), e13);
            } catch (IOException e14) {
                throw new WebSocketException("error while creating secure socket to " + this.url, e14);
            }
        } else {
            throw new WebSocketException(c.r("unsupported protocol: ", scheme));
        }
    }

    public static ThreadInitializer getIntializer() {
        return intializer;
    }

    public static ThreadFactory getThreadFactory() {
        return threadFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runReader() {
        try {
            try {
                Socket createSocket = createSocket();
                synchronized (this) {
                    this.socket = createSocket;
                    if (this.state == State.DISCONNECTED) {
                        try {
                            this.socket.close();
                            this.socket = null;
                            return;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    DataInputStream dataInputStream = new DataInputStream(createSocket.getInputStream());
                    OutputStream outputStream = createSocket.getOutputStream();
                    outputStream.write(this.handshake.getHandshake());
                    byte[] bArr = new byte[1000];
                    ArrayList arrayList = new ArrayList();
                    boolean z10 = false;
                    while (true) {
                        int i6 = 0;
                        while (!z10) {
                            int read = dataInputStream.read();
                            if (read != -1) {
                                bArr[i6] = (byte) read;
                                i6++;
                                if (bArr[i6 - 1] == 10 && bArr[i6 - 2] == 13) {
                                    String str = new String(bArr, UTF8);
                                    if (str.trim().equals("")) {
                                        z10 = true;
                                    } else {
                                        arrayList.add(str.trim());
                                    }
                                    bArr = new byte[1000];
                                } else if (i6 == 1000) {
                                    String str2 = new String(bArr, UTF8);
                                    throw new WebSocketException("Unexpected long line in handshake: " + str2);
                                }
                            } else {
                                throw new WebSocketException("Connection closed before handshake was complete");
                            }
                        }
                        this.handshake.verifyServerStatusLine((String) arrayList.get(0));
                        arrayList.remove(0);
                        HashMap<String, String> hashMap = new HashMap<>();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = ((String) it.next()).split(": ", 2);
                            String str3 = split[0];
                            Locale locale = Locale.US;
                            hashMap.put(str3.toLowerCase(locale), split[1].toLowerCase(locale));
                        }
                        this.handshake.verifyServerHandshakeHeaders(hashMap);
                        this.writer.setOutput(outputStream);
                        this.receiver.setInput(dataInputStream);
                        this.state = State.CONNECTED;
                        this.writer.getInnerThread().start();
                        this.eventHandler.onOpen();
                        this.receiver.run();
                    }
                }
            } finally {
                close();
            }
        } catch (WebSocketException e11) {
            this.eventHandler.onError(e11);
        } catch (Throwable th2) {
            WebSocketEventHandler webSocketEventHandler = this.eventHandler;
            webSocketEventHandler.onError(new WebSocketException("error while connecting: " + th2.getMessage(), th2));
        }
    }

    private void sendCloseHandshake() {
        try {
            this.state = State.DISCONNECTING;
            this.writer.stopIt();
            this.writer.send(OPCODE_CLOSE, true, new byte[0]);
        } catch (IOException e10) {
            this.eventHandler.onError(new WebSocketException("Failed to send close frame", e10));
        }
    }

    public static void setThreadFactory(ThreadFactory threadFactory2, ThreadInitializer threadInitializer) {
        threadFactory = threadFactory2;
        intializer = threadInitializer;
    }

    public void blockClose() {
        if (this.writer.getInnerThread().getState() != Thread.State.NEW) {
            this.writer.getInnerThread().join();
        }
        getInnerThread().join();
    }

    public synchronized void close() {
        int i6 = AnonymousClass3.$SwitchMap$com$google$firebase$database$tubesock$WebSocket$State[this.state.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            return;
                        }
                        return;
                    }
                    return;
                }
                sendCloseHandshake();
                return;
            }
            closeSocket();
            return;
        }
        this.state = State.DISCONNECTED;
    }

    public synchronized void connect() {
        if (this.state != State.NONE) {
            this.eventHandler.onError(new WebSocketException("connect() already called"));
            close();
            return;
        }
        ThreadInitializer intializer2 = getIntializer();
        Thread innerThread = getInnerThread();
        intializer2.setName(innerThread, "TubeSockReader-" + this.clientId);
        this.state = State.CONNECTING;
        getInnerThread().start();
    }

    public WebSocketEventHandler getEventHandler() {
        return this.eventHandler;
    }

    public Thread getInnerThread() {
        return this.innerThread;
    }

    public void handleReceiverError(WebSocketException webSocketException) {
        this.eventHandler.onError(webSocketException);
        if (this.state == State.CONNECTED) {
            close();
        }
        closeSocket();
    }

    public void onCloseOpReceived() {
        closeSocket();
    }

    public synchronized void pong(byte[] bArr) {
        send(OPCODE_PONG, bArr);
    }

    public synchronized void send(String str) {
        send(OPCODE_TEXT, str.getBytes(UTF8));
    }

    public void setEventHandler(WebSocketEventHandler webSocketEventHandler) {
        this.eventHandler = webSocketEventHandler;
    }

    public WebSocket(ConnectionContext connectionContext, URI uri, String str) {
        this(connectionContext, uri, str, null);
    }

    public WebSocket(ConnectionContext connectionContext, URI uri, String str, Map<String, String> map) {
        this.state = State.NONE;
        this.socket = null;
        this.eventHandler = null;
        int incrementAndGet = clientCount.incrementAndGet();
        this.clientId = incrementAndGet;
        this.innerThread = getThreadFactory().newThread(new Runnable() { // from class: com.google.firebase.database.tubesock.WebSocket.2
            @Override // java.lang.Runnable
            public void run() {
                WebSocket.this.runReader();
            }
        });
        this.url = uri;
        this.sslCacheDirectory = connectionContext.getSslCacheDirectory();
        this.logger = new LogWrapper(connectionContext.getLogger(), "WebSocket", c.p("sk_", incrementAndGet));
        this.handshake = new WebSocketHandshake(uri, str, map);
        this.receiver = new WebSocketReceiver(this);
        this.writer = new WebSocketWriter(this, THREAD_BASE_NAME, incrementAndGet);
    }

    public synchronized void send(byte[] bArr) {
        send(OPCODE_BINARY, bArr);
    }

    private synchronized void send(byte b10, byte[] bArr) {
        if (this.state != State.CONNECTED) {
            this.eventHandler.onError(new WebSocketException("error while sending data: not connected"));
        } else {
            try {
                this.writer.send(b10, true, bArr);
            } catch (IOException e10) {
                this.eventHandler.onError(new WebSocketException("Failed to send frame", e10));
                close();
            }
        }
    }
}
