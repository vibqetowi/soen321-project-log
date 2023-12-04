package com.google.api.client.testing.util;

import com.google.api.client.util.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
/* loaded from: classes7.dex */
public class LogRecordingHandler extends Handler {
    private final List<LogRecord> records = Lists.newArrayList();

    @Override // java.util.logging.Handler
    public void close() throws SecurityException {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        this.records.add(logRecord);
    }

    public List<String> messages() {
        ArrayList newArrayList = Lists.newArrayList();
        for (LogRecord logRecord : this.records) {
            newArrayList.add(logRecord.getMessage());
        }
        return newArrayList;
    }
}
