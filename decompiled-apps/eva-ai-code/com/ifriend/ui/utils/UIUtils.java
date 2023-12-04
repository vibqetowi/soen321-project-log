package com.ifriend.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.navigation.NavAction;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.ui.utils.blur.SafeBlurTransformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
/* compiled from: UIUtils.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u001eJT\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00100$j\b\u0012\u0004\u0012\u00020\u0010`%2\u001a\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100$j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`%2\u0006\u0010'\u001a\u00020\u0010H\u0002J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0002J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0002J\n\u0010-\u001a\u00020\u0016*\u00020.J \u0010/\u001a\u00020\u0016*\u0002002\b\b\u0001\u00101\u001a\u00020\u000b2\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\n\u00104\u001a\u00020\u0016*\u000205J\u0014\u00106\u001a\u000207*\u0002072\b\b\u0002\u00108\u001a\u00020\u000bJ\u0010\u00109\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00180:J\u0010\u0010;\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00180:J\u0012\u0010<\u001a\u00020\u0016*\u0002052\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00180:J$\u0010?\u001a\u00020\u0016*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0010J\u0012\u0010F\u001a\u000207*\u00020G2\u0006\u0010H\u001a\u00020IJ\u0014\u0010J\u001a\u00020\u0010*\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010IR\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006K"}, d2 = {"Lcom/ifriend/ui/utils/UIUtils;", "", "()V", "toDp", "", "", "getToDp", "(Ljava/lang/Number;)F", "toPx", "getToPx", "toPxInt", "", "getToPxInt", "(Ljava/lang/Number;)I", "calculateLinesCount", "text", "", "textSize", "typeface", "Landroid/graphics/Typeface;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "copyWithBlur", "", "from", "Landroid/view/View;", "to", "Landroid/widget/ImageView;", "radius", "sampling", "disableMultipleSpacesAndNewLinesIntentFilter", "Landroid/text/InputFilter;", "processFitChunk", "maxWidth", "paint", "Landroid/graphics/Paint;", "result", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "currentLine", "chunk", "splitIntoStringsThatFit", "", "source", "maxWidthPx", "splitWordsIntoStringsThatFit", "makeGradient", "Landroid/widget/TextView;", "navigateSafe", "Landroidx/navigation/NavController;", "resId", "args", "Landroid/os/Bundle;", "placeCursorToEnd", "Landroid/widget/EditText;", "resize", "Landroid/graphics/Bitmap;", "maximumSizeInPx", "setGone", "Lkotlin/sequences/Sequence;", "setInvisible", "setMaxLength", "maxLength", "setVisible", "showWithBlur", "Landroidx/fragment/app/DialogFragment;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "manager", "Landroidx/fragment/app/FragmentManager;", ViewHierarchyConstants.TAG_KEY, "toBitmap", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "toRawResourceUriString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UIUtils {
    public static final int $stable = 0;
    public static final UIUtils INSTANCE = new UIUtils();

    private UIUtils() {
    }

    public final void copyWithBlur(final View from, final ImageView to, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        from.post(new Runnable() { // from class: com.ifriend.ui.utils.UIUtils$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                UIUtils.copyWithBlur$lambda$0(from, i, i2, to);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copyWithBlur$lambda$0(View from, int i, int i2, ImageView to) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(to, "$to");
        from.setVisibility(0);
        Bitmap createBitmap = Bitmap.createBitmap(from.getWidth(), from.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        from.draw(new Canvas(createBitmap));
        from.setVisibility(4);
        RequestOptions bitmapTransform = RequestOptions.bitmapTransform(new SafeBlurTransformation(i, i2));
        Intrinsics.checkNotNullExpressionValue(bitmapTransform, "bitmapTransform(...)");
        Glide.with(from).load(createBitmap).set(Downsampler.ALLOW_HARDWARE_CONFIG, false).apply((BaseRequestOptions<?>) bitmapTransform).into(to);
    }

    public final void showWithBlur(DialogFragment dialogFragment, LifecycleCoroutineScope lifecycleScope, FragmentManager manager, String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(manager, "manager");
        lifecycleScope.launchWhenResumed(new UIUtils$showWithBlur$1(dialogFragment, manager, str, null));
    }

    public static /* synthetic */ void navigateSafe$default(UIUtils uIUtils, NavController navController, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        uIUtils.navigateSafe(navController, i, bundle);
    }

    public final void navigateSafe(NavController navController, int i, Bundle bundle) {
        NavAction action;
        Intrinsics.checkNotNullParameter(navController, "<this>");
        NavDestination currentDestination = navController.getCurrentDestination();
        int destinationId = (currentDestination == null || (action = currentDestination.getAction(i)) == null) ? 0 : action.getDestinationId();
        NavDestination currentDestination2 = navController.getCurrentDestination();
        if (currentDestination2 != null) {
            NavGraph parent = currentDestination2 instanceof NavGraph ? (NavGraph) currentDestination2 : currentDestination2.getParent();
            if (destinationId != 0) {
                if (parent == null || parent.findNode(destinationId) == null) {
                    return;
                }
                navController.navigate(i, bundle);
                return;
            }
            FirebaseCrashlytics.getInstance().recordException(new Exception() { // from class: com.ifriend.ui.utils.UIUtils$navigateSafe$NavigationException
            });
        }
    }

    public final int calculateLinesCount(String text, float f, Typeface typeface, float f2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.setTypeface(typeface);
        Unit unit = Unit.INSTANCE;
        return splitWordsIntoStringsThatFit(text, f2, paint).size();
    }

    private final List<String> splitWordsIntoStringsThatFit(String str, float f, Paint paint) {
        String[] strArr;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String str2 : (String[]) StringsKt.split$default((CharSequence) str, new String[]{"\\s"}, false, 0, 6, (Object) null).toArray(new String[0])) {
            if (paint.measureText(str2) < f) {
                processFitChunk(f, paint, arrayList, arrayList2, str2);
            } else {
                for (String str3 : splitIntoStringsThatFit(str2, f, paint)) {
                    processFitChunk(f, paint, arrayList, arrayList2, str3);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(TextUtils.join(" ", arrayList2));
        }
        return arrayList;
    }

    private final List<String> splitIntoStringsThatFit(String str, float f, Paint paint) {
        if (TextUtils.isEmpty(str) || paint.measureText(str) <= f) {
            return CollectionsKt.listOf(str);
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 1;
        if (1 <= length) {
            int i2 = 0;
            while (true) {
                String substring = str.substring(i2, i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (paint.measureText(substring) >= f) {
                    int i3 = i - 1;
                    String substring2 = str.substring(i2, i3);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    i2 = i3;
                }
                if (i == str.length()) {
                    String substring3 = str.substring(i2, i);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    private final void processFitChunk(float f, Paint paint, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str) {
        arrayList2.add(str);
        ArrayList<String> arrayList3 = arrayList2;
        if (paint.measureText(TextUtils.join(" ", arrayList3)) >= f) {
            arrayList2.remove(arrayList2.size() - 1);
            arrayList.add(TextUtils.join(" ", arrayList3));
            arrayList2.clear();
            arrayList2.add(str);
        }
    }

    public final float getToPx(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public final float getToDp(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return number.floatValue() / Resources.getSystem().getDisplayMetrics().density;
    }

    public final int getToPxInt(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return (int) getToPx(number);
    }

    public final void makeGradient(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        double radians = Math.toRadians(45.0d);
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, ((float) Math.cos(radians)) * measureText, ((float) Math.sin(radians)) * measureText, new int[]{Color.parseColor("#FFE2CD"), Color.parseColor("#FEC2E7"), Color.parseColor("#C9E7FF"), Color.parseColor("#86FEF4")}, (float[]) null, Shader.TileMode.REPEAT));
    }

    public final void setMaxLength(EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final InputFilter disableMultipleSpacesAndNewLinesIntentFilter() {
        return new InputFilter() { // from class: com.ifriend.ui.utils.UIUtils$disableMultipleSpacesAndNewLinesIntentFilter$1
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence source, int i, int i2, Spanned spanned, int i3, int i4) {
                Intrinsics.checkNotNullParameter(source, "source");
                while (i < i2) {
                    boolean z = false;
                    if (source.charAt(i) == ' ') {
                        if (i3 != 0) {
                            if (i3 <= 1) {
                                continue;
                            } else {
                                if (spanned != null && spanned.charAt(i3 - 1) == ' ') {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                        }
                        return "";
                    } else if (source.charAt(i) == '\n') {
                        if (i3 != 0) {
                            if (i3 <= 1) {
                                continue;
                            } else {
                                if (spanned != null && spanned.charAt(i3 - 1) == '\n') {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                        }
                        return "";
                    } else {
                        continue;
                    }
                    i++;
                }
                return null;
            }
        };
    }

    public final void placeCursorToEnd(final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.post(new Runnable() { // from class: com.ifriend.ui.utils.UIUtils$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UIUtils.placeCursorToEnd$lambda$7(editText);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeCursorToEnd$lambda$7(EditText this_placeCursorToEnd) {
        Intrinsics.checkNotNullParameter(this_placeCursorToEnd, "$this_placeCursorToEnd");
        this_placeCursorToEnd.setSelection(this_placeCursorToEnd.getText().length());
    }

    public static /* synthetic */ Bitmap resize$default(UIUtils uIUtils, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1024;
        }
        return uIUtils.resize(bitmap, i);
    }

    public final Bitmap resize(Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Float f = null;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            if (bitmap.getWidth() > i) {
                f = Float.valueOf(i / bitmap.getWidth());
            }
        } else if (bitmap.getHeight() > i) {
            f = Float.valueOf(i / bitmap.getHeight());
        }
        if (f != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, MathKt.roundToInt(bitmap.getWidth() * f.floatValue()), MathKt.roundToInt(bitmap.getHeight() * f.floatValue()), true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
            return createScaledBitmap;
        }
        return bitmap;
    }

    public final Bitmap toBitmap(Uri uri, Context context) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(context.getContentResolver(), uri);
            decodeBitmap = ImageDecoder.decodeBitmap(createSource);
            Intrinsics.checkNotNull(decodeBitmap);
            return decodeBitmap;
        }
        Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    public final String toRawResourceUriString(int i, Context context) {
        String packageName = context != null ? context.getPackageName() : null;
        return "android.resource://" + packageName + RemoteSettings.FORWARD_SLASH_STRING + i;
    }

    public final void setVisible(Sequence<? extends View> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        for (View view : sequence) {
            view.setVisibility(0);
        }
    }

    public final void setInvisible(Sequence<? extends View> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        for (View view : sequence) {
            view.setVisibility(4);
        }
    }

    public final void setGone(Sequence<? extends View> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        for (View view : sequence) {
            view.setVisibility(8);
        }
    }
}
