package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"keyOf", "", ClientCookie.PATH_ATTR, "Ljava/nio/file/Path;", "linkOptions", "", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "createsCycle", "", "Lkotlin/io/path/PathNode;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PathTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object keyOf(Path path, LinkOption[] linkOptionArr) {
        BasicFileAttributes readAttributes;
        Object fileKey;
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            readAttributes = Files.readAttributes(path, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            Intrinsics.checkNotNullExpressionValue(readAttributes, "readAttributes(this, A::class.java, *options)");
            fileKey = readAttributes.fileKey();
            return fileKey;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createsCycle(PathNode pathNode) {
        boolean isSameFile;
        for (PathNode parent = pathNode.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getKey() != null && pathNode.getKey() != null) {
                if (Intrinsics.areEqual(parent.getKey(), pathNode.getKey())) {
                    return true;
                }
            } else {
                try {
                    isSameFile = Files.isSameFile(parent.getPath(), pathNode.getPath());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
