package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;
/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 extends Lambda implements Function3<CopyActionContext, Path, Path, CopyActionResult> {
    final /* synthetic */ boolean $followLinks;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2(boolean z) {
        super(3);
        this.$followLinks = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path, Path path2) {
        return invoke2(copyActionContext, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path), PathTreeWalk$$ExternalSyntheticApiModelOutline0.m8495m((Object) path2));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CopyActionResult invoke2(CopyActionContext copyToRecursively, Path src, Path dst) {
        LinkOption linkOption;
        boolean isDirectory;
        boolean isDirectory2;
        StandardCopyOption standardCopyOption;
        Path copy;
        Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(this.$followLinks);
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        isDirectory2 = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (!isDirectory2 || !isDirectory) {
            if (isDirectory) {
                PathsKt.deleteRecursively(dst);
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(linkOptions);
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            spreadBuilder.add(standardCopyOption);
            CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
            copy = Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(copy, "copy(this, target, *options)");
        }
        return CopyActionResult.CONTINUE;
    }
}
