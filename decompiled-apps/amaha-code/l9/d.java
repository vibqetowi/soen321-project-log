package l9;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public interface d {
    @RecentlyNullable
    List<g> getAdditionalSessionProviders(@RecentlyNonNull Context context);

    @RecentlyNonNull
    b getCastOptions(@RecentlyNonNull Context context);
}
