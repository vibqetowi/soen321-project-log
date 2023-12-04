package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes7.dex */
public class CrashlyticsReportPersistence {
    private static final String AQS_SESSION_ID_FILENAME = "app-quality-session-id";
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String REPORT_FILE_NAME = "report";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final SettingsProvider settingsProvider;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final int EVENT_NAME_LENGTH = 15;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
            return compareTo;
        }
    };
    private static final FilenameFilter EVENT_FILE_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda3
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith("event");
            return startsWith;
        }
    };

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.fileStore = fileStore;
        this.settingsProvider = settingsProvider;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            writeTextFile(this.fileStore.getSessionFile(identifier, REPORT_FILE_NAME), TRANSFORM.reportToJson(crashlyticsReport));
            writeTextFile(this.fileStore.getSessionFile(identifier, SESSION_START_TIMESTAMP_FILE_NAME), "", session.getStartedAt());
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not persist report for session " + identifier, e);
        }
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str) {
        persistEvent(event, str, false);
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            writeTextFile(this.fileStore.getSessionFile(str, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
            String appQualitySessionId = this.sessionsSubscriber.getAppQualitySessionId();
            if (appQualitySessionId == null) {
                Logger logger = Logger.getLogger();
                logger.w("Missing AQS session id for Crashlytics session " + str);
            } else {
                writeTextFile(this.fileStore.getSessionFile(str, AQS_SESSION_ID_FILENAME), appQualitySessionId);
            }
        } catch (IOException e) {
            Logger logger2 = Logger.getLogger();
            logger2.w("Could not persist event for session " + str, e);
        }
        trimEvents(str, i);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.fileStore.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.fileStore.getSessionFile(str, SESSION_START_TIMESTAMP_FILE_NAME).lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.fileStore.getReports().isEmpty() && this.fileStore.getPriorityReports().isEmpty() && this.fileStore.getNativeReports().isEmpty()) ? false : true;
    }

    public void deleteAllReports() {
        deleteFiles(this.fileStore.getReports());
        deleteFiles(this.fileStore.getPriorityReports());
        deleteFiles(this.fileStore.getNativeReports());
    }

    private void deleteFiles(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public void finalizeReports(String str, long j) {
        for (String str2 : capAndGetOpenSessions(str)) {
            Logger logger = Logger.getLogger();
            logger.v("Finalizing report for session " + str2);
            synthesizeReport(str2, j);
            this.fileStore.deleteSessionFiles(str2);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File sessionFile = this.fileStore.getSessionFile(str, REPORT_FILE_NAME);
        Logger logger = Logger.getLogger();
        logger.d("Writing native session report for " + str + " to file: " + sessionFile);
        synthesizeNativeReportFile(sessionFile, filesPayload, str, applicationExitInfo);
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : allFinalizedReportFiles) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(file)), file.getName(), file));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.w("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    private SortedSet<String> capAndGetOpenSessions(String str) {
        this.fileStore.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            String last = openSessionIds.last();
            Logger logger = Logger.getLogger();
            logger.d("Removing session over cap: " + last);
            this.fileStore.deleteSessionFiles(last);
            openSessionIds.remove(last);
        }
        return openSessionIds;
    }

    private void capFinalizedReports() {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size <= i) {
            return;
        }
        for (File file : allFinalizedReportFiles.subList(i, size)) {
            file.delete();
        }
    }

    private List<File> getAllFinalizedReportFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.fileStore.getPriorityReports());
        arrayList.addAll(this.fileStore.getNativeReports());
        Comparator<? super File> comparator = LATEST_SESSION_ID_FIRST_COMPARATOR;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.fileStore.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    private void synthesizeReport(String str, long j) {
        boolean z;
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, EVENT_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : sessionFiles) {
                try {
                    arrayList.add(TRANSFORM.eventFromJson(readTextFile(file)));
                } catch (IOException e) {
                    Logger.getLogger().w("Could not add event to report for " + file, e);
                }
                if (z || isHighPriorityEventFile(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger.getLogger().w("Could not parse event files for session " + str);
            return;
        }
        synthesizeReportFile(this.fileStore.getSessionFile(str, REPORT_FILE_NAME), arrayList, j, z, UserMetadata.readUserId(str, this.fileStore), tryReadTextFile(this.fileStore.getSessionFile(str, AQS_SESSION_ID_FILENAME)));
    }

    private void synthesizeNativeReportFile(File file, CrashlyticsReport.FilesPayload filesPayload, String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            writeTextFile(this.fileStore.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.w("Could not synthesize final native report file for " + file, e);
        }
    }

    private void synthesizeReportFile(File file, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str, String str2) {
        File report;
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            CrashlyticsReport withEvents = crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session == null) {
                return;
            }
            Logger logger = Logger.getLogger();
            logger.d("appQualitySessionId: " + str2);
            if (z) {
                report = this.fileStore.getPriorityReport(session.getIdentifier());
            } else {
                report = this.fileStore.getReport(session.getIdentifier());
            }
            writeTextFile(report, crashlyticsReportJsonTransform.reportToJson(withEvents));
        } catch (IOException e) {
            Logger logger2 = Logger.getLogger();
            logger2.w("Could not synthesize final report file for " + file, e);
        }
    }

    private static boolean isHighPriorityEventFile(String str) {
        return str.startsWith("event") && str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(File file, String str) {
        return str.startsWith("event") && !str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    private static String generateEventFilename(int i, boolean z) {
        String format = String.format(Locale.US, EVENT_COUNTER_FORMAT, Integer.valueOf(i));
        String str = z ? PRIORITY_EVENT_SUFFIX : "";
        return "event" + format + str;
    }

    private int trimEvents(String str, int i) {
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean isNormalPriorityEventFile;
                isNormalPriorityEventFile = CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str2);
                return isNormalPriorityEventFile;
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int oldestEventFileFirst;
                oldestEventFileFirst = CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
                return oldestEventFileFirst;
            }
        });
        return capFilesCount(sessionFiles, i);
    }

    private static String getEventNameWithoutPriority(String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oldestEventFileFirst(File file, File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String readTextFile(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static String tryReadTextFile(File file) {
        try {
            return readTextFile(file);
        } catch (IOException unused) {
            return null;
        }
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            FileStore.recursiveDelete(file);
            size--;
        }
        return size;
    }
}
