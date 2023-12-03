package com.google.firebase.database.connection.util;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class StringListReader extends Reader {
    private List<String> strings;
    private boolean closed = false;
    private int charPos;
    private int markedCharPos = this.charPos;
    private int stringListPos;
    private int markedStringListPos = this.stringListPos;
    private boolean frozen = false;

    public StringListReader() {
        this.strings = null;
        this.strings = new ArrayList();
    }

    private long advance(long j10) {
        long j11 = 0;
        while (this.stringListPos < this.strings.size() && j11 < j10) {
            long j12 = j10 - j11;
            long currentStringRemainingChars = currentStringRemainingChars();
            if (j12 < currentStringRemainingChars) {
                this.charPos = (int) (this.charPos + j12);
                j11 += j12;
            } else {
                j11 += currentStringRemainingChars;
                this.charPos = 0;
                this.stringListPos++;
            }
        }
        return j11;
    }

    private void checkState() {
        if (!this.closed) {
            if (this.frozen) {
                return;
            }
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
        throw new IOException("Stream already closed");
    }

    private String currentString() {
        if (this.stringListPos < this.strings.size()) {
            return this.strings.get(this.stringListPos);
        }
        return null;
    }

    private int currentStringRemainingChars() {
        String currentString = currentString();
        if (currentString == null) {
            return 0;
        }
        return currentString.length() - this.charPos;
    }

    public void addString(String str) {
        if (!this.frozen) {
            if (str.length() > 0) {
                this.strings.add(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to add string after reading");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        checkState();
        this.closed = true;
    }

    public void freeze() {
        if (!this.frozen) {
            this.frozen = true;
            return;
        }
        throw new IllegalStateException("Trying to freeze frozen StringListReader");
    }

    @Override // java.io.Reader
    public void mark(int i6) {
        checkState();
        this.markedCharPos = this.charPos;
        this.markedStringListPos = this.stringListPos;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        checkState();
        int remaining = charBuffer.remaining();
        String currentString = currentString();
        int i6 = 0;
        while (remaining > 0 && currentString != null) {
            int min = Math.min(currentString.length() - this.charPos, remaining);
            int i10 = this.charPos;
            charBuffer.put(this.strings.get(this.stringListPos), i10, i10 + min);
            remaining -= min;
            i6 += min;
            advance(min);
            currentString = currentString();
        }
        if (i6 > 0 || currentString != null) {
            return i6;
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() {
        checkState();
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        this.charPos = this.markedCharPos;
        this.stringListPos = this.markedStringListPos;
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        checkState();
        return advance(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.strings) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // java.io.Reader
    public int read() {
        checkState();
        String currentString = currentString();
        if (currentString == null) {
            return -1;
        }
        char charAt = currentString.charAt(this.charPos);
        advance(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i6, int i10) {
        checkState();
        String currentString = currentString();
        int i11 = 0;
        while (currentString != null && i11 < i10) {
            int min = Math.min(currentStringRemainingChars(), i10 - i11);
            int i12 = this.charPos;
            currentString.getChars(i12, i12 + min, cArr, i6 + i11);
            i11 += min;
            advance(min);
            currentString = currentString();
        }
        if (i11 > 0 || currentString != null) {
            return i11;
        }
        return -1;
    }
}
