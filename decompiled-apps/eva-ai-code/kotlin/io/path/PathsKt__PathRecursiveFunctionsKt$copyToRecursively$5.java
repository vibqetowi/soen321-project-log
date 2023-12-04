package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/io/path/FileVisitorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 extends Lambda implements Function1<FileVisitorBuilder, Unit> {
    final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
    final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
        super(1);
        this.$copyAction = function3;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$onError = function32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
            super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$copyAction = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            return invoke2(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path), PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8502m((Object) basicFileAttributes));
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(Path p0, BasicFileAttributes p1) {
            FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
        invoke2(fileVisitorBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
        final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
            super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.$copyAction = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = function32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            return invoke2(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path), PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8502m((Object) basicFileAttributes));
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(Path p0, BasicFileAttributes p1) {
            FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FileVisitorBuilder visitFileTree) {
        Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
        visitFileTree.onPreVisitDirectory(new AnonymousClass1(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
        visitFileTree.onVisitFile(new AnonymousClass2(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
        visitFileTree.onVisitFileFailed(new AnonymousClass3(this.$onError, this.$this_copyToRecursively, this.$target));
        visitFileTree.onPostVisitDirectory(new AnonymousClass4(this.$onError, this.$this_copyToRecursively, this.$target));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
            super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.$onError = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
            return invoke2(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path), exc);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(Path p0, Exception p1) {
            FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.$onError, this.$this_copyToRecursively, this.$target, p0, p1);
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PathRecursiveFunctions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends Lambda implements Function2<Path, IOException, FileVisitResult> {
        final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
            super(2);
            this.$onError = function3;
            this.$this_copyToRecursively = path;
            this.$target = path2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, IOException iOException) {
            return invoke2(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path), iOException);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final FileVisitResult invoke2(Path directory, IOException iOException) {
            FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
            FileVisitResult fileVisitResult;
            Intrinsics.checkNotNullParameter(directory, "directory");
            if (iOException != null) {
                copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.$onError, this.$this_copyToRecursively, this.$target, directory, iOException);
                return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt;
            }
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
    }
}
