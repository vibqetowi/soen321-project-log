package coil.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: Contexts.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0005H\u0000\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0002H\u0000\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u001e\u0010\u0010\u001a\u0002H\u0011\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0012*\u00020\u0002H\u0080\b¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "resId", "", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getXmlDrawableCompat", "resources", "isPermissionGranted", "", "permission", "", "requireSystemService", ExifInterface.GPS_DIRECTION_TRUE, "", "(Landroid/content/Context;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: coil.util.-Contexts  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Contexts {
    public static final Drawable getDrawableCompat(Context context, int i) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Drawable getDrawableCompat(Resources resources, int i, Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    public static final Drawable getXmlDrawableCompat(Context context, Resources resources, int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        if (Build.VERSION.SDK_INT < 24) {
            String name = xml.getName();
            if (Intrinsics.areEqual(name, "vector")) {
                XmlResourceParser xmlResourceParser = xml;
                return VectorDrawableCompat.createFromXmlInner(resources, (XmlPullParser) xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), context.getTheme());
            } else if (Intrinsics.areEqual(name, "animated-vector")) {
                XmlResourceParser xmlResourceParser2 = xml;
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlResourceParser2, Xml.asAttributeSet(xmlResourceParser2), context.getTheme());
            }
        }
        return getDrawableCompat(resources, i, context.getTheme());
    }

    public static final Lifecycle getLifecycle(Context context) {
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getLifecycle();
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static final /* synthetic */ <T> T requireSystemService(Context context) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) ContextCompat.getSystemService(context, Object.class);
        Intrinsics.checkNotNull(t);
        return t;
    }
}
