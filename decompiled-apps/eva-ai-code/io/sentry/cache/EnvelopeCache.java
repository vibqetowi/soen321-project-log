package io.sentry.cache;

import io.sentry.DateUtils;
import io.sentry.ISerializer;
import io.sentry.SentryCrashLastRunState;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.SessionEnd;
import io.sentry.hints.SessionStart;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
/* loaded from: classes4.dex */
public final class EnvelopeCache extends CacheStrategy implements IEnvelopeCache {
    public static final String CRASH_MARKER_FILE = "last_crash";
    public static final String NATIVE_CRASH_MARKER_FILE = ".sentry-native/last_crash";
    public static final String PREFIX_CURRENT_SESSION_FILE = "session";
    static final String SUFFIX_CURRENT_SESSION_FILE = ".json";
    public static final String SUFFIX_ENVELOPE_FILE = ".envelope";
    private final Map<SentryEnvelope, String> fileNameMap;

    @Override // io.sentry.cache.IEnvelopeCache
    public /* synthetic */ void store(SentryEnvelope sentryEnvelope) {
        store(sentryEnvelope, null);
    }

    public static IEnvelopeCache create(SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        int maxCacheItems = sentryOptions.getMaxCacheItems();
        if (cacheDirPath == null) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "maxCacheItems is null, returning NoOpEnvelopeCache", new Object[0]);
            return NoOpEnvelopeCache.getInstance();
        }
        return new EnvelopeCache(sentryOptions, cacheDirPath, maxCacheItems);
    }

    private EnvelopeCache(SentryOptions sentryOptions, String str, int i) {
        super(sentryOptions, str, i);
        this.fileNameMap = new WeakHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // io.sentry.cache.IEnvelopeCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void store(SentryEnvelope sentryEnvelope, Object obj) {
        File envelopeFile;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
        rotateCacheIfNeeded(allEnvelopeFiles());
        File currentSessionFile = getCurrentSessionFile();
        if ((obj instanceof SessionEnd) && !currentSessionFile.delete()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (obj instanceof SessionStart) {
            if (currentSessionFile.exists()) {
                ?? r6 = "Current session is not ended, we'd need to end it.";
                this.options.getLogger().log(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(currentSessionFile), UTF_8));
                        try {
                            Session session = (Session) this.serializer.deserialize(bufferedReader, Session.class);
                            if (session == null) {
                                this.options.getLogger().log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", currentSessionFile.getAbsolutePath());
                                z4 = false;
                            } else {
                                File file = new File(this.options.getCacheDirPath(), NATIVE_CRASH_MARKER_FILE);
                                Date date = null;
                                if (file.exists()) {
                                    this.options.getLogger().log(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                                    Date timestampFromCrashMarkerFile = getTimestampFromCrashMarkerFile(file);
                                    try {
                                        if (!file.delete()) {
                                            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                                        }
                                        session.update(Session.State.Crashed, null, true);
                                        z3 = true;
                                        date = timestampFromCrashMarkerFile;
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedReader.close();
                                        throw th;
                                    }
                                } else {
                                    z3 = false;
                                }
                                try {
                                    session.end(date);
                                    SentryEnvelope from = SentryEnvelope.from(this.serializer, session, this.options.getSdkVersion());
                                    writeEnvelopeToDisk(getEnvelopeFile(from), from);
                                    z4 = z3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader.close();
                                    throw th;
                                }
                            }
                            bufferedReader.close();
                            z2 = z4;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        this.options.getLogger().log(SentryLevel.ERROR, "Error processing session.", th);
                        z2 = r6;
                        z = z2;
                        if (!currentSessionFile.delete()) {
                        }
                        updateCurrentSession(currentSessionFile, sentryEnvelope);
                        boolean z5 = z;
                        if (!z) {
                        }
                        SentryCrashLastRunState.getInstance().setCrashedLastRun(z5);
                        envelopeFile = getEnvelopeFile(sentryEnvelope);
                        if (envelopeFile.exists()) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r6 = 0;
                    this.options.getLogger().log(SentryLevel.ERROR, "Error processing session.", th);
                    z2 = r6;
                    z = z2;
                    if (!currentSessionFile.delete()) {
                    }
                    updateCurrentSession(currentSessionFile, sentryEnvelope);
                    boolean z52 = z;
                    if (!z) {
                    }
                    SentryCrashLastRunState.getInstance().setCrashedLastRun(z52);
                    envelopeFile = getEnvelopeFile(sentryEnvelope);
                    if (envelopeFile.exists()) {
                    }
                }
                z = z2;
                if (!currentSessionFile.delete()) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to delete the current session file.", new Object[0]);
                    z = z2;
                }
            } else {
                z = false;
            }
            updateCurrentSession(currentSessionFile, sentryEnvelope);
            boolean z522 = z;
            if (!z) {
                File file2 = new File(this.options.getCacheDirPath(), CRASH_MARKER_FILE);
                z522 = z;
                if (file2.exists()) {
                    this.options.getLogger().log(SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file2.delete()) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                    }
                    z522 = true;
                }
            }
            SentryCrashLastRunState.getInstance().setCrashedLastRun(z522);
        }
        envelopeFile = getEnvelopeFile(sentryEnvelope);
        if (envelopeFile.exists()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", envelopeFile.getAbsolutePath());
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Adding Envelope to offline storage: %s", envelopeFile.getAbsolutePath());
        writeEnvelopeToDisk(envelopeFile, sentryEnvelope);
        if (obj instanceof DiskFlushNotification) {
            writeCrashMarkerFile();
        }
    }

    private void writeCrashMarkerFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.options.getCacheDirPath(), CRASH_MARKER_FILE));
            fileOutputStream.write(DateUtils.getTimestamp(DateUtils.getCurrentDateTime()).getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error writing the crash marker file to the disk", th);
        }
    }

    private Date getTimestampFromCrashMarkerFile(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8));
            String readLine = bufferedReader.readLine();
            this.options.getLogger().log(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date dateTime = DateUtils.getDateTime(readLine);
            bufferedReader.close();
            return dateTime;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    private void updateCurrentSession(File file, SentryEnvelope sentryEnvelope) {
        Iterable<SentryEnvelopeItem> items = sentryEnvelope.getItems();
        if (items.iterator().hasNext()) {
            SentryEnvelopeItem next = items.iterator().next();
            if (SentryItemType.Session.equals(next.getHeader().getType())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.getData()), UTF_8));
                    Session session = (Session) this.serializer.deserialize(bufferedReader, Session.class);
                    if (session == null) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Item of type %s returned null by the parser.", next.getHeader().getType());
                    } else {
                        writeSessionToDisk(file, session);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Item failed to process.", th);
                    return;
                }
            }
            this.options.getLogger().log(SentryLevel.INFO, "Current envelope has a different envelope type %s", next.getHeader().getType());
            return;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Current envelope %s is empty", file.getAbsolutePath());
    }

    private void writeEnvelopeToDisk(File file, SentryEnvelope sentryEnvelope) {
        if (file.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.serializer.serialize(sentryEnvelope, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    private void writeSessionToDisk(File file, Session session) {
        if (file.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", session.getSessionId());
            if (!file.delete()) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
            try {
                this.serializer.serialize((ISerializer) session, (Writer) bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.options.getLogger().log(SentryLevel.ERROR, th3, "Error writing Session to offline storage: %s", session.getSessionId());
        }
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void discard(SentryEnvelope sentryEnvelope) {
        Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
        File envelopeFile = getEnvelopeFile(sentryEnvelope);
        if (envelopeFile.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Discarding envelope from cache: %s", envelopeFile.getAbsolutePath());
            if (envelopeFile.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete envelope: %s", envelopeFile.getAbsolutePath());
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Envelope was not cached: %s", envelopeFile.getAbsolutePath());
    }

    private synchronized File getEnvelopeFile(SentryEnvelope sentryEnvelope) {
        String uuid;
        String str;
        if (this.fileNameMap.containsKey(sentryEnvelope)) {
            str = this.fileNameMap.get(sentryEnvelope);
        } else {
            if (sentryEnvelope.getHeader().getEventId() != null) {
                uuid = sentryEnvelope.getHeader().getEventId().toString();
            } else {
                uuid = UUID.randomUUID().toString();
            }
            String str2 = uuid + SUFFIX_ENVELOPE_FILE;
            this.fileNameMap.put(sentryEnvelope, str2);
            str = str2;
        }
        return new File(this.directory.getAbsolutePath(), str);
    }

    private File getCurrentSessionFile() {
        return new File(this.directory.getAbsolutePath(), "session.json");
    }

    @Override // java.lang.Iterable
    public Iterator<SentryEnvelope> iterator() {
        File[] allEnvelopeFiles = allEnvelopeFiles();
        ArrayList arrayList = new ArrayList(allEnvelopeFiles.length);
        for (File file : allEnvelopeFiles) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.serializer.deserializeEnvelope(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            } catch (FileNotFoundException unused) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                this.options.getLogger().log(SentryLevel.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e);
            }
        }
        return arrayList.iterator();
    }

    private File[] allEnvelopeFiles() {
        File[] listFiles;
        return (!isDirectoryValid() || (listFiles = this.directory.listFiles(new FilenameFilter() { // from class: io.sentry.cache.EnvelopeCache$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
                return endsWith;
            }
        })) == null) ? new File[0] : listFiles;
    }
}
