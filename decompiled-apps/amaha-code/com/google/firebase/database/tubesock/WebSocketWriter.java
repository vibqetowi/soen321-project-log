package com.google.firebase.database.tubesock;

import com.appsflyer.R;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
class WebSocketWriter {
    private WritableByteChannel channel;
    private BlockingQueue<ByteBuffer> pendingBuffers;
    private WebSocket websocket;
    private final Random random = new Random();
    private volatile boolean stop = false;
    private boolean closeSent = false;
    private final Thread innerThread = WebSocket.getThreadFactory().newThread(new Runnable() { // from class: com.google.firebase.database.tubesock.WebSocketWriter.1
        @Override // java.lang.Runnable
        public void run() {
            WebSocketWriter.this.runWriter();
        }
    });

    public WebSocketWriter(WebSocket webSocket, String str, int i6) {
        ThreadInitializer intializer = WebSocket.getIntializer();
        Thread innerThread = getInnerThread();
        intializer.setName(innerThread, str + "Writer-" + i6);
        this.websocket = webSocket;
        this.pendingBuffers = new LinkedBlockingQueue();
    }

    private ByteBuffer frameInBuffer(byte b10, boolean z10, byte[] bArr) {
        int i6;
        int i10;
        if (z10) {
            i6 = 6;
        } else {
            i6 = 2;
        }
        int length = bArr.length;
        int i11 = R.styleable.AppCompatTheme_windowNoTitle;
        if (length >= 126) {
            if (length <= 65535) {
                i6 += 2;
            } else {
                i6 += 8;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i6);
        allocate.put((byte) (b10 | Byte.MIN_VALUE));
        if (length < 126) {
            if (z10) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            if (z10) {
                i11 = 254;
            }
            allocate.put((byte) i11);
            allocate.putShort((short) length);
        } else {
            if (z10) {
                i10 = 255;
            } else {
                i10 = 127;
            }
            allocate.put((byte) i10);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z10) {
            byte[] generateMask = generateMask();
            allocate.put(generateMask);
            for (int i12 = 0; i12 < bArr.length; i12++) {
                allocate.put((byte) (bArr[i12] ^ generateMask[i12 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte[] generateMask() {
        byte[] bArr = new byte[4];
        this.random.nextBytes(bArr);
        return bArr;
    }

    private void handleError(WebSocketException webSocketException) {
        this.websocket.handleReceiverError(webSocketException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runWriter() {
        while (!this.stop && !Thread.interrupted()) {
            try {
                writeMessage();
            } catch (IOException e10) {
                handleError(new WebSocketException("IO Exception", e10));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i6 = 0; i6 < this.pendingBuffers.size(); i6++) {
            writeMessage();
        }
    }

    private void writeMessage() {
        this.channel.write(this.pendingBuffers.take());
    }

    public Thread getInnerThread() {
        return this.innerThread;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.closeSent = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void send(byte b10, boolean z10, byte[] bArr) {
        ByteBuffer frameInBuffer = frameInBuffer(b10, z10, bArr);
        if (this.stop && (this.closeSent || b10 != 8)) {
            throw new WebSocketException("Shouldn't be sending");
        }
        this.pendingBuffers.add(frameInBuffer);
    }

    public void setOutput(OutputStream outputStream) {
        this.channel = Channels.newChannel(outputStream);
    }

    public void stopIt() {
        this.stop = true;
    }
}
