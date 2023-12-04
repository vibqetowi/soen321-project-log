package coil.disk;

import coil.util.FileSystems;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.DiskFileUpload;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001\u0014\b\u0000\u0018\u0000 C2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004CDEFB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0016J\u001c\u0010)\u001a\u00020'2\n\u0010*\u001a\u00060+R\u00020\u00002\u0006\u0010,\u001a\u00020\u0013H\u0002J\b\u0010-\u001a\u00020'H\u0002J\u0014\u0010.\u001a\b\u0018\u00010+R\u00020\u00002\u0006\u0010/\u001a\u00020\u001fJ\u0006\u00100\u001a\u00020'J\b\u00101\u001a\u00020'H\u0016J\u0017\u00102\u001a\b\u0018\u000103R\u00020\u00002\u0006\u0010/\u001a\u00020\u001fH\u0086\u0002J\u0006\u00104\u001a\u00020'J\b\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020'H\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020'H\u0002J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u001fH\u0002J\u000e\u0010<\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u001fJ\u0014\u0010=\u001a\u00020\u00132\n\u0010>\u001a\u00060 R\u00020\u0000H\u0002J\b\u0010?\u001a\u00020\u0013H\u0002J\u0006\u0010%\u001a\u00020\u000bJ\b\u0010@\u001a\u00020'H\u0002J\u0010\u0010A\u001a\u00020'2\u0006\u0010/\u001a\u00020\u001fH\u0002J\b\u0010B\u001a\u00020'H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u001f\u0012\b\u0012\u00060 R\u00020\u00000\u001ej\u0012\u0012\u0004\u0012\u00020\u001f\u0012\b\u0012\u00060 R\u00020\u0000`!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcoil/disk/DiskLruCache;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokio/FileSystem;", "directory", "Lokio/Path;", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "maxSize", "", "appVersion", "", "valueCount", "(Lokio/FileSystem;Lokio/Path;Lkotlinx/coroutines/CoroutineDispatcher;JII)V", "cleanupScope", "Lkotlinx/coroutines/CoroutineScope;", "closed", "", "coil/disk/DiskLruCache$fileSystem$1", "Lcoil/disk/DiskLruCache$fileSystem$1;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lcoil/disk/DiskLruCache$Entry;", "Lkotlin/collections/LinkedHashMap;", "mostRecentRebuildFailed", "mostRecentTrimFailed", "operationsSinceRewrite", "size", "checkNotClosed", "", "close", "completeEdit", "editor", "Lcoil/disk/DiskLruCache$Editor;", "success", "delete", "edit", "key", "evictAll", "flush", "get", "Lcoil/disk/DiskLruCache$Snapshot;", "initialize", "journalRewriteRequired", "launchCleanup", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "remove", "removeEntry", "entry", "removeOldestEntry", "trimToSize", "validateKey", "writeJournal", "Companion", "Editor", "Entry", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    public static final String VERSION = "1";
    private final int appVersion;
    private final CoroutineScope cleanupScope;
    private boolean closed;
    private final Path directory;
    private final DiskLruCache$fileSystem$1 fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final Path journalFile;
    private final Path journalFileBackup;
    private final Path journalFileTmp;
    private BufferedSink journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private final long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private int operationsSinceRewrite;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    private static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");

    /* JADX WARN: Type inference failed for: r4v11, types: [coil.disk.DiskLruCache$fileSystem$1] */
    public DiskLruCache(final FileSystem fileSystem, Path path, CoroutineDispatcher coroutineDispatcher, long j, int i, int i2) {
        this.directory = path;
        this.maxSize = j;
        this.appVersion = i;
        this.valueCount = i2;
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = path.resolve(JOURNAL_FILE);
        this.journalFileTmp = path.resolve(JOURNAL_FILE_TMP);
        this.journalFileBackup = path.resolve(JOURNAL_FILE_BACKUP);
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.fileSystem = new ForwardingFileSystem(fileSystem) { // from class: coil.disk.DiskLruCache$fileSystem$1
            @Override // okio.ForwardingFileSystem, okio.FileSystem
            public Sink sink(Path path2, boolean z) {
                Path parent = path2.parent();
                if (parent != null) {
                    createDirectories(parent);
                }
                return super.sink(path2, z);
            }
        };
    }

    public final synchronized void initialize() {
        if (this.initialized) {
            return;
        }
        delete(this.journalFileTmp);
        if (exists(this.journalFileBackup)) {
            if (exists(this.journalFile)) {
                delete(this.journalFileBackup);
            } else {
                atomicMove(this.journalFileBackup, this.journalFile);
            }
        }
        if (exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException unused) {
                delete();
                this.closed = false;
            }
        }
        writeJournal();
        this.initialized = true;
    }

    private final void readJournal() {
        Unit unit;
        BufferedSource buffer = Okio.buffer(source(this.journalFile));
        Throwable th = null;
        try {
            BufferedSource bufferedSource = buffer;
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            String readUtf8LineStrict2 = bufferedSource.readUtf8LineStrict();
            String readUtf8LineStrict3 = bufferedSource.readUtf8LineStrict();
            String readUtf8LineStrict4 = bufferedSource.readUtf8LineStrict();
            String readUtf8LineStrict5 = bufferedSource.readUtf8LineStrict();
            if (Intrinsics.areEqual(MAGIC, readUtf8LineStrict) && Intrinsics.areEqual("1", readUtf8LineStrict2) && Intrinsics.areEqual(String.valueOf(this.appVersion), readUtf8LineStrict3) && Intrinsics.areEqual(String.valueOf(this.valueCount), readUtf8LineStrict4)) {
                int i = 0;
                if (!(readUtf8LineStrict5.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(bufferedSource.readUtf8LineStrict());
                            i++;
                        } catch (EOFException unused) {
                            this.operationsSinceRewrite = i - this.lruEntries.size();
                            if (!bufferedSource.exhausted()) {
                                writeJournal();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            unit = Unit.INSTANCE;
                            if (buffer != null) {
                                try {
                                    buffer.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            Intrinsics.checkNotNull(unit);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict3 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + AbstractJsonLexerKt.END_LIST);
        } catch (Throwable th3) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            unit = null;
        }
    }

    private final BufferedSink newJournalWriter() {
        return Okio.buffer(new FaultHidingSink(appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void readJournalLine(String str) {
        String substring;
        String str2 = str;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, ' ', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, ' ', i, false, 4, (Object) null);
        if (indexOf$default2 == -1) {
            substring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (indexOf$default == 6 && StringsKt.startsWith$default(str, REMOVE, false, 2, (Object) null)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap<String, Entry> linkedHashMap = this.lruEntries;
        Entry entry = linkedHashMap.get(substring);
        if (entry == null) {
            entry = new Entry(substring);
            linkedHashMap.put(substring, entry);
        }
        Entry entry2 = entry;
        if (indexOf$default2 != -1 && indexOf$default == 5 && StringsKt.startsWith$default(str, CLEAN, false, 2, (Object) null)) {
            String substring2 = str.substring(indexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            List<String> split$default = StringsKt.split$default((CharSequence) substring2, new char[]{' '}, false, 0, 6, (Object) null);
            entry2.setReadable(true);
            entry2.setCurrentEditor(null);
            entry2.setLengths(split$default);
        } else if (indexOf$default2 == -1 && indexOf$default == 5 && StringsKt.startsWith$default(str, DIRTY, false, 2, (Object) null)) {
            entry2.setCurrentEditor(new Editor(entry2));
        } else if (indexOf$default2 == -1 && indexOf$default == 4 && StringsKt.startsWith$default(str, READ, false, 2, (Object) null)) {
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private final void processJournal() {
        Iterator<Entry> it = this.lruEntries.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    j += next.getLengths()[i];
                    i++;
                }
            } else {
                next.setCurrentEditor(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    delete(next.getCleanFiles().get(i));
                    delete(next.getDirtyFiles().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.size = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void writeJournal() {
        BufferedSink bufferedSink = this.journalWriter;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink buffer = Okio.buffer(sink(this.journalFileTmp, false));
        Throwable th = null;
        BufferedSink bufferedSink2 = buffer;
        bufferedSink2.writeUtf8(MAGIC).writeByte(10);
        bufferedSink2.writeUtf8("1").writeByte(10);
        bufferedSink2.writeDecimalLong(this.appVersion).writeByte(10);
        bufferedSink2.writeDecimalLong(this.valueCount).writeByte(10);
        bufferedSink2.writeByte(10);
        for (Entry entry : this.lruEntries.values()) {
            if (entry.getCurrentEditor() != null) {
                bufferedSink2.writeUtf8(DIRTY);
                bufferedSink2.writeByte(32);
                bufferedSink2.writeUtf8(entry.getKey());
                bufferedSink2.writeByte(10);
            } else {
                bufferedSink2.writeUtf8(CLEAN);
                bufferedSink2.writeByte(32);
                bufferedSink2.writeUtf8(entry.getKey());
                entry.writeLengths(bufferedSink2);
                bufferedSink2.writeByte(10);
            }
        }
        Unit unit = Unit.INSTANCE;
        if (buffer != null) {
            try {
                buffer.close();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(unit);
        if (exists(this.journalFile)) {
            atomicMove(this.journalFile, this.journalFileBackup);
            atomicMove(this.journalFileTmp, this.journalFile);
            delete(this.journalFileBackup);
        } else {
            atomicMove(this.journalFileTmp, this.journalFile);
        }
        this.journalWriter = newJournalWriter();
        this.operationsSinceRewrite = 0;
        this.hasJournalErrors = false;
        this.mostRecentRebuildFailed = false;
    }

    public final synchronized Snapshot get(String str) {
        Snapshot snapshot;
        checkNotClosed();
        validateKey(str);
        initialize();
        Entry entry = this.lruEntries.get(str);
        if (entry != null && (snapshot = entry.snapshot()) != null) {
            this.operationsSinceRewrite++;
            BufferedSink bufferedSink = this.journalWriter;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(READ);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            if (journalRewriteRequired()) {
                launchCleanup();
            }
            return snapshot;
        }
        return null;
    }

    public final synchronized Editor edit(String str) {
        checkNotClosed();
        validateKey(str);
        initialize();
        Entry entry = this.lruEntries.get(str);
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry == null || entry.getLockingSnapshotCount() == 0) {
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                BufferedSink bufferedSink = this.journalWriter;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                }
                Editor editor = new Editor(entry);
                entry.setCurrentEditor(editor);
                return editor;
            }
            launchCleanup();
            return null;
        }
        return null;
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void completeEdit(Editor editor, boolean z) {
        Entry entry = editor.getEntry();
        if (!Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i = 0;
        if (z && !entry.getZombie()) {
            int i2 = this.valueCount;
            for (int i3 = 0; i3 < i2; i3++) {
                if (editor.getWritten()[i3] && !exists(entry.getDirtyFiles().get(i3))) {
                    editor.abort();
                    return;
                }
            }
            int i4 = this.valueCount;
            while (i < i4) {
                Path path = entry.getDirtyFiles().get(i);
                Path path2 = entry.getCleanFiles().get(i);
                if (exists(path)) {
                    atomicMove(path, path2);
                } else {
                    FileSystems.createFile(this.fileSystem, entry.getCleanFiles().get(i));
                }
                long j = entry.getLengths()[i];
                Long size = metadata(path2).getSize();
                long longValue = size != null ? size.longValue() : 0L;
                entry.getLengths()[i] = longValue;
                this.size = (this.size - j) + longValue;
                i++;
            }
        } else {
            int i5 = this.valueCount;
            while (i < i5) {
                delete(entry.getDirtyFiles().get(i));
                i++;
            }
        }
        entry.setCurrentEditor(null);
        if (entry.getZombie()) {
            removeEntry(entry);
            return;
        }
        this.operationsSinceRewrite++;
        BufferedSink bufferedSink = this.journalWriter;
        Intrinsics.checkNotNull(bufferedSink);
        if (!z && !entry.getReadable()) {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8(REMOVE);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (this.size <= this.maxSize || journalRewriteRequired()) {
                launchCleanup();
            }
        }
        entry.setReadable(true);
        bufferedSink.writeUtf8(CLEAN);
        bufferedSink.writeByte(32);
        bufferedSink.writeUtf8(entry.getKey());
        entry.writeLengths(bufferedSink);
        bufferedSink.writeByte(10);
        bufferedSink.flush();
        if (this.size <= this.maxSize) {
        }
        launchCleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRewriteRequired() {
        return this.operationsSinceRewrite >= 2000;
    }

    public final synchronized boolean remove(String str) {
        checkNotClosed();
        validateKey(str);
        initialize();
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeEntry(Entry entry) {
        BufferedSink bufferedSink;
        if (entry.getLockingSnapshotCount() > 0 && (bufferedSink = this.journalWriter) != null) {
            bufferedSink.writeUtf8(DIRTY);
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.setZombie(true);
            return true;
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            delete(entry.getCleanFiles().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.operationsSinceRewrite++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRewriteRequired()) {
            launchCleanup();
        }
        return true;
    }

    private final void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.initialized && !this.closed) {
            for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[0])) {
                Editor currentEditor = entry.getCurrentEditor();
                if (currentEditor != null) {
                    currentEditor.detach();
                }
            }
            trimToSize();
            CoroutineScopeKt.cancel$default(this.cleanupScope, null, 1, null);
            BufferedSink bufferedSink = this.journalWriter;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie()) {
                removeEntry(entry);
                return true;
            }
        }
        return false;
    }

    private final void delete() {
        close();
        FileSystems.deleteContents(this.fileSystem, this.directory);
    }

    public final synchronized void evictAll() {
        initialize();
        for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[0])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    private final void launchCleanup() {
        BuildersKt__Builders_commonKt.launch$default(this.cleanupScope, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0003\u001a\u00060\u0004R\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcoil/disk/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "entry", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "closed", "", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "close", "", "closeAndEdit", "Lcoil/disk/DiskLruCache$Editor;", ShareInternalUtility.STAGING_PARAM, "Lokio/Path;", FirebaseAnalytics.Param.INDEX, "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Snapshot implements Closeable {
        private boolean closed;
        private final Entry entry;

        public Snapshot(Entry entry) {
            this.entry = entry;
        }

        public final Entry getEntry() {
            return this.entry;
        }

        public final Path file(int i) {
            if (!(!this.closed)) {
                throw new IllegalStateException("snapshot is closed".toString());
            }
            return this.entry.getCleanFiles().get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                Entry entry = this.entry;
                entry.setLockingSnapshotCount(entry.getLockingSnapshotCount() - 1);
                if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                    diskLruCache.removeEntry(this.entry);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public final Editor closeAndEdit() {
            Editor edit;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                edit = diskLruCache.edit(this.entry.getKey());
            }
            return edit;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcoil/disk/DiskLruCache$Editor;", "", "entry", "Lcoil/disk/DiskLruCache$Entry;", "Lcoil/disk/DiskLruCache;", "(Lcoil/disk/DiskLruCache;Lcoil/disk/DiskLruCache$Entry;)V", "closed", "", "getEntry", "()Lcoil/disk/DiskLruCache$Entry;", "written", "", "getWritten", "()[Z", "abort", "", "commit", "commitAndGet", "Lcoil/disk/DiskLruCache$Snapshot;", "complete", "success", "detach", ShareInternalUtility.STAGING_PARAM, "Lokio/Path;", FirebaseAnalytics.Param.INDEX, "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Editor {
        private boolean closed;
        private final Entry entry;
        private final boolean[] written;

        public Editor(Entry entry) {
            this.entry = entry;
            this.written = new boolean[DiskLruCache.this.valueCount];
        }

        public final Entry getEntry() {
            return this.entry;
        }

        public final boolean[] getWritten() {
            return this.written;
        }

        public final Path file(int i) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.written[i] = true;
                Path path2 = this.entry.getDirtyFiles().get(i);
                FileSystems.createFile(diskLruCache.fileSystem, path2);
                path = path2;
            }
            return path;
        }

        public final void detach() {
            if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                this.entry.setZombie(true);
            }
        }

        public final void commit() {
            complete(true);
        }

        public final Snapshot commitAndGet() {
            Snapshot snapshot;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                commit();
                snapshot = diskLruCache.get(this.entry.getKey());
            }
            return snapshot;
        }

        public final void abort() {
            complete(false);
        }

        private final void complete(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!(!this.closed)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit(this, z);
                }
                this.closed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,J\f\u0010-\u001a\b\u0018\u00010.R\u00020\rJ\u000e\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u00062"}, d2 = {"Lcoil/disk/DiskLruCache$Entry;", "", "key", "", "(Lcoil/disk/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", "Ljava/util/ArrayList;", "Lokio/Path;", "Lkotlin/collections/ArrayList;", "getCleanFiles", "()Ljava/util/ArrayList;", "currentEditor", "Lcoil/disk/DiskLruCache$Editor;", "Lcoil/disk/DiskLruCache;", "getCurrentEditor", "()Lcoil/disk/DiskLruCache$Editor;", "setCurrentEditor", "(Lcoil/disk/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles", "getKey", "()Ljava/lang/String;", "lengths", "", "getLengths", "()[J", "lockingSnapshotCount", "", "getLockingSnapshotCount", "()I", "setLockingSnapshotCount", "(I)V", "readable", "", "getReadable", "()Z", "setReadable", "(Z)V", "zombie", "getZombie", "setZombie", "setLengths", "", "strings", "", "snapshot", "Lcoil/disk/DiskLruCache$Snapshot;", "writeLengths", "writer", "Lokio/BufferedSink;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Entry {
        private final ArrayList<Path> cleanFiles;
        private Editor currentEditor;
        private final ArrayList<Path> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSnapshotCount;
        private boolean readable;
        private boolean zombie;

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            this.dirtyFiles = new ArrayList<>(DiskLruCache.this.valueCount);
            StringBuilder sb = new StringBuilder(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            int length = sb.length();
            int i = DiskLruCache.this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.cleanFiles.add(DiskLruCache.this.directory.resolve(sb.toString()));
                sb.append(DiskFileUpload.postfix);
                this.dirtyFiles.add(DiskLruCache.this.directory.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        public final String getKey() {
            return this.key;
        }

        public final long[] getLengths() {
            return this.lengths;
        }

        public final ArrayList<Path> getCleanFiles() {
            return this.cleanFiles;
        }

        public final ArrayList<Path> getDirtyFiles() {
            return this.dirtyFiles;
        }

        public final boolean getReadable() {
            return this.readable;
        }

        public final void setReadable(boolean z) {
            this.readable = z;
        }

        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setZombie(boolean z) {
            this.zombie = z;
        }

        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final void setCurrentEditor(Editor editor) {
            this.currentEditor = editor;
        }

        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        public final void setLockingSnapshotCount(int i) {
            this.lockingSnapshotCount = i;
        }

        public final void setLengths(List<String> list) {
            if (list.size() != DiskLruCache.this.valueCount) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(list.get(i));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void writeLengths(BufferedSink bufferedSink) {
            for (long j : this.lengths) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }

        public final Snapshot snapshot() {
            if (this.readable && this.currentEditor == null && !this.zombie) {
                ArrayList<Path> arrayList = this.cleanFiles;
                DiskLruCache diskLruCache = DiskLruCache.this;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!diskLruCache.fileSystem.exists(arrayList.get(i))) {
                        try {
                            diskLruCache.removeEntry(this);
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                }
                this.lockingSnapshotCount++;
                return new Snapshot(this);
            }
            return null;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcoil/disk/DiskLruCache$Companion;", "", "()V", DiskLruCache.CLEAN, "", DiskLruCache.DIRTY, "JOURNAL_FILE", "getJOURNAL_FILE$coil_base_release$annotations", "JOURNAL_FILE_BACKUP", "getJOURNAL_FILE_BACKUP$coil_base_release$annotations", "JOURNAL_FILE_TMP", "getJOURNAL_FILE_TMP$coil_base_release$annotations", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "getMAGIC$coil_base_release$annotations", DiskLruCache.READ, DiskLruCache.REMOVE, "VERSION", "getVERSION$coil_base_release$annotations", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getJOURNAL_FILE$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_BACKUP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getJOURNAL_FILE_TMP$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getMAGIC$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getVERSION$coil_base_release$annotations() {
        }

        private Companion() {
        }
    }
}
