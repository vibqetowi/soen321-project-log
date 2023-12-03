package com.google.firebase.database.tubesock;
/* loaded from: classes.dex */
public class WebSocketMessage {
    private byte[] byteMessage;
    private byte opcode = 1;
    private String stringMessage;

    public WebSocketMessage(byte[] bArr) {
        this.byteMessage = bArr;
    }

    public byte[] getBytes() {
        return this.byteMessage;
    }

    public String getText() {
        return this.stringMessage;
    }

    public boolean isBinary() {
        if (this.opcode == 2) {
            return true;
        }
        return false;
    }

    public boolean isText() {
        if (this.opcode == 1) {
            return true;
        }
        return false;
    }

    public WebSocketMessage(String str) {
        this.stringMessage = str;
    }
}
