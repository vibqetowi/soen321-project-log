package androidx.navigation;

import androidx.navigation.NavDeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavDeepLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Landroidx/navigation/NavDeepLink$ParamQuery;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavDeepLink$queryArgsMap$2 extends Lambda implements Function0<Map<String, NavDeepLink.ParamQuery>> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$queryArgsMap$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, NavDeepLink.ParamQuery> invoke() {
        Map<String, NavDeepLink.ParamQuery> parseQuery;
        parseQuery = this.this$0.parseQuery();
        return parseQuery;
    }
}
