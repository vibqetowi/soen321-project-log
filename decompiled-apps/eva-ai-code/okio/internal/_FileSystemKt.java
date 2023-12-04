package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.apache.http.cookie.ClientCookie;
/* compiled from: -FileSystem.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", ClientCookie.PATH_ATTR, "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", TypedValues.AttributesType.S_TARGET, "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _FileSystemKt {
    public static final FileMetadata commonMetadata(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final boolean commonExists(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final void commonCreateDirectories(FileSystem fileSystem, Path dir, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Path path = dir; path != null && !fileSystem.exists(path); path = path.parent()) {
            arrayDeque.addFirst(path);
        }
        if (z && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(FileSystem fileSystem, Path fileOrDirectory, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = SequencesKt.sequence(new _FileSystemKt$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z && !it.hasNext());
        }
    }

    public static final Sequence<Path> commonListRecursively(FileSystem fileSystem, Path dir, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt.sequence(new _FileSystemKt$commonListRecursively$1(dir, fileSystem, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r0 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (r14 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r13 = r12;
        r12 = r11;
        r11 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
        r11 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(SequenceScope<? super Path> sequenceScope, FileSystem fileSystem, ArrayDeque<Path> arrayDeque, Path path, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        _FileSystemKt$collectRecursively$1 _filesystemkt_collectrecursively_1;
        int i;
        FileSystem fileSystem2;
        ArrayDeque<Path> arrayDeque2;
        boolean z3;
        SequenceScope<? super Path> sequenceScope2;
        boolean z4;
        FileSystem fileSystem3;
        List<Path> listOrNull;
        Path path2 = path;
        boolean z5 = z2;
        if (continuation instanceof _FileSystemKt$collectRecursively$1) {
            _filesystemkt_collectrecursively_1 = (_FileSystemKt$collectRecursively$1) continuation;
            if ((_filesystemkt_collectrecursively_1.label & Integer.MIN_VALUE) != 0) {
                _filesystemkt_collectrecursively_1.label -= Integer.MIN_VALUE;
                Object obj = _filesystemkt_collectrecursively_1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = _filesystemkt_collectrecursively_1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z5) {
                        fileSystem2 = fileSystem;
                        arrayDeque2 = arrayDeque;
                        z3 = z;
                    } else {
                        _filesystemkt_collectrecursively_1.L$0 = sequenceScope;
                        fileSystem2 = fileSystem;
                        _filesystemkt_collectrecursively_1.L$1 = fileSystem2;
                        arrayDeque2 = arrayDeque;
                        _filesystemkt_collectrecursively_1.L$2 = arrayDeque2;
                        _filesystemkt_collectrecursively_1.L$3 = path2;
                        z3 = z;
                        _filesystemkt_collectrecursively_1.Z$0 = z3;
                        _filesystemkt_collectrecursively_1.Z$1 = z5;
                        _filesystemkt_collectrecursively_1.label = 1;
                        if (sequenceScope.yield(path2, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    sequenceScope2 = sequenceScope;
                    z4 = z3;
                    fileSystem3 = fileSystem2;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z6 = _filesystemkt_collectrecursively_1.Z$1;
                    boolean z7 = _filesystemkt_collectrecursively_1.Z$0;
                    Iterator<Path> it = (Iterator) _filesystemkt_collectrecursively_1.L$4;
                    Path path3 = (Path) _filesystemkt_collectrecursively_1.L$3;
                    ArrayDeque<Path> arrayDeque3 = (ArrayDeque) _filesystemkt_collectrecursively_1.L$2;
                    FileSystem fileSystem4 = (FileSystem) _filesystemkt_collectrecursively_1.L$1;
                    SequenceScope<? super Path> sequenceScope3 = (SequenceScope) _filesystemkt_collectrecursively_1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            Path next = it.next();
                            boolean z8 = z6;
                            _filesystemkt_collectrecursively_1.L$0 = sequenceScope3;
                            _filesystemkt_collectrecursively_1.L$1 = fileSystem4;
                            _filesystemkt_collectrecursively_1.L$2 = arrayDeque3;
                            _filesystemkt_collectrecursively_1.L$3 = path3;
                            _filesystemkt_collectrecursively_1.L$4 = it;
                            _filesystemkt_collectrecursively_1.Z$0 = z7;
                            _filesystemkt_collectrecursively_1.Z$1 = z6;
                            _filesystemkt_collectrecursively_1.label = 2;
                            if (collectRecursively(sequenceScope3, fileSystem4, arrayDeque3, next, z7, z8, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        arrayDeque3.removeLast();
                        z5 = z6;
                        path2 = path3;
                        sequenceScope2 = sequenceScope3;
                        if (z5) {
                            _filesystemkt_collectrecursively_1.L$0 = null;
                            _filesystemkt_collectrecursively_1.L$1 = null;
                            _filesystemkt_collectrecursively_1.L$2 = null;
                            _filesystemkt_collectrecursively_1.L$3 = null;
                            _filesystemkt_collectrecursively_1.L$4 = null;
                            _filesystemkt_collectrecursively_1.label = 3;
                            if (sequenceScope2.yield(path2, _filesystemkt_collectrecursively_1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                } else {
                    boolean z9 = _filesystemkt_collectrecursively_1.Z$1;
                    boolean z10 = _filesystemkt_collectrecursively_1.Z$0;
                    Path path4 = (Path) _filesystemkt_collectrecursively_1.L$3;
                    arrayDeque2 = (ArrayDeque) _filesystemkt_collectrecursively_1.L$2;
                    fileSystem3 = (FileSystem) _filesystemkt_collectrecursively_1.L$1;
                    sequenceScope2 = (SequenceScope) _filesystemkt_collectrecursively_1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z5 = z9;
                    z4 = z10;
                    path2 = path4;
                }
                listOrNull = fileSystem3.listOrNull(path2);
                if (listOrNull == null) {
                    listOrNull = CollectionsKt.emptyList();
                }
                if (!listOrNull.isEmpty()) {
                    Path path5 = path2;
                    int i2 = 0;
                    while (true) {
                        if (z4 && arrayDeque2.contains(path5)) {
                            throw new IOException("symlink cycle at " + path2);
                        }
                        Path symlinkTarget = symlinkTarget(fileSystem3, path5);
                        if (symlinkTarget == null) {
                            break;
                        }
                        i2++;
                        path5 = symlinkTarget;
                    }
                }
                if (z5) {
                }
            }
        }
        _filesystemkt_collectrecursively_1 = new _FileSystemKt$collectRecursively$1(continuation);
        Object obj2 = _filesystemkt_collectrecursively_1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = _filesystemkt_collectrecursively_1.label;
        if (i != 0) {
        }
        listOrNull = fileSystem3.listOrNull(path2);
        if (listOrNull == null) {
        }
        if (!listOrNull.isEmpty()) {
        }
        if (z5) {
        }
    }

    public static final Path symlinkTarget(FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path parent = path.parent();
        Intrinsics.checkNotNull(parent);
        return parent.resolve(symlinkTarget);
    }

    public static final void commonCopy(FileSystem fileSystem, Path source, Path target) throws IOException {
        Long l;
        Long valueOf;
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th = null;
        try {
            Source source3 = source2;
            BufferedSink buffer = Okio.buffer(fileSystem.sink(target));
            valueOf = Long.valueOf(buffer.writeAll(source3));
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            th = th3;
            l = null;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(valueOf);
        l = Long.valueOf(valueOf.longValue());
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(l);
    }
}
