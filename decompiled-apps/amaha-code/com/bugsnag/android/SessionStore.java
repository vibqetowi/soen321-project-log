package com.bugsnag.android;

import com.bugsnag.android.FileStore;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
/* loaded from: classes.dex */
class SessionStore extends FileStore {
    static final Comparator<File> SESSION_COMPARATOR = new Comparator<File>() { // from class: com.bugsnag.android.SessionStore.1
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return 1;
            }
            if (file2 == null) {
                return -1;
            }
            return file.getName().compareTo(file2.getName());
        }
    };

    public SessionStore(ImmutableConfig immutableConfig, Logger logger, FileStore.Delegate delegate) {
        super(new File(immutableConfig.getPersistenceDirectory().getValue(), "bugsnag-sessions"), immutableConfig.getMaxPersistedSessions(), SESSION_COMPARATOR, logger, delegate);
    }

    public Date getCreationDate(File file) {
        return new Date(SessionFilenameInfo.findTimestampInFilename(file));
    }

    @Override // com.bugsnag.android.FileStore
    public String getFilename(Object obj) {
        return SessionFilenameInfo.defaultFilename();
    }

    public boolean isTooOld(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (SessionFilenameInfo.findTimestampInFilename(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
