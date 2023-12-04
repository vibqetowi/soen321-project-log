package kotlin.io.path;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", TypedValues.AttributesType.S_TARGET, "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultCopyActionContext implements CopyActionContext {
    public static final DefaultCopyActionContext INSTANCE = new DefaultCopyActionContext();

    private DefaultCopyActionContext() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r0 == false) goto L8;
     */
    @Override // kotlin.io.path.CopyActionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CopyActionResult copyToIgnoringExistingDirectory(Path path, Path target, boolean z) {
        boolean isDirectory;
        Path copy;
        LinkOption linkOption;
        boolean isDirectory2;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory2 = Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        }
        CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "copy(this, target, *options)");
        return CopyActionResult.CONTINUE;
    }
}