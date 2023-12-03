package com.google.firebase.database.tubesock;

import com.appsflyer.R;
import com.google.firebase.database.tubesock.MessageBuilderFactory;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
class WebSocketReceiver {
    private MessageBuilderFactory.Builder pendingBuilder;
    private WebSocket websocket;
    private DataInputStream input = null;
    private WebSocketEventHandler eventHandler = null;
    private byte[] inputHeader = new byte[R.styleable.AppCompatTheme_toolbarNavigationButtonStyle];
    private volatile boolean stop = false;

    public WebSocketReceiver(WebSocket webSocket) {
        this.websocket = null;
        this.websocket = webSocket;
    }

    private void appendBytes(boolean z10, byte b10, byte[] bArr) {
        if (b10 == 9) {
            if (z10) {
                handlePing(bArr);
                return;
            }
            throw new WebSocketException("PING must not fragment across frames");
        }
        MessageBuilderFactory.Builder builder = this.pendingBuilder;
        if (builder != null && b10 != 0) {
            throw new WebSocketException("Failed to continue outstanding frame");
        }
        if (builder == null && b10 == 0) {
            throw new WebSocketException("Received continuing frame, but there's nothing to continue");
        }
        if (builder == null) {
            this.pendingBuilder = MessageBuilderFactory.builder(b10);
        }
        if (this.pendingBuilder.appendBytes(bArr)) {
            if (z10) {
                WebSocketMessage message = this.pendingBuilder.toMessage();
                this.pendingBuilder = null;
                if (message != null) {
                    this.eventHandler.onMessage(message);
                    return;
                }
                throw new WebSocketException("Failed to decode whole message");
            }
            return;
        }
        throw new WebSocketException("Failed to decode frame");
    }

    private void handleError(WebSocketException webSocketException) {
        stopit();
        this.websocket.handleReceiverError(webSocketException);
    }

    private void handlePing(byte[] bArr) {
        if (bArr.length <= 125) {
            this.websocket.pong(bArr);
            return;
        }
        throw new WebSocketException("PING frame too long");
    }

    private long parseLong(byte[] bArr, int i6) {
        return (bArr[i6 + 0] << 56) + ((bArr[i6 + 1] & 255) << 48) + ((bArr[i6 + 2] & 255) << 40) + ((bArr[i6 + 3] & 255) << 32) + ((bArr[i6 + 4] & 255) << 24) + ((bArr[i6 + 5] & 255) << 16) + ((bArr[i6 + 6] & 255) << 8) + ((bArr[i6 + 7] & 255) << 0);
    }

    private int read(byte[] bArr, int i6, int i10) {
        this.input.readFully(bArr, i6, i10);
        return i10;
    }

    public boolean isRunning() {
        return !this.stop;
    }

    public void run() {
        int read;
        byte[] bArr;
        byte b10;
        boolean z10;
        boolean z11;
        long j10;
        this.eventHandler = this.websocket.getEventHandler();
        while (!this.stop) {
            try {
                read = read(this.inputHeader, 0, 1) + 0;
                bArr = this.inputHeader;
                b10 = bArr[0];
                if ((b10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((b10 & 112) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (WebSocketException e10) {
                handleError(e10);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e11) {
                handleError(new WebSocketException("IO Error", e11));
            }
            if (!z11) {
                byte b11 = (byte) (b10 & 15);
                int read2 = read + read(bArr, read, 1);
                byte[] bArr2 = this.inputHeader;
                byte b12 = bArr2[1];
                if (b12 < 126) {
                    j10 = b12;
                } else if (b12 == 126) {
                    read(bArr2, read2, 2);
                    byte[] bArr3 = this.inputHeader;
                    j10 = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
                } else if (b12 == Byte.MAX_VALUE) {
                    j10 = parseLong(this.inputHeader, (read2 + read(bArr2, read2, 8)) - 8);
                } else {
                    j10 = 0;
                }
                int i6 = (int) j10;
                byte[] bArr4 = new byte[i6];
                read(bArr4, 0, i6);
                if (b11 == 8) {
                    this.websocket.onCloseOpReceived();
                } else if (b11 != 10) {
                    if (b11 != 1 && b11 != 2 && b11 != 9 && b11 != 0) {
                        throw new WebSocketException("Unsupported opcode: " + ((int) b11));
                    }
                    appendBytes(z10, b11, bArr4);
                }
            } else {
                throw new WebSocketException("Invalid frame received");
            }
        }
    }

    public void setInput(DataInputStream dataInputStream) {
        this.input = dataInputStream;
    }

    public void stopit() {
        this.stop = true;
    }
}
