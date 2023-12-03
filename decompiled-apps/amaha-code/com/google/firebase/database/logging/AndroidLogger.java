package com.google.firebase.database.logging;

import android.util.Log;
import com.google.firebase.database.logging.Logger;
import java.util.List;
/* loaded from: classes.dex */
public class AndroidLogger extends DefaultLogger {
    public AndroidLogger(Logger.Level level, List<String> list) {
        super(level, list);
    }

    @Override // com.google.firebase.database.logging.DefaultLogger
    public void debug(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.google.firebase.database.logging.DefaultLogger
    public void error(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.firebase.database.logging.DefaultLogger
    public void info(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.firebase.database.logging.DefaultLogger
    public void warn(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.google.firebase.database.logging.DefaultLogger
    public String buildLogMessage(Logger.Level level, String str, String str2, long j10) {
        return str2;
    }
}
