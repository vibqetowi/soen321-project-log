package i9;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ c f19919u = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).f7295v.compareTo(((Scope) obj2).f7295v);
    }
}
