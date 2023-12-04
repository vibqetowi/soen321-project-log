package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.Group;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposeViewAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "group", "Landroidx/compose/ui/tooling/data/Group;", "invoke", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeViewAdapter$findDesignInfoProviders$1$1 extends Lambda implements Function1<Group, Boolean> {
    final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$findDesignInfoProviders$1$1(ComposeViewAdapter composeViewAdapter) {
        super(1);
        this.this$0 = composeViewAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Group group) {
        boolean z;
        boolean z2;
        boolean hasDesignInfo;
        boolean hasDesignInfo2;
        Intrinsics.checkNotNullParameter(group, "group");
        boolean z3 = true;
        if (!Intrinsics.areEqual(group.getName(), "remember")) {
            hasDesignInfo2 = this.this$0.hasDesignInfo(group);
        }
        Collection<Group> children = group.getChildren();
        ComposeViewAdapter composeViewAdapter = this.this$0;
        if (!(children instanceof Collection) || !children.isEmpty()) {
            for (Group group2 : children) {
                if (Intrinsics.areEqual(group2.getName(), "remember")) {
                    hasDesignInfo = composeViewAdapter.hasDesignInfo(group2);
                    if (hasDesignInfo) {
                        z = true;
                        continue;
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z = false;
                continue;
                if (z) {
                }
            }
        }
        z2 = false;
        if (!z2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
