package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00104\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00106\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$items$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$itemsIndexed$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$items$5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$itemsIndexed$5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyListScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z3;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        int i7;
        LazyListState lazyListState2;
        Arrangement.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        boolean z5;
        Object obj4;
        Object obj5;
        Object obj6;
        FlingBehavior flingBehavior3;
        Composer composer2;
        Modifier modifier3;
        LazyListState lazyListState4;
        PaddingValues paddingValues2;
        boolean z6;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,8,2,7)291@14018L23,297@14369L15,301@14471L389:LazyDsl.kt#428nma");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = paddingValues;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = horizontal;
                        if (startRestartGroup.changed(obj2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        obj2 = horizontal;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    obj2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj3 = vertical;
                } else {
                    obj3 = vertical;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj3) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((234881024 & i) == 0) {
                        i7 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) == 0) {
                                lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState2 = lazyListState;
                            }
                            PaddingValues m741PaddingValues0680j_4 = i11 == 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj;
                            boolean z8 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) == 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                horizontal2 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                i3 &= -57345;
                            } else {
                                horizontal2 = obj2;
                            }
                            Alignment.Vertical top = i5 == 0 ? Alignment.Companion.getTop() : obj3;
                            if ((i2 & 64) == 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            z4 = i6 == 0 ? true : z2;
                            modifier2 = companion;
                            lazyListState3 = lazyListState2;
                            z5 = z8;
                            obj4 = m741PaddingValues0680j_4;
                            obj5 = horizontal2;
                            obj6 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            lazyListState3 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z4 = z2;
                            obj4 = obj;
                            z5 = z3;
                            obj5 = obj2;
                            obj6 = obj3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                        }
                        int i12 = i3 >> 3;
                        composer2 = startRestartGroup;
                        LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, false, flingBehavior3, z4, 0, null, null, obj6, obj5, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        lazyListState4 = lazyListState3;
                        paddingValues2 = obj4;
                        z6 = z5;
                        horizontal3 = obj5;
                        vertical2 = obj6;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        lazyListState4 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues2 = obj;
                        z6 = z3;
                        horizontal3 = obj2;
                        composer2 = startRestartGroup;
                        vertical2 = obj3;
                        z7 = z2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new LazyDslKt$LazyRow$1(modifier3, lazyListState4, paddingValues2, z6, horizontal3, vertical2, flingBehavior4, z7, content, i, i2));
                    return;
                }
                i7 = 100663296;
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i6 == 0) {
                }
                modifier2 = companion;
                lazyListState3 = lazyListState2;
                z5 = z8;
                obj4 = m741PaddingValues0680j_4;
                obj5 = horizontal2;
                obj6 = top;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, false, flingBehavior3, z4, 0, null, null, obj6, obj5, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues2 = obj4;
                z6 = z5;
                horizontal3 = obj5;
                vertical2 = obj6;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i6 == 0) {
            }
            modifier2 = companion;
            lazyListState3 = lazyListState2;
            z5 = z8;
            obj4 = m741PaddingValues0680j_4;
            obj5 = horizontal2;
            obj6 = top;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, false, flingBehavior3, z4, 0, null, null, obj6, obj5, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues2 = obj4;
            z6 = z5;
            horizontal3 = obj5;
            vertical2 = obj6;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i6 == 0) {
        }
        modifier2 = companion;
        lazyListState3 = lazyListState2;
        z5 = z8;
        obj4 = m741PaddingValues0680j_4;
        obj5 = horizontal2;
        obj6 = top;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i12222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, false, flingBehavior3, z4, 0, null, null, obj6, obj5, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues2 = obj4;
        z6 = z5;
        horizontal3 = obj5;
        vertical2 = obj6;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyListScope, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z3;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        int i7;
        LazyListState lazyListState2;
        Arrangement.Vertical vertical2;
        FlingBehavior flingBehavior2;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        boolean z5;
        Object obj4;
        Object obj5;
        Object obj6;
        FlingBehavior flingBehavior3;
        Composer composer2;
        Modifier modifier3;
        LazyListState lazyListState4;
        PaddingValues paddingValues2;
        boolean z6;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-740714857);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,8,3,2,7)347@16950L23,353@17304L15,357@17406L388:LazyDsl.kt#428nma");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = paddingValues;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = vertical;
                        if (startRestartGroup.changed(obj2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        obj2 = vertical;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    obj2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj3 = horizontal;
                } else {
                    obj3 = horizontal;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj3) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((i & 234881024) == 0) {
                        i7 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) == 0) {
                                lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListState2 = lazyListState;
                            }
                            PaddingValues m741PaddingValues0680j_4 = i11 == 0 ? PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)) : obj;
                            boolean z8 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) == 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                vertical2 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                i3 &= -57345;
                            } else {
                                vertical2 = obj2;
                            }
                            Alignment.Horizontal start = i5 == 0 ? Alignment.Companion.getStart() : obj3;
                            if ((i2 & 64) == 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            z4 = i6 == 0 ? true : z2;
                            modifier2 = companion;
                            lazyListState3 = lazyListState2;
                            z5 = z8;
                            obj4 = m741PaddingValues0680j_4;
                            obj5 = vertical2;
                            obj6 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            lazyListState3 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z4 = z2;
                            obj4 = obj;
                            z5 = z3;
                            obj5 = obj2;
                            obj6 = obj3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                        }
                        int i12 = i3 >> 3;
                        composer2 = startRestartGroup;
                        LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, true, flingBehavior3, z4, 0, obj6, obj5, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        lazyListState4 = lazyListState3;
                        paddingValues2 = obj4;
                        z6 = z5;
                        vertical3 = obj5;
                        horizontal2 = obj6;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        lazyListState4 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues2 = obj;
                        composer2 = startRestartGroup;
                        z6 = z3;
                        vertical3 = obj2;
                        horizontal2 = obj3;
                        z7 = z2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new LazyDslKt$LazyColumn$1(modifier3, lazyListState4, paddingValues2, z6, vertical3, horizontal2, flingBehavior4, z7, content, i, i2));
                    return;
                }
                i7 = 100663296;
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i6 == 0) {
                }
                modifier2 = companion;
                lazyListState3 = lazyListState2;
                z5 = z8;
                obj4 = m741PaddingValues0680j_4;
                obj5 = vertical2;
                obj6 = start;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, true, flingBehavior3, z4, 0, obj6, obj5, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues2 = obj4;
                z6 = z5;
                vertical3 = obj5;
                horizontal2 = obj6;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i6 == 0) {
            }
            modifier2 = companion;
            lazyListState3 = lazyListState2;
            z5 = z8;
            obj4 = m741PaddingValues0680j_4;
            obj5 = vertical2;
            obj6 = start;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, true, flingBehavior3, z4, 0, obj6, obj5, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues2 = obj4;
            z6 = z5;
            vertical3 = obj5;
            horizontal2 = obj6;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i6 == 0) {
        }
        modifier2 = companion;
        lazyListState3 = lazyListState2;
        z5 = z8;
        obj4 = m741PaddingValues0680j_4;
        obj5 = vertical2;
        obj6 = start;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i12222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, obj4, z5, true, flingBehavior3, z4, 0, obj6, obj5, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues2 = obj4;
        z6 = z5;
        vertical3 = obj5;
        horizontal2 = obj6;
        flingBehavior4 = flingBehavior3;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1 content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        int i4;
        boolean z2;
        Object obj3;
        int i5;
        Object obj4;
        LazyListState lazyListState2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        Object obj5;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z3;
        Arrangement.Vertical vertical2;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-563353797);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,7,3,2)375@17968L23,381@18322L15,384@18385L350:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                obj = lazyListState;
                if (startRestartGroup.changed(obj)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                obj = lazyListState;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            obj = lazyListState;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj2 = paddingValues;
            i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = vertical;
                        if (startRestartGroup.changed(obj3)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        obj3 = vertical;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    obj3 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj4 = horizontal;
                } else {
                    obj4 = horizontal;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListState2 = obj;
                        }
                        if (i9 != 0) {
                            obj2 = PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            obj3 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                        }
                        if (i5 != 0) {
                            obj4 = Alignment.Companion.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                        } else {
                            modifier2 = modifier4;
                            flingBehavior2 = flingBehavior;
                        }
                        obj5 = lazyListState2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        flingBehavior2 = flingBehavior;
                        obj5 = obj;
                    }
                    PaddingValues paddingValues3 = obj2;
                    boolean z4 = z2;
                    Alignment.Horizontal horizontal3 = obj4;
                    Arrangement.Vertical vertical3 = obj3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                    }
                    LazyColumn(modifier2, obj5, paddingValues3, z4, vertical3, horizontal3, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    lazyListState3 = obj5;
                    paddingValues2 = paddingValues3;
                    z3 = z4;
                    vertical2 = vertical3;
                    horizontal2 = horizontal3;
                    flingBehavior3 = flingBehavior2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState3 = obj;
                    paddingValues2 = obj2;
                    z3 = z2;
                    horizontal2 = obj4;
                    vertical2 = obj3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new LazyDslKt$LazyColumn$2(modifier3, lazyListState3, paddingValues2, z3, vertical2, horizontal2, flingBehavior3, content, i, i2));
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.Companion : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            obj5 = lazyListState2;
            PaddingValues paddingValues32 = obj2;
            boolean z42 = z2;
            Alignment.Horizontal horizontal32 = obj4;
            Arrangement.Vertical vertical32 = obj3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyColumn(modifier2, obj5, paddingValues32, z42, vertical32, horizontal32, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            lazyListState3 = obj5;
            paddingValues2 = paddingValues32;
            z3 = z42;
            vertical2 = vertical32;
            horizontal2 = horizontal32;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.Companion : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        obj5 = lazyListState2;
        PaddingValues paddingValues322 = obj2;
        boolean z422 = z2;
        Alignment.Horizontal horizontal322 = obj4;
        Arrangement.Vertical vertical322 = obj3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyColumn(modifier2, obj5, paddingValues322, z422, vertical322, horizontal322, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        lazyListState3 = obj5;
        paddingValues2 = paddingValues322;
        z3 = z422;
        vertical2 = vertical322;
        horizontal2 = horizontal322;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1 content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Object obj2;
        int i4;
        boolean z2;
        Object obj3;
        int i5;
        Object obj4;
        LazyListState lazyListState2;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        Object obj5;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(407929823);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,7,2)401@18906L23,407@19257L15,410@19320L347:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                obj = lazyListState;
                if (startRestartGroup.changed(obj)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                obj = lazyListState;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            obj = lazyListState;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj2 = paddingValues;
            i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = horizontal;
                        if (startRestartGroup.changed(obj3)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        obj3 = horizontal;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    obj3 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj4 = vertical;
                } else {
                    obj4 = vertical;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj4) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListState2 = obj;
                        }
                        if (i9 != 0) {
                            obj2 = PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            obj3 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                        }
                        if (i5 != 0) {
                            obj4 = Alignment.Companion.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                        } else {
                            modifier2 = modifier4;
                            flingBehavior2 = flingBehavior;
                        }
                        obj5 = lazyListState2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        flingBehavior2 = flingBehavior;
                        obj5 = obj;
                    }
                    PaddingValues paddingValues3 = obj2;
                    boolean z4 = z2;
                    Alignment.Vertical vertical3 = obj4;
                    Arrangement.Horizontal horizontal3 = obj3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                    }
                    LazyRow(modifier2, obj5, paddingValues3, z4, horizontal3, vertical3, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    lazyListState3 = obj5;
                    paddingValues2 = paddingValues3;
                    z3 = z4;
                    horizontal2 = horizontal3;
                    vertical2 = vertical3;
                    flingBehavior3 = flingBehavior2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState3 = obj;
                    paddingValues2 = obj2;
                    z3 = z2;
                    vertical2 = obj4;
                    horizontal2 = obj3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new LazyDslKt$LazyRow$2(modifier3, lazyListState3, paddingValues2, z3, horizontal2, vertical2, flingBehavior3, content, i, i2));
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.Companion : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            obj5 = lazyListState2;
            PaddingValues paddingValues32 = obj2;
            boolean z42 = z2;
            Alignment.Vertical vertical32 = obj4;
            Arrangement.Horizontal horizontal32 = obj3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyRow(modifier2, obj5, paddingValues32, z42, horizontal32, vertical32, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            lazyListState3 = obj5;
            paddingValues2 = paddingValues32;
            z3 = z42;
            horizontal2 = horizontal32;
            vertical2 = vertical32;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.Companion : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        obj5 = lazyListState2;
        PaddingValues paddingValues322 = obj2;
        boolean z422 = z2;
        Alignment.Vertical vertical322 = obj4;
        Arrangement.Horizontal horizontal322 = obj3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyRow(modifier2, obj5, paddingValues322, z422, horizontal322, vertical322, flingBehavior2, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        lazyListState3 = obj5;
        paddingValues2 = paddingValues322;
        z3 = z422;
        horizontal2 = horizontal322;
        vertical2 = vertical322;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }
}
