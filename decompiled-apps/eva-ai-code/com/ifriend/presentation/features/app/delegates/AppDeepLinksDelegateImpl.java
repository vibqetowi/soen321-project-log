package com.ifriend.presentation.features.app.delegates;

import android.content.Intent;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: AppDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u00020\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppDeepLinksDelegate;", "deepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "(Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;)V", "handleDeepLinks", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "intent", "Landroid/content/Intent;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Landroid/content/Intent;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppDeepLinksDelegateImpl implements AppDeepLinksDelegate {
    public static final int $stable = 8;
    private final DeepLinksRepository deepLinksRepository;

    @Inject
    public AppDeepLinksDelegateImpl(DeepLinksRepository deepLinksRepository) {
        Intrinsics.checkNotNullParameter(deepLinksRepository, "deepLinksRepository");
        this.deepLinksRepository = deepLinksRepository;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppDeepLinksDelegate
    public void handleDeepLinks(AppViewModel context_receiver_0, Intent intent) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new AppDeepLinksDelegateImpl$handleDeepLinks$1(intent, this, null), 3, null);
    }
}
