package androidx.compose.ui.focus;

import com.facebook.internal.AnalyticsEvents;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "(Ljava/lang/String;I)V", KeychainModule.AccessControl.NONE, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED, "Redirected", "RedirectCancelled", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum CustomDestinationResult {
    None,
    Cancelled,
    Redirected,
    RedirectCancelled
}
