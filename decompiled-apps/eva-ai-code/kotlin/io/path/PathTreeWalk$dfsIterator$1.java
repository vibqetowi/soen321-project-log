package kotlin.io.path;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 199, HttpStatus.SC_RESET_CONTENT}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, Continuation<? super PathTreeWalk$dfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.this$0, continuation);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
        return ((PathTreeWalk$dfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01e1 -> B:36:0x014e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01e3 -> B:36:0x014e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        ArrayDeque arrayDeque;
        DirectoryEntriesReader directoryEntriesReader;
        boolean followLinks;
        PathNode pathNode;
        Path path;
        Path path2;
        Object keyOf;
        PathTreeWalk pathTreeWalk;
        Path path3;
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean createsCycle;
        PathTreeWalk pathTreeWalk2;
        SequenceScope sequenceScope2;
        PathNode pathNode2;
        ArrayDeque arrayDeque2;
        Path path4;
        ArrayDeque arrayDeque3;
        DirectoryEntriesReader directoryEntriesReader2;
        boolean isDirectory2;
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1;
        boolean isDirectory3;
        boolean createsCycle2;
        LinkOption linkOption2;
        boolean exists2;
        boolean isDirectory4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            arrayDeque = new ArrayDeque();
            followLinks = this.this$0.getFollowLinks();
            directoryEntriesReader = new DirectoryEntriesReader(followLinks);
            path = this.this$0.start;
            path2 = this.this$0.start;
            keyOf = PathTreeWalkKt.keyOf(path2, this.this$0.getLinkOptions());
            pathNode = new PathNode(path, keyOf, null);
            pathTreeWalk = this.this$0;
            path3 = pathNode.getPath();
            LinkOption[] linkOptions = pathTreeWalk.getLinkOptions();
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
            isDirectory = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            if (isDirectory) {
                createsCycle = PathTreeWalkKt.createsCycle(pathNode);
                if (!createsCycle) {
                    if (pathTreeWalk.getIncludeDirectories()) {
                        this.L$0 = sequenceScope;
                        this.L$1 = arrayDeque;
                        this.L$2 = directoryEntriesReader;
                        this.L$3 = pathNode;
                        this.L$4 = pathTreeWalk;
                        this.L$5 = path3;
                        this.label = 1;
                        if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pathTreeWalk2 = pathTreeWalk;
                        sequenceScope2 = sequenceScope;
                        pathNode2 = pathNode;
                        arrayDeque2 = arrayDeque;
                        path4 = path3;
                    }
                    LinkOption[] linkOptions2 = pathTreeWalk.getLinkOptions();
                    LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
                    isDirectory2 = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                    if (isDirectory2) {
                        pathNode.setContentIterator(directoryEntriesReader.readEntries(pathNode).iterator());
                        arrayDeque.addLast(pathNode);
                    }
                    arrayDeque3 = arrayDeque;
                    directoryEntriesReader2 = directoryEntriesReader;
                    pathTreeWalk$dfsIterator$1 = this;
                    while (!arrayDeque3.isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8517m$1();
                throw PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8489m(path3.toString());
            }
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path3, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = directoryEntriesReader;
                this.label = 2;
                if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            arrayDeque3 = arrayDeque;
            directoryEntriesReader2 = directoryEntriesReader;
            pathTreeWalk$dfsIterator$1 = this;
            while (!arrayDeque3.isEmpty()) {
            }
            return Unit.INSTANCE;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Path path5 = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m(this.L$5);
                    PathTreeWalk pathTreeWalk3 = (PathTreeWalk) this.L$4;
                    PathNode pathNode3 = (PathNode) this.L$3;
                    ResultKt.throwOnFailure(obj);
                    SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
                    ArrayDeque arrayDeque4 = (ArrayDeque) this.L$1;
                    DirectoryEntriesReader directoryEntriesReader3 = (DirectoryEntriesReader) this.L$2;
                    pathTreeWalk$dfsIterator$1 = this;
                    SequenceScope sequenceScope4 = sequenceScope3;
                    Path path6 = path5;
                    directoryEntriesReader2 = directoryEntriesReader3;
                    PathNode next = pathNode3;
                    sequenceScope = sequenceScope4;
                    ArrayDeque arrayDeque5 = arrayDeque4;
                    PathTreeWalk pathTreeWalk4 = pathTreeWalk3;
                    arrayDeque3 = arrayDeque5;
                    LinkOption[] linkOptions3 = pathTreeWalk4.getLinkOptions();
                    LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(linkOptions3, linkOptions3.length);
                    isDirectory4 = Files.isDirectory(path6, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length));
                    if (isDirectory4) {
                        next.setContentIterator(directoryEntriesReader2.readEntries(next).iterator());
                        arrayDeque3.addLast(next);
                    }
                    while (!arrayDeque3.isEmpty()) {
                        Iterator<PathNode> contentIterator = ((PathNode) arrayDeque3.last()).getContentIterator();
                        Intrinsics.checkNotNull(contentIterator);
                        if (contentIterator.hasNext()) {
                            next = contentIterator.next();
                            pathTreeWalk4 = pathTreeWalk$dfsIterator$1.this$0;
                            path6 = next.getPath();
                            LinkOption[] linkOptions4 = pathTreeWalk4.getLinkOptions();
                            LinkOption[] linkOptionArr4 = (LinkOption[]) Arrays.copyOf(linkOptions4, linkOptions4.length);
                            isDirectory3 = Files.isDirectory(path6, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length));
                            if (isDirectory3) {
                                createsCycle2 = PathTreeWalkKt.createsCycle(next);
                                if (!createsCycle2) {
                                    if (pathTreeWalk4.getIncludeDirectories()) {
                                        pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                        pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                        pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                        pathTreeWalk$dfsIterator$1.L$3 = next;
                                        pathTreeWalk$dfsIterator$1.L$4 = pathTreeWalk4;
                                        pathTreeWalk$dfsIterator$1.L$5 = path6;
                                        pathTreeWalk$dfsIterator$1.label = 3;
                                        if (sequenceScope.yield(path6, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        directoryEntriesReader3 = directoryEntriesReader2;
                                        path5 = path6;
                                        sequenceScope3 = sequenceScope;
                                        pathNode3 = next;
                                        arrayDeque4 = arrayDeque3;
                                        pathTreeWalk3 = pathTreeWalk4;
                                        SequenceScope sequenceScope42 = sequenceScope3;
                                        Path path62 = path5;
                                        directoryEntriesReader2 = directoryEntriesReader3;
                                        PathNode next2 = pathNode3;
                                        sequenceScope = sequenceScope42;
                                        ArrayDeque arrayDeque52 = arrayDeque4;
                                        PathTreeWalk pathTreeWalk42 = pathTreeWalk3;
                                        arrayDeque3 = arrayDeque52;
                                    }
                                    LinkOption[] linkOptions32 = pathTreeWalk42.getLinkOptions();
                                    LinkOption[] linkOptionArr32 = (LinkOption[]) Arrays.copyOf(linkOptions32, linkOptions32.length);
                                    isDirectory4 = Files.isDirectory(path62, (LinkOption[]) Arrays.copyOf(linkOptionArr32, linkOptionArr32.length));
                                    if (isDirectory4) {
                                    }
                                    while (!arrayDeque3.isEmpty()) {
                                    }
                                } else {
                                    PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8517m$1();
                                    throw PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8489m(path62.toString());
                                }
                            } else {
                                linkOption2 = LinkOption.NOFOLLOW_LINKS;
                                exists2 = Files.exists(path62, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption2}, 1));
                                if (exists2) {
                                    pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                    pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                    pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                    pathTreeWalk$dfsIterator$1.L$3 = null;
                                    pathTreeWalk$dfsIterator$1.L$4 = null;
                                    pathTreeWalk$dfsIterator$1.L$5 = null;
                                    pathTreeWalk$dfsIterator$1.label = 4;
                                    if (sequenceScope.yield(path62, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            arrayDeque3.removeLast();
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            directoryEntriesReader2 = (DirectoryEntriesReader) this.L$2;
            arrayDeque3 = (ArrayDeque) this.L$1;
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            pathTreeWalk$dfsIterator$1 = this;
            while (!arrayDeque3.isEmpty()) {
            }
            return Unit.INSTANCE;
        } else {
            path4 = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m(this.L$5);
            pathTreeWalk2 = (PathTreeWalk) this.L$4;
            pathNode2 = (PathNode) this.L$3;
            directoryEntriesReader = (DirectoryEntriesReader) this.L$2;
            arrayDeque2 = (ArrayDeque) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        path3 = path4;
        arrayDeque = arrayDeque2;
        pathNode = pathNode2;
        sequenceScope = sequenceScope2;
        pathTreeWalk = pathTreeWalk2;
        LinkOption[] linkOptions22 = pathTreeWalk.getLinkOptions();
        LinkOption[] linkOptionArr22 = (LinkOption[]) Arrays.copyOf(linkOptions22, linkOptions22.length);
        isDirectory2 = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr22, linkOptionArr22.length));
        if (isDirectory2) {
        }
        arrayDeque3 = arrayDeque;
        directoryEntriesReader2 = directoryEntriesReader;
        pathTreeWalk$dfsIterator$1 = this;
        while (!arrayDeque3.isEmpty()) {
        }
        return Unit.INSTANCE;
    }
}
