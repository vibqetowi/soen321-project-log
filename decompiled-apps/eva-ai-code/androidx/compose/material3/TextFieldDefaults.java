package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010'J¦\u0002\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;J7\u0010<\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010'JS\u0010=\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u009c\u0002\u0010B\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010CJî\u0001\u0010B\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010DJ¦\u0002\u0010E\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;Jø\u0001\u0010E\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-2\u0006\u0010 \u001a\u00020!2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\"\u001a\u00020!2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u001f0,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010FJÃ\u0003\u0010%\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\b\b\u0002\u0010L\u001a\u00020H2\b\b\u0002\u0010M\u001a\u00020H2\b\b\u0002\u0010N\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ;\u0010v\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J;\u0010}\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010|J\u0086\u0003\u0010\u007f\u001a\u00020&2\t\b\u0002\u0010\u0080\u0001\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\t\b\u0002\u0010\u0081\u0001\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\t\b\u0002\u0010\u0082\u0001\u001a\u00020H2\t\b\u0002\u0010\u0083\u0001\u001a\u00020H2\t\b\u0002\u0010\u0084\u0001\u001a\u00020H2\t\b\u0002\u0010\u0085\u0001\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\t\b\u0002\u0010\u0086\u0001\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J¶\u0003\u0010\u007f\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\t\b\u0002\u0010\u0081\u0001\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\t\b\u0002\u0010\u0082\u0001\u001a\u00020H2\t\b\u0002\u0010\u0083\u0001\u001a\u00020H2\t\b\u0002\u0010\u0084\u0001\u001a\u00020H2\t\b\u0002\u0010\u0085\u0001\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J?\u0010\u008b\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u008c\u0001\u0010|J?\u0010\u008d\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u008e\u0001\u0010|J\u0083\u0003\u0010\u008f\u0001\u001a\u00020&2\t\b\u0002\u0010\u0080\u0001\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\t\b\u0002\u0010\u0081\u0001\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\t\b\u0002\u0010\u0086\u0001\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0088\u0001J³\u0003\u0010\u008f\u0001\u001a\u00020&2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020H2\t\b\u0002\u0010\u0081\u0001\u001a\u00020H2\b\b\u0002\u0010O\u001a\u00020H2\b\b\u0002\u0010P\u001a\u00020H2\b\b\u0002\u0010Q\u001a\u00020H2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020H2\b\b\u0002\u0010U\u001a\u00020H2\b\b\u0002\u0010V\u001a\u00020H2\b\b\u0002\u0010W\u001a\u00020H2\b\b\u0002\u0010X\u001a\u00020H2\b\b\u0002\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u00020H2\b\b\u0002\u0010[\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020H2\b\b\u0002\u0010]\u001a\u00020H2\b\b\u0002\u0010^\u001a\u00020H2\b\b\u0002\u0010_\u001a\u00020H2\b\b\u0002\u0010`\u001a\u00020H2\b\b\u0002\u0010a\u001a\u00020H2\b\b\u0002\u0010b\u001a\u00020H2\b\b\u0002\u0010c\u001a\u00020H2\b\b\u0002\u0010d\u001a\u00020H2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010f\u001a\u00020H2\b\b\u0002\u0010g\u001a\u00020H2\b\b\u0002\u0010h\u001a\u00020H2\b\b\u0002\u0010i\u001a\u00020H2\b\b\u0002\u0010j\u001a\u00020H2\b\b\u0002\u0010k\u001a\u00020H2\b\b\u0002\u0010l\u001a\u00020H2\b\b\u0002\u0010m\u001a\u00020H2\b\b\u0002\u0010n\u001a\u00020H2\b\b\u0002\u0010o\u001a\u00020H2\b\b\u0002\u0010p\u001a\u00020H2\b\b\u0002\u0010q\u001a\u00020H2\b\b\u0002\u0010r\u001a\u00020H2\b\b\u0002\u0010s\u001a\u00020HH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J?\u0010\u0092\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0093\u0001\u0010|J?\u0010\u0094\u0001\u001a\u0002092\b\b\u0002\u0010w\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0095\u0001\u0010|JT\u0010\u0096\u0001\u001a\u00030\u0097\u0001*\u00030\u0097\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R'\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "OutlinedBorderContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", TtmlNode.START, TtmlNode.END, ViewHierarchyConstants.DIMENSION_TOP_KEY, "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldColors", "textColor", "containerColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "placeholderColor", "outlinedTextFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldColors", "textFieldColors-eS1Emto", "textFieldColors-M37tBTI", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m5607constructorimpl(56);
    private static final float MinWidth = Dp.m5607constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m2107getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m2108getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1941327459);
        ComposerKt.sourceInformation(composer, "C57@2544L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:57)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m2120getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m2121getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m2123getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM  reason: not valid java name */
    public final float m2119getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ea, code lost:
        if ((r27 & 16) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ContainerBox(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, Shape shape, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        Shape shape3;
        int i4;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(918564008);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)P(1,3,2)100@4155L5,104@4239L51,102@4178L203:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                shape2 = shape;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            shape2 = shape;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i) == 0) {
            i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
        }
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                Shape shape4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(918564008, i3, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:95)");
                }
                BoxKt.Box(m2109indicatorLinegv0btCI$default(this, BackgroundKt.m420backgroundbw27NRU(Modifier.Companion, colors.containerColor$material3_release(z, z2, interactionSource, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168)).getValue().m3301unboximpl(), shape4), z, z2, interactionSource, colors, 0.0f, 0.0f, 48, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            shape3 = shape2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldDefaults$ContainerBox$1(this, z, z2, interactionSource, colors, shape3, i, i2));
    }

    /* renamed from: indicatorLine-gv0btCI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m2109indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        return textFieldDefaults.m2124indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, (i & 16) != 0 ? FocusedIndicatorThickness : f, (i & 32) != 0 ? UnfocusedIndicatorThickness : f2);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2105contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2116contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m2116contentPaddingWithLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2106contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2117contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4  reason: not valid java name */
    public final PaddingValues m2117contentPaddingWithoutLabela9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2111supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m5607constructorimpl(0);
        }
        return textFieldDefaults.m2128supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release  reason: not valid java name */
    public final PaddingValues m2128supportingTextPaddinga9UjIt4$material3_release(float f, float f2, float f3, float f4) {
        return PaddingKt.m744PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: colors-0hiis_0  reason: not valid java name */
    public final TextFieldColors m2115colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(1513344955);
        ComposerKt.sourceInformation(composer, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)247@12192L9,248@12272L9,249@12359L9,251@12510L9,252@12597L9,253@12686L9,254@12774L9,255@12859L9,256@12932L9,257@13020L9,258@13103L7,259@13199L9,260@13294L9,261@13396L9,263@13572L9,264@13668L9,265@13761L9,266@13861L9,268@14031L9,269@14129L9,270@14224L9,271@14326L9,273@14499L9,274@14583L9,275@14664L9,276@14752L9,278@14904L9,279@15000L9,280@15098L9,281@15192L9,283@15356L9,284@15454L9,285@15549L9,286@15651L9,288@15822L9,289@15908L9,290@15996L9,291@16083L9,293@16237L9,294@16323L9,295@16411L9,296@16498L9,298@16652L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m3290copywmQWz5c$default = (i6 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long color7 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j8;
        long color8 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j9;
        long color9 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j10;
        if ((i6 & 1024) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color10 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j11;
        long color11 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j12;
        long m3290copywmQWz5c$default2 = (i6 & 8192) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color12 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j14;
        long color13 = (32768 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j15;
        long color14 = (65536 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j16;
        long m3290copywmQWz5c$default3 = (131072 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long color15 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j18;
        long color16 = (524288 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j19;
        long color17 = (1048576 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j20;
        long m3290copywmQWz5c$default4 = (2097152 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long color18 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j22;
        long color19 = (8388608 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j23;
        long color20 = (16777216 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j24;
        long m3290copywmQWz5c$default5 = (33554432 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long color21 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j26;
        long color22 = (134217728 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j27;
        long color23 = (268435456 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long m3290copywmQWz5c$default6 = (536870912 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color24 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long color25 = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j31;
        long color26 = (i7 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j32;
        long m3290copywmQWz5c$default7 = (i7 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long color27 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j34;
        long color28 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long color29 = (i7 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long m3290copywmQWz5c$default8 = (i7 & 64) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j37;
        long color30 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long color31 = (i7 & 256) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        long color32 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        long m3290copywmQWz5c$default9 = (i7 & 1024) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j41;
        long color33 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:246)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, m3290copywmQWz5c$default, color3, color4, color5, color6, color7, color8, color9, textSelectionColors2, color10, color11, m3290copywmQWz5c$default2, color12, color13, color14, m3290copywmQWz5c$default3, color15, color16, color17, m3290copywmQWz5c$default4, color18, color19, color20, m3290copywmQWz5c$default5, color21, color22, color23, m3290copywmQWz5c$default6, color24, color25, color26, m3290copywmQWz5c$default7, color27, color28, color29, m3290copywmQWz5c$default8, color30, color31, color32, m3290copywmQWz5c$default9, color33, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
        if (r8.changed(r133) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function28, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function210;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Shape shape3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Shape shape4;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(289640444);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)425@24643L5,426@24684L8,437@25039L707:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i16 = 16384;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    int i17 = i11;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i17 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i17 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i17 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i2 & 7168) == 0) {
                            i17 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) != 0) {
                                }
                                i16 = 8192;
                                i17 |= i16;
                            }
                            if ((i2 & 458752) == 0) {
                                i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                            }
                            if ((i2 & 3670016) == 0) {
                                i17 |= ((i3 & 65536) == 0 && startRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                            }
                            i15 = i3 & 131072;
                            if (i15 == 0) {
                                i17 |= 12582912;
                            } else if ((i2 & 29360128) == 0) {
                                i17 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                            }
                            if ((i3 & 262144) == 0) {
                                i17 |= 100663296;
                            } else if ((i2 & 234881024) == 0) {
                                i17 |= startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 1533916891) == 306783378 || (191739611 & i17) != 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function225 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i9 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i10 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i12 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function230 = i13 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function231 = i14 == 0 ? null : function27;
                                    if ((i3 & 16384) == 0) {
                                        function29 = function227;
                                        shape2 = INSTANCE.getShape(startRestartGroup, 6);
                                        i17 &= -57345;
                                    } else {
                                        function29 = function227;
                                        shape2 = shape;
                                    }
                                    if ((32768 & i3) == 0) {
                                        textFieldColors2 = m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, (i17 >> 15) & 7168, Integer.MAX_VALUE, 4095);
                                        i17 &= -458753;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        if (function225 == null) {
                                            paddingValues2 = m2106contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValues2 = m2105contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i17 &= -3670017;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    if (i15 == 0) {
                                        function210 = function228;
                                        textFieldColors3 = textFieldColors2;
                                        function211 = function229;
                                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -435523791, true, new TextFieldDefaults$DecorationBox$1(z, z6, interactionSource, textFieldColors2, shape2, i4, i17));
                                    } else {
                                        function210 = function228;
                                        textFieldColors3 = textFieldColors2;
                                        function211 = function229;
                                        composableLambda = function28;
                                    }
                                    function212 = function225;
                                    function213 = function226;
                                    function214 = function230;
                                    z4 = z6;
                                    function215 = function231;
                                    shape3 = shape2;
                                    paddingValues3 = paddingValues2;
                                    function216 = function210;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i17 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i17 &= -3670017;
                                    }
                                    z4 = z3;
                                    function212 = function2;
                                    function213 = function22;
                                    function29 = function23;
                                    function216 = function24;
                                    function211 = function25;
                                    function214 = function26;
                                    function215 = function27;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composableLambda = function28;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(289640444, i4, i17, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:410)");
                                }
                                int i18 = i4;
                                int i19 = i18 << 3;
                                int i20 = i18 >> 3;
                                int i21 = i18 >> 9;
                                int i22 = i17 << 21;
                                composer2 = startRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i19 & 896) | (i19 & 112) | 6 | (i20 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i22 & 29360128) | (234881024 & i22) | (i22 & 1879048192), ((i17 >> 9) & 14) | ((i18 >> 6) & 112) | (i18 & 896) | (i21 & 7168) | (i20 & 57344) | ((i17 >> 3) & 458752) | ((i17 << 3) & 3670016) | (i17 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function217 = function212;
                                function218 = function213;
                                function219 = function216;
                                function220 = function211;
                                function221 = function214;
                                function222 = function215;
                                shape4 = shape3;
                                textFieldColors4 = textFieldColors3;
                                paddingValues4 = paddingValues3;
                                function223 = composableLambda;
                                function224 = function29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function217 = function2;
                                function218 = function22;
                                function224 = function23;
                                function219 = function24;
                                function220 = function25;
                                function221 = function26;
                                function222 = function27;
                                shape4 = shape;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function223 = function28;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldDefaults$DecorationBox$2(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function217, function218, function224, function219, function220, function221, function222, shape4, textFieldColors4, paddingValues4, function223, i, i2, i3));
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i2 & 458752) == 0) {
                        }
                        if ((i2 & 3670016) == 0) {
                        }
                        i15 = i3 & 131072;
                        if (i15 == 0) {
                        }
                        if ((i3 & 262144) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((32768 & i3) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        function212 = function225;
                        function213 = function226;
                        function214 = function230;
                        z4 = z6;
                        function215 = function231;
                        shape3 = shape2;
                        paddingValues3 = paddingValues2;
                        function216 = function210;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i182 = i4;
                        int i192 = i182 << 3;
                        int i202 = i182 >> 3;
                        int i212 = i182 >> 9;
                        int i222 = i17 << 21;
                        composer2 = startRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i192 & 896) | (i192 & 112) | 6 | (i202 & 7168) | (i212 & 57344) | (i212 & 458752) | (i212 & 3670016) | (i222 & 29360128) | (234881024 & i222) | (i222 & 1879048192), ((i17 >> 9) & 14) | ((i182 >> 6) & 112) | (i182 & 896) | (i212 & 7168) | (i202 & 57344) | ((i17 >> 3) & 458752) | ((i17 << 3) & 3670016) | (i17 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z4;
                        function217 = function212;
                        function218 = function213;
                        function219 = function216;
                        function220 = function211;
                        function221 = function214;
                        function222 = function215;
                        shape4 = shape3;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function223 = composableLambda;
                        function224 = function29;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    i15 = i3 & 131072;
                    if (i15 == 0) {
                    }
                    if ((i3 & 262144) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((32768 & i3) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    function212 = function225;
                    function213 = function226;
                    function214 = function230;
                    z4 = z6;
                    function215 = function231;
                    shape3 = shape2;
                    paddingValues3 = paddingValues2;
                    function216 = function210;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1822 = i4;
                    int i1922 = i1822 << 3;
                    int i2022 = i1822 >> 3;
                    int i2122 = i1822 >> 9;
                    int i2222 = i17 << 21;
                    composer2 = startRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1922 & 896) | (i1922 & 112) | 6 | (i2022 & 7168) | (i2122 & 57344) | (i2122 & 458752) | (i2122 & 3670016) | (i2222 & 29360128) | (234881024 & i2222) | (i2222 & 1879048192), ((i17 >> 9) & 14) | ((i1822 >> 6) & 112) | (i1822 & 896) | (i2122 & 7168) | (i2022 & 57344) | ((i17 >> 3) & 458752) | ((i17 << 3) & 3670016) | (i17 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function217 = function212;
                    function218 = function213;
                    function219 = function216;
                    function220 = function211;
                    function221 = function214;
                    function222 = function215;
                    shape4 = shape3;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function223 = composableLambda;
                    function224 = function29;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i172 = i11;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                i15 = i3 & 131072;
                if (i15 == 0) {
                }
                if ((i3 & 262144) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((32768 & i3) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (i15 == 0) {
                }
                function212 = function225;
                function213 = function226;
                function214 = function230;
                z4 = z6;
                function215 = function231;
                shape3 = shape2;
                paddingValues3 = paddingValues2;
                function216 = function210;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i18222 = i4;
                int i19222 = i18222 << 3;
                int i20222 = i18222 >> 3;
                int i21222 = i18222 >> 9;
                int i22222 = i172 << 21;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i19222 & 896) | (i19222 & 112) | 6 | (i20222 & 7168) | (i21222 & 57344) | (i21222 & 458752) | (i21222 & 3670016) | (i22222 & 29360128) | (234881024 & i22222) | (i22222 & 1879048192), ((i172 >> 9) & 14) | ((i18222 >> 6) & 112) | (i18222 & 896) | (i21222 & 7168) | (i20222 & 57344) | ((i172 >> 3) & 458752) | ((i172 << 3) & 3670016) | (i172 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function217 = function212;
                function218 = function213;
                function219 = function216;
                function220 = function211;
                function221 = function214;
                function222 = function215;
                shape4 = shape3;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function223 = composableLambda;
                function224 = function29;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i162 = 16384;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i1722 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i15 = i3 & 131072;
            if (i15 == 0) {
            }
            if ((i3 & 262144) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((32768 & i3) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (i15 == 0) {
            }
            function212 = function225;
            function213 = function226;
            function214 = function230;
            z4 = z6;
            function215 = function231;
            shape3 = shape2;
            paddingValues3 = paddingValues2;
            function216 = function210;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i182222 = i4;
            int i192222 = i182222 << 3;
            int i202222 = i182222 >> 3;
            int i212222 = i182222 >> 9;
            int i222222 = i1722 << 21;
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i192222 & 896) | (i192222 & 112) | 6 | (i202222 & 7168) | (i212222 & 57344) | (i212222 & 458752) | (i212222 & 3670016) | (i222222 & 29360128) | (234881024 & i222222) | (i222222 & 1879048192), ((i1722 >> 9) & 14) | ((i182222 >> 6) & 112) | (i182222 & 896) | (i212222 & 7168) | (i202222 & 57344) | ((i1722 >> 3) & 458752) | ((i1722 << 3) & 3670016) | (i1722 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function217 = function212;
            function218 = function213;
            function219 = function216;
            function220 = function211;
            function221 = function214;
            function222 = function215;
            shape4 = shape3;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function223 = composableLambda;
            function224 = function29;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        int i1622 = 16384;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i17222 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i15 = i3 & 131072;
        if (i15 == 0) {
        }
        if ((i3 & 262144) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((32768 & i3) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (i15 == 0) {
        }
        function212 = function225;
        function213 = function226;
        function214 = function230;
        z4 = z6;
        function215 = function231;
        shape3 = shape2;
        paddingValues3 = paddingValues2;
        function216 = function210;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1822222 = i4;
        int i1922222 = i1822222 << 3;
        int i2022222 = i1822222 >> 3;
        int i2122222 = i1822222 >> 9;
        int i2222222 = i17222 << 21;
        composer2 = startRestartGroup;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function212, function213, function29, function216, function211, function214, function215, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, composableLambda, composer2, (i1922222 & 896) | (i1922222 & 112) | 6 | (i2022222 & 7168) | (i2122222 & 57344) | (i2122222 & 458752) | (i2122222 & 3670016) | (i2222222 & 29360128) | (234881024 & i2222222) | (i2222222 & 1879048192), ((i17222 >> 9) & 14) | ((i1822222 >> 6) & 112) | (i1822222 & 896) | (i2122222 & 7168) | (i2022222 & 57344) | ((i17222 >> 3) & 458752) | ((i17222 << 3) & 3670016) | (i17222 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function217 = function212;
        function218 = function213;
        function219 = function216;
        function220 = function211;
        function221 = function214;
        function222 = function215;
        shape4 = shape3;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function223 = composableLambda;
        function224 = function29;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        ComposerKt.sourceInformation(composer, "C465@26096L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:465)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        ComposerKt.sourceInformation(composer, "C472@26334L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:472)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m2122getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m2118getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00eb, code lost:
        if ((r25 & 16) != 0) goto L48;
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FilledContainerBox(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, Shape shape, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        Shape shape3;
        int i4;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1358797526);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledContainerBox)P(1,3,2)508@27835L5,509@27850L168:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                shape2 = shape;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            shape2 = shape;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
        }
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                Shape shape4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1358797526, i3, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:503)");
                }
                ContainerBox(z, z2, interactionSource, colors, shape4, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            shape3 = shape2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldDefaults$FilledContainerBox$1(this, z, z2, interactionSource, colors, shape3, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2114OutlinedBorderContainerBoxnbWgWpA(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        float f3;
        int i4;
        float f4;
        Object obj;
        float m1915getUnfocusedBorderThicknessD9Ej5fM;
        float f5;
        Shape shape3;
        float f6;
        float f7;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1998946250);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedBorderContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)538@28994L9,541@29216L286:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i5 = 16384;
                    i3 |= i5;
                }
            } else {
                shape2 = shape;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            shape2 = shape;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 16) != 0) {
                            shape2 = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            f3 = OutlinedTextFieldDefaults.INSTANCE.m1912getFocusedBorderThicknessD9Ej5fM();
                        }
                        if (i4 != 0) {
                            obj = shape2;
                            m1915getUnfocusedBorderThicknessD9Ej5fM = OutlinedTextFieldDefaults.INSTANCE.m1915getUnfocusedBorderThicknessD9Ej5fM();
                            f5 = f3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998946250, i3, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:533)");
                            }
                            OutlinedTextFieldDefaults.INSTANCE.m1909ContainerBoxnbWgWpA(z, z2, interactionSource, colors, obj, f5, m1915getUnfocusedBorderThicknessD9Ej5fM, startRestartGroup, (57344 & i3) | 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape3 = obj;
                            f6 = f5;
                            f7 = m1915getUnfocusedBorderThicknessD9Ej5fM;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    obj = shape2;
                    f5 = f3;
                    m1915getUnfocusedBorderThicknessD9Ej5fM = f4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    OutlinedTextFieldDefaults.INSTANCE.m1909ContainerBoxnbWgWpA(z, z2, interactionSource, colors, obj, f5, m1915getUnfocusedBorderThicknessD9Ej5fM, startRestartGroup, (57344 & i3) | 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape3 = obj;
                    f6 = f5;
                    f7 = m1915getUnfocusedBorderThicknessD9Ej5fM;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f6 = f3;
                    f7 = f4;
                    shape3 = shape2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new TextFieldDefaults$OutlinedBorderContainerBox$1(this, z, z2, interactionSource, colors, shape3, f6, f7, i, i2));
                return;
            }
            f4 = f2;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            obj = shape2;
            f5 = f3;
            m1915getUnfocusedBorderThicknessD9Ej5fM = f4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            OutlinedTextFieldDefaults.INSTANCE.m1909ContainerBoxnbWgWpA(z, z2, interactionSource, colors, obj, f5, m1915getUnfocusedBorderThicknessD9Ej5fM, startRestartGroup, (57344 & i3) | 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape3 = obj;
            f6 = f5;
            f7 = m1915getUnfocusedBorderThicknessD9Ej5fM;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        obj = shape2;
        f5 = f3;
        m1915getUnfocusedBorderThicknessD9Ej5fM = f4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        OutlinedTextFieldDefaults.INSTANCE.m1909ContainerBoxnbWgWpA(z, z2, interactionSource, colors, obj, f5, m1915getUnfocusedBorderThicknessD9Ej5fM, startRestartGroup, (57344 & i3) | 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape3 = obj;
        f6 = f5;
        f7 = m1915getUnfocusedBorderThicknessD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2112textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2131textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m2131textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m2116contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2113textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2132textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m2132textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return m2117contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m2110outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2127outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m2127outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return OutlinedTextFieldDefaults.INSTANCE.m1911contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    /* renamed from: textFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m2129textFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        int i8;
        long j41;
        int i9;
        long j42;
        int i10;
        long j43;
        int i11;
        long j44;
        int i12;
        long j45;
        int i13;
        long j46;
        int i14;
        long j47;
        int i15;
        long j48;
        composer.startReplaceableGroup(568209592);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(29:c#ui.graphics.Color,39:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,0:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,31,22:c#ui.graphics.Color,32:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,30:c#ui.graphics.Color,40:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,27:c#ui.graphics.Color,37:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)671@35322L9,672@35402L9,673@35489L9,675@35640L9,676@35720L9,677@35805L9,678@35878L9,679@35966L9,680@36049L7,681@36145L9,682@36240L9,683@36342L9,685@36518L9,686@36614L9,687@36707L9,688@36807L9,690@36977L9,691@37075L9,692@37170L9,693@37272L9,695@37445L9,696@37529L9,697@37610L9,698@37698L9,700@37850L9,701@37946L9,702@38044L9,703@38138L9,705@38302L9,706@38400L9,707@38495L9,708@38597L9,710@38768L9,711@38854L9,712@38942L9,713@39029L9,715@39183L9,716@39269L9,717@39357L9,718@39444L9,720@39598L9,721@39634L2308:TextFieldDefaults.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m3290copywmQWz5c$default = (i6 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long color4 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long color5 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color6 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color7 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        if ((i6 & 256) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        if ((i6 & 512) != 0) {
            i8 = 6;
            j41 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6);
        } else {
            i8 = 6;
            j41 = j9;
        }
        long color8 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, i8) : j10;
        long m3290copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, i8), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i6 & 4096) != 0) {
            i9 = 6;
            j42 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6);
        } else {
            i9 = 6;
            j42 = j12;
        }
        long color9 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, i9) : j13;
        long color10 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, i9) : j14;
        long m3290copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, i9), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((65536 & i6) != 0) {
            i10 = 6;
            j43 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6);
        } else {
            i10 = 6;
            j43 = j16;
        }
        long color11 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, i10) : j17;
        long color12 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, i10) : j18;
        long m3290copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, i10), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((1048576 & i6) != 0) {
            i11 = 6;
            j44 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6);
        } else {
            i11 = 6;
            j44 = j20;
        }
        long color13 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, i11) : j21;
        long color14 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, i11) : j22;
        long m3290copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, i11), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((16777216 & i6) != 0) {
            i12 = 6;
            j45 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6);
        } else {
            i12 = 6;
            j45 = j24;
        }
        long color15 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, i12) : j25;
        long color16 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, i12) : j26;
        long m3290copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, i12), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((268435456 & i6) != 0) {
            i13 = 6;
            j46 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6);
        } else {
            i13 = 6;
            j46 = j28;
        }
        long color17 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, i13) : j29;
        long color18 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, i13) : j30;
        long m3290copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, i13), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        if ((i7 & 2) != 0) {
            i14 = 6;
            j47 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6);
        } else {
            i14 = 6;
            j47 = j32;
        }
        long color19 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14) : j33;
        long color20 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14) : j34;
        long m3290copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        if ((i7 & 32) != 0) {
            i15 = 6;
            j48 = ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6);
        } else {
            i15 = 6;
            j48 = j36;
        }
        long color21 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15) : j37;
        long color22 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15) : j38;
        long m3290copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color23 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:670)");
        }
        int i16 = i << 6;
        int i17 = i >> 24;
        int i18 = i2 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i2 >> 24;
        int i21 = i3 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i3 >> 24;
        int i24 = i4 << 6;
        int i25 = (i23 & 112) | (i23 & 14) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
        int i26 = i4 >> 24;
        int i27 = i5 << 6;
        TextFieldColors m2115colors0hiis_0 = m2115colors0hiis_0(color, color2, m3290copywmQWz5c$default, color3, color4, color4, color4, color5, color6, color7, textSelectionColors2, j41, color8, m3290copywmQWz5c$default2, j42, color9, color10, m3290copywmQWz5c$default3, j43, color11, color12, m3290copywmQWz5c$default4, j44, color13, color14, m3290copywmQWz5c$default5, j45, color15, color16, m3290copywmQWz5c$default6, j46, color17, color18, m3290copywmQWz5c$default7, j47, color19, color20, m3290copywmQWz5c$default8, j48, color21, color22, m3290copywmQWz5c$default9, color23, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (i & 57344) | ((i << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), i19, i22, i25, (i26 & 112) | (i26 & 14) | (i27 & 896) | (i27 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2115colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldColors-M37tBTI  reason: not valid java name */
    public final TextFieldColors m2125outlinedTextFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, TextSelectionColors textSelectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        int i8;
        long j41;
        int i9;
        long j42;
        int i10;
        long j43;
        int i11;
        long j44;
        int i12;
        long j45;
        int i13;
        long j46;
        int i14;
        long j47;
        int i15;
        long j48;
        composer.startReplaceableGroup(618732090);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(29:c#ui.graphics.Color,39:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,1:c#ui.graphics.Color,13:c#ui.graphics.Color,31,22:c#ui.graphics.Color,32:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,30:c#ui.graphics.Color,40:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,28:c#ui.graphics.Color,38:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,26:c#ui.graphics.Color,36:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,27:c#ui.graphics.Color,37:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)821@45523L9,822@45605L9,823@45694L9,825@45849L9,828@46031L9,829@46121L9,830@46204L7,831@46291L9,832@46377L9,833@46470L9,835@46631L9,836@46729L9,837@46824L9,838@46926L9,840@47100L9,841@47200L9,842@47297L9,844@47414L9,845@47578L9,846@47664L9,847@47747L9,848@47837L9,850@47993L9,851@48091L9,852@48191L9,853@48287L9,855@48455L9,856@48555L9,857@48652L9,859@48769L9,860@48931L9,861@49019L9,862@49109L9,863@49198L9,865@49356L9,866@49444L9,867@49534L9,868@49623L9,870@49781L9,871@49843L2284:TextFieldDefaults.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long m3290copywmQWz5c$default = (i6 & 4) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long m3326getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j5;
        long m3326getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j6;
        long color4 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color5 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        if ((i6 & 256) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        if ((i6 & 512) != 0) {
            i8 = 6;
            j41 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6);
        } else {
            i8 = 6;
            j41 = j9;
        }
        long color6 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, i8) : j10;
        long m3290copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, i8), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i6 & 4096) != 0) {
            i9 = 6;
            j42 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6);
        } else {
            i9 = 6;
            j42 = j12;
        }
        long color7 = (i6 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, i9) : j13;
        long color8 = (i6 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, i9) : j14;
        long m3290copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, i9), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((65536 & i6) != 0) {
            i10 = 6;
            j43 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6);
        } else {
            i10 = 6;
            j43 = j16;
        }
        long color9 = (131072 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, i10) : j17;
        long color10 = (262144 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, i10) : j18;
        long m3290copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, i10), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((1048576 & i6) != 0) {
            i11 = 6;
            j44 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6);
        } else {
            i11 = 6;
            j44 = j20;
        }
        long color11 = (2097152 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, i11) : j21;
        long color12 = (4194304 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, i11) : j22;
        long m3290copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, i11), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if ((16777216 & i6) != 0) {
            i12 = 6;
            j45 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6);
        } else {
            i12 = 6;
            j45 = j24;
        }
        long color13 = (33554432 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, i12) : j25;
        long color14 = (67108864 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, i12) : j26;
        long m3290copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, i12), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        if ((268435456 & i6) != 0) {
            i13 = 6;
            j46 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6);
        } else {
            i13 = 6;
            j46 = j28;
        }
        long color15 = (536870912 & i6) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, i13) : j29;
        long color16 = (i6 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, i13) : j30;
        long m3290copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, i13), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        if ((i7 & 2) != 0) {
            i14 = 6;
            j47 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6);
        } else {
            i14 = 6;
            j47 = j32;
        }
        long color17 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14) : j33;
        long color18 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14) : j34;
        long m3290copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, i14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        if ((i7 & 32) != 0) {
            i15 = 6;
            j48 = ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6);
        } else {
            i15 = 6;
            j48 = j36;
        }
        long color19 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15) : j37;
        long color20 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15) : j38;
        long m3290copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, i15), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long color21 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:820)");
        }
        int i16 = i << 6;
        int i17 = i >> 24;
        int i18 = i2 << 6;
        int i19 = (i17 & 112) | (i17 & 14) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i2 >> 24;
        int i21 = i3 << 6;
        int i22 = (i20 & 112) | (i20 & 14) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192);
        int i23 = i3 >> 24;
        int i24 = i4 << 6;
        int i25 = (i23 & 112) | (i23 & 14) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
        int i26 = i4 >> 24;
        TextFieldColors m1910colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(color, color2, m3290copywmQWz5c$default, color3, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU2, color4, color5, textSelectionColors2, j41, color6, m3290copywmQWz5c$default2, j42, color7, color8, m3290copywmQWz5c$default3, j43, color9, color10, m3290copywmQWz5c$default4, j44, color11, color12, m3290copywmQWz5c$default5, j45, color13, color14, m3290copywmQWz5c$default6, j46, color15, color16, m3290copywmQWz5c$default7, j47, color17, color18, m3290copywmQWz5c$default8, j48, color19, color20, m3290copywmQWz5c$default9, color21, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (i & 57344) | ((i << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), i19, i22, i25, (i26 & 112) | (i26 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i5 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1910colors0hiis_0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
        if (r8.changed(r133) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function28, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        boolean z4;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function216;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        Shape shape4;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function225;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1042273141);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)958@54020L5,959@54061L8,969@54408L612:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i16 = 16384;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    int i17 = i11;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i17 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i17 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i17 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i2 & 7168) == 0) {
                            i17 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) != 0) {
                                }
                                i16 = 8192;
                                i17 |= i16;
                            }
                            if ((i2 & 458752) == 0) {
                                i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                            }
                            if ((i2 & 3670016) == 0) {
                                i17 |= ((i3 & 65536) == 0 && startRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                            }
                            i15 = i3 & 131072;
                            if (i15 == 0) {
                                i17 |= 12582912;
                            } else if ((i2 & 29360128) == 0) {
                                i17 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                            }
                            if ((i3 & 262144) == 0) {
                                i17 |= 100663296;
                            } else if ((i2 & 234881024) == 0) {
                                i17 |= startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 1533916891) == 306783378 || (191739611 & i17) != 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i9 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i10 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function230 = i12 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function231 = i13 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function232 = i14 == 0 ? function27 : null;
                                    if ((i3 & 16384) == 0) {
                                        function29 = function228;
                                        shape2 = INSTANCE.getShape(startRestartGroup, 6);
                                        i17 &= -57345;
                                    } else {
                                        function29 = function228;
                                        shape2 = shape;
                                    }
                                    if ((32768 & i3) == 0) {
                                        textFieldColors2 = m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, (i17 >> 15) & 7168, Integer.MAX_VALUE, 4095);
                                        i17 &= -458753;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        if (function226 == null) {
                                            paddingValues2 = m2106contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValues2 = m2105contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i17 &= -3670017;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    if (i15 == 0) {
                                        function210 = function229;
                                        shape3 = shape2;
                                        function211 = function230;
                                        function212 = function29;
                                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 2023266550, true, new TextFieldDefaults$TextFieldDecorationBox$1(z, z6, interactionSource, textFieldColors2, shape2, i4, i17));
                                    } else {
                                        function210 = function229;
                                        shape3 = shape2;
                                        function211 = function230;
                                        composableLambda = function28;
                                        function212 = function29;
                                    }
                                    function213 = function226;
                                    function214 = function227;
                                    function215 = function231;
                                    z4 = z6;
                                    textFieldColors3 = textFieldColors2;
                                    function216 = function232;
                                    paddingValues3 = paddingValues2;
                                    function217 = function210;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i17 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i17 &= -3670017;
                                    }
                                    z4 = z3;
                                    function213 = function2;
                                    function214 = function22;
                                    function212 = function23;
                                    function217 = function24;
                                    function211 = function25;
                                    function215 = function26;
                                    function216 = function27;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composableLambda = function28;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1042273141, i4, i17, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:943)");
                                }
                                composer2 = startRestartGroup;
                                DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function218 = function213;
                                function219 = function214;
                                function220 = function212;
                                function221 = function217;
                                function222 = function211;
                                function223 = function215;
                                function224 = function216;
                                shape4 = shape3;
                                textFieldColors4 = textFieldColors3;
                                paddingValues4 = paddingValues3;
                                function225 = composableLambda;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function218 = function2;
                                function219 = function22;
                                function220 = function23;
                                function221 = function24;
                                function222 = function25;
                                function223 = function26;
                                function224 = function27;
                                shape4 = shape;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function225 = function28;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldDefaults$TextFieldDecorationBox$2(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function218, function219, function220, function221, function222, function223, function224, shape4, textFieldColors4, paddingValues4, function225, i, i2, i3));
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i2 & 458752) == 0) {
                        }
                        if ((i2 & 3670016) == 0) {
                        }
                        i15 = i3 & 131072;
                        if (i15 == 0) {
                        }
                        if ((i3 & 262144) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((32768 & i3) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        function213 = function226;
                        function214 = function227;
                        function215 = function231;
                        z4 = z6;
                        textFieldColors3 = textFieldColors2;
                        function216 = function232;
                        paddingValues3 = paddingValues2;
                        function217 = function210;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z4;
                        function218 = function213;
                        function219 = function214;
                        function220 = function212;
                        function221 = function217;
                        function222 = function211;
                        function223 = function215;
                        function224 = function216;
                        shape4 = shape3;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function225 = composableLambda;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    i15 = i3 & 131072;
                    if (i15 == 0) {
                    }
                    if ((i3 & 262144) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((32768 & i3) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    function213 = function226;
                    function214 = function227;
                    function215 = function231;
                    z4 = z6;
                    textFieldColors3 = textFieldColors2;
                    function216 = function232;
                    paddingValues3 = paddingValues2;
                    function217 = function210;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function218 = function213;
                    function219 = function214;
                    function220 = function212;
                    function221 = function217;
                    function222 = function211;
                    function223 = function215;
                    function224 = function216;
                    shape4 = shape3;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function225 = composableLambda;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i172 = i11;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                i15 = i3 & 131072;
                if (i15 == 0) {
                }
                if ((i3 & 262144) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((32768 & i3) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (i15 == 0) {
                }
                function213 = function226;
                function214 = function227;
                function215 = function231;
                z4 = z6;
                textFieldColors3 = textFieldColors2;
                function216 = function232;
                paddingValues3 = paddingValues2;
                function217 = function210;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i172 & 14) | (i172 & 112) | (i172 & 896) | (i172 & 7168) | (i172 & 57344) | (i172 & 458752) | (i172 & 3670016) | (i172 & 29360128) | (i172 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function218 = function213;
                function219 = function214;
                function220 = function212;
                function221 = function217;
                function222 = function211;
                function223 = function215;
                function224 = function216;
                shape4 = shape3;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function225 = composableLambda;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i162 = 16384;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i1722 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i15 = i3 & 131072;
            if (i15 == 0) {
            }
            if ((i3 & 262144) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((32768 & i3) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (i15 == 0) {
            }
            function213 = function226;
            function214 = function227;
            function215 = function231;
            z4 = z6;
            textFieldColors3 = textFieldColors2;
            function216 = function232;
            paddingValues3 = paddingValues2;
            function217 = function210;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i1722 & 14) | (i1722 & 112) | (i1722 & 896) | (i1722 & 7168) | (i1722 & 57344) | (i1722 & 458752) | (i1722 & 3670016) | (i1722 & 29360128) | (i1722 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function218 = function213;
            function219 = function214;
            function220 = function212;
            function221 = function217;
            function222 = function211;
            function223 = function215;
            function224 = function216;
            shape4 = shape3;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function225 = composableLambda;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        int i1622 = 16384;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i17222 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i15 = i3 & 131072;
        if (i15 == 0) {
        }
        if ((i3 & 262144) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((32768 & i3) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (i15 == 0) {
        }
        function213 = function226;
        function214 = function227;
        function215 = function231;
        z4 = z6;
        textFieldColors3 = textFieldColors2;
        function216 = function232;
        paddingValues3 = paddingValues2;
        function217 = function210;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function213, function214, function212, function217, function211, function215, function216, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), (i17222 & 14) | (i17222 & 112) | (i17222 & 896) | (i17222 & 7168) | (i17222 & 57344) | (i17222 & 458752) | (i17222 & 3670016) | (i17222 & 29360128) | (i17222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function218 = function213;
        function219 = function214;
        function220 = function212;
        function221 = function217;
        function222 = function211;
        function223 = function215;
        function224 = function216;
        shape4 = shape3;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function225 = composableLambda;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0149  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(String value, Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function28, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z4;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function215;
        PaddingValues paddingValues3;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-789275592);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)1031@56982L8,1036@57262L589:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i16 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    int i17 = i11;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i17 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i17 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i17 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                        } else if ((i2 & 7168) == 0) {
                            i17 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i16 = 16384;
                                }
                                i17 |= i16;
                            }
                            if ((i2 & 458752) == 0) {
                                i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                            }
                            i15 = i3 & 65536;
                            if (i15 == 0) {
                                i17 |= 1572864;
                            } else if ((i2 & 3670016) == 0) {
                                i17 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                            }
                            if ((i4 & 1533916891) == 306783378 || (2995931 & i17) != 599186 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function224 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function225 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function226 = i9 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i10 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i12 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i13 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function230 = i14 == 0 ? function27 : null;
                                    if ((i3 & 16384) == 0) {
                                        textFieldColors2 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                        i17 &= -57345;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        paddingValues2 = OutlinedTextFieldDefaults.m1908contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i17 &= -458753;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function231 = function226;
                                    if (i15 == 0) {
                                        function29 = function227;
                                        function210 = function228;
                                        function211 = function231;
                                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1153197597, true, new TextFieldDefaults$OutlinedTextFieldDecorationBox$1(z, z6, interactionSource, textFieldColors2, i4, i17));
                                    } else {
                                        function29 = function227;
                                        function210 = function228;
                                        composableLambda = function28;
                                        function211 = function231;
                                    }
                                    function212 = function224;
                                    function213 = function229;
                                    function214 = function225;
                                    z4 = z6;
                                    textFieldColors3 = textFieldColors2;
                                    function215 = function230;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        i17 &= -458753;
                                    }
                                    z4 = z3;
                                    function212 = function2;
                                    function214 = function22;
                                    function211 = function23;
                                    function29 = function24;
                                    function210 = function25;
                                    function213 = function26;
                                    function215 = function27;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composableLambda = function28;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-789275592, i4, i17, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1016)");
                                }
                                composer2 = startRestartGroup;
                                OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function216 = function212;
                                function217 = function214;
                                function218 = function211;
                                function219 = function29;
                                function220 = function210;
                                function221 = function213;
                                function222 = function215;
                                textFieldColors4 = textFieldColors3;
                                paddingValues4 = paddingValues3;
                                function223 = composableLambda;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function216 = function2;
                                function217 = function22;
                                function218 = function23;
                                function219 = function24;
                                function220 = function25;
                                function221 = function26;
                                function222 = function27;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function223 = function28;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TextFieldDefaults$OutlinedTextFieldDecorationBox$2(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function216, function217, function218, function219, function220, function221, function222, textFieldColors4, paddingValues4, function223, i, i2, i3));
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i2 & 458752) == 0) {
                        }
                        i15 = i3 & 65536;
                        if (i15 == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                        if (i15 == 0) {
                        }
                        function212 = function224;
                        function213 = function229;
                        function214 = function225;
                        z4 = z6;
                        textFieldColors3 = textFieldColors2;
                        function215 = function230;
                        paddingValues3 = paddingValues2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z4;
                        function216 = function212;
                        function217 = function214;
                        function218 = function211;
                        function219 = function29;
                        function220 = function210;
                        function221 = function213;
                        function222 = function215;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function223 = composableLambda;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    i15 = i3 & 65536;
                    if (i15 == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function23122 = function226;
                    if (i15 == 0) {
                    }
                    function212 = function224;
                    function213 = function229;
                    function214 = function225;
                    z4 = z6;
                    textFieldColors3 = textFieldColors2;
                    function215 = function230;
                    paddingValues3 = paddingValues2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function216 = function212;
                    function217 = function214;
                    function218 = function211;
                    function219 = function29;
                    function220 = function210;
                    function221 = function213;
                    function222 = function215;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function223 = composableLambda;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i172 = i11;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                i15 = i3 & 65536;
                if (i15 == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function231222 = function226;
                if (i15 == 0) {
                }
                function212 = function224;
                function213 = function229;
                function214 = function225;
                z4 = z6;
                textFieldColors3 = textFieldColors2;
                function215 = function230;
                paddingValues3 = paddingValues2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i172 & 14) | (i172 & 112) | (i172 & 896) | (i172 & 7168) | (i172 & 57344) | (i172 & 458752) | (i172 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function216 = function212;
                function217 = function214;
                function218 = function211;
                function219 = function29;
                function220 = function210;
                function221 = function213;
                function222 = function215;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function223 = composableLambda;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i162 = 8192;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i1722 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i15 = i3 & 65536;
            if (i15 == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function2312222 = function226;
            if (i15 == 0) {
            }
            function212 = function224;
            function213 = function229;
            function214 = function225;
            z4 = z6;
            textFieldColors3 = textFieldColors2;
            function215 = function230;
            paddingValues3 = paddingValues2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i1722 & 14) | (i1722 & 112) | (i1722 & 896) | (i1722 & 7168) | (i1722 & 57344) | (i1722 & 458752) | (i1722 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function216 = function212;
            function217 = function214;
            function218 = function211;
            function219 = function29;
            function220 = function210;
            function221 = function213;
            function222 = function215;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function223 = composableLambda;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        int i1622 = 8192;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i17222 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i15 = i3 & 65536;
        if (i15 == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function23122222 = function226;
        if (i15 == 0) {
        }
        function212 = function224;
        function213 = function229;
        function214 = function225;
        z4 = z6;
        textFieldColors3 = textFieldColors2;
        function215 = function230;
        paddingValues3 = paddingValues2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function212, function214, function211, function29, function210, function213, function215, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12582912 | (i17222 & 14) | (i17222 & 112) | (i17222 & 896) | (i17222 & 7168) | (i17222 & 57344) | (i17222 & 458752) | (i17222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function216 = function212;
        function217 = function214;
        function218 = function211;
        function219 = function29;
        function220 = function210;
        function221 = function213;
        function222 = function215;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function223 = composableLambda;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2130textFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(-595874869);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(28:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,27,19:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,10:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,26:c#ui.graphics.Color,5:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,7:c#ui.graphics.Color,16:c#ui.graphics.Color)1060@58072L9,1061@58159L9,1063@58309L9,1064@58382L9,1065@58470L9,1066@58553L7,1067@58649L9,1068@58744L9,1069@58846L9,1071@59022L9,1072@59118L9,1073@59211L9,1074@59311L9,1076@59481L9,1077@59579L9,1078@59674L9,1079@59776L9,1081@59949L9,1082@60033L9,1083@60114L9,1084@60202L9,1086@60354L9,1087@60443L9,1088@60537L9,1090@60705L9,1091@60800L9,1092@60902L9,1094@61073L9,1095@61159L9,1096@61247L9,1097@61334L9,1099@61488L9,1100@61574L9,1101@61662L9,1102@61749L9,1104@61903L9,1105@61939L2261:TextFieldDefaults.kt#uh7d8r");
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long m3290copywmQWz5c$default = (i5 & 2) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j3;
        long color3 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color4 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        if ((i5 & 32) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color5 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j6;
        long color6 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j7;
        long m3290copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color7 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j9;
        long color8 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color9 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long m3290copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color10 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color11 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color12 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long m3290copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color13 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color14 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color15 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long m3290copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color16 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color17 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long m3290copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color18 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color19 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long m3290copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color20 = (134217728 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color21 = (268435456 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color22 = (536870912 & i5) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long m3290copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color23 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color24 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color25 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long m3290copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color26 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1059)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i >> 15;
        int i14 = i2 << 15;
        int i15 = (i13 & 57344) | (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i2 >> 15;
        int i17 = i3 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128);
        int i19 = i3 << 18;
        int i20 = i18 | (i19 & 234881024) | (i19 & 1879048192);
        int i21 = i3 >> 9;
        int i22 = ((i3 >> 6) & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016);
        int i23 = i4 << 21;
        int i24 = i22 | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i4 >> 9;
        TextFieldColors m2115colors0hiis_0 = m2115colors0hiis_0(color, color, m3290copywmQWz5c$default, color, color2, color2, color2, color2, color3, color4, textSelectionColors2, color5, color6, m3290copywmQWz5c$default2, color7, color8, color9, m3290copywmQWz5c$default3, color10, color11, color12, m3290copywmQWz5c$default4, color13, color14, color15, m3290copywmQWz5c$default5, color16, color17, color17, m3290copywmQWz5c$default6, color17, color18, color19, m3290copywmQWz5c$default7, color20, color21, color22, m3290copywmQWz5c$default8, color23, color24, color25, m3290copywmQWz5c$default9, color26, composer, i12, i15, i20, i24, (i25 & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2115colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-eS1Emto  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2126outlinedTextFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(1767818445);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(28:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,27,19:c#ui.graphics.Color,29:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.graphics.Color,21:c#ui.graphics.Color,31:c#ui.graphics.Color,4:c#ui.graphics.Color,14:c#ui.graphics.Color,25:c#ui.graphics.Color,35:c#ui.graphics.Color,10:c#ui.graphics.Color,18:c#ui.graphics.Color,20:c#ui.graphics.Color,30:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.graphics.Color,26:c#ui.graphics.Color,5:c#ui.graphics.Color,24:c#ui.graphics.Color,34:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,22:c#ui.graphics.Color,32:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,23:c#ui.graphics.Color,33:c#ui.graphics.Color,7:c#ui.graphics.Color,16:c#ui.graphics.Color)1155@64431L9,1156@64520L9,1159@64718L9,1160@64808L9,1161@64891L7,1162@64978L9,1163@65064L9,1164@65157L9,1166@65318L9,1167@65416L9,1168@65511L9,1169@65613L9,1171@65787L9,1172@65887L9,1173@65984L9,1175@66101L9,1176@66265L9,1177@66351L9,1178@66434L9,1179@66524L9,1181@66680L9,1182@66771L9,1183@66867L9,1185@67039L9,1186@67136L9,1188@67253L9,1189@67415L9,1190@67503L9,1191@67593L9,1192@67682L9,1194@67840L9,1195@67928L9,1196@68018L9,1197@68107L9,1199@68265L9,1200@68327L2237:TextFieldDefaults.kt#uh7d8r");
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long m3290copywmQWz5c$default = (i5 & 2) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3326getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j3;
        long color2 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color3 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        if ((i5 & 32) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color4 = (i5 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j6;
        long color5 = (i5 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j7;
        long m3290copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color6 = (i5 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j9;
        long color7 = (i5 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color8 = (i5 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long m3290copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color9 = (i5 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color10 = (i5 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color11 = (32768 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long m3290copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color12 = (131072 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color14 = (524288 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long m3290copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color15 = (2097152 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long m3290copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color18 = (33554432 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long m3290copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color19 = (134217728 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long color20 = (268435456 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long color21 = (536870912 & i5) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long m3290copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color22 = (i6 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long color23 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long color24 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long m3290copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color25 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1154)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i >> 15;
        int i14 = i2 << 15;
        int i15 = (i13 & 57344) | (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i2 >> 15;
        int i17 = i3 << 15;
        int i18 = (i16 & 57344) | (i16 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128);
        int i19 = i3 << 18;
        int i20 = i18 | (i19 & 234881024) | (i19 & 1879048192);
        int i21 = i3 >> 9;
        int i22 = ((i3 >> 6) & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016);
        int i23 = i4 << 21;
        int i24 = i22 | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i4 >> 9;
        TextFieldColors m1910colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(color, color, m3290copywmQWz5c$default, color, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU, m3326getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, m3290copywmQWz5c$default2, color6, color7, color8, m3290copywmQWz5c$default3, color9, color10, color11, m3290copywmQWz5c$default4, color12, color13, color14, m3290copywmQWz5c$default5, color15, color16, color16, m3290copywmQWz5c$default6, color16, color17, color18, m3290copywmQWz5c$default7, color19, color20, color21, m3290copywmQWz5c$default8, color22, color23, color24, m3290copywmQWz5c$default9, color25, composer, i12, i15, i20, i24, (i25 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i25 & 112) | (i25 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1910colors0hiis_0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c1, code lost:
        if (r6.changed(r131) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
        if (r6.changed(r132) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void TextFieldDecorationBox(String value, Function2 innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function2 function27;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors3;
        Function2 function28;
        PaddingValues paddingValues3;
        ComposableLambda composableLambda;
        Function2 function29;
        boolean z4;
        Shape shape3;
        Function2 function210;
        Function2 function211;
        Composer composer2;
        boolean z5;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Shape shape4;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2 function216;
        Function2 function217;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1224712461);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)P(14,4,3,11,15,5,6,7,9,8,13,12,10!1,2)1262@71315L5,1263@71356L8,1274@71711L684:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            int i16 = 2048;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                int i17 = 16384;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(shape)) {
                            i15 = 256;
                            i11 |= i15;
                        }
                        i15 = 128;
                        i11 |= i15;
                    }
                    if ((i2 & 7168) == 0) {
                        if ((i3 & 8192) != 0) {
                        }
                        i16 = 1024;
                        i11 |= i16;
                    }
                    if ((i2 & 57344) == 0) {
                        if ((i3 & 16384) != 0) {
                        }
                        i17 = 8192;
                        i11 |= i17;
                    }
                    i13 = i3 & 32768;
                    if (i13 == 0) {
                        i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & 458752) == 0) {
                        i11 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                    }
                    if ((i3 & 65536) == 0) {
                        i11 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i11 |= startRestartGroup.changed(this) ? 1048576 : 524288;
                    }
                    i14 = i11;
                    if ((i4 & 1533916891) == 306783378 || (2995931 & i14) != 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            boolean z6 = i6 == 0 ? false : z3;
                            Function2 function218 = i7 == 0 ? null : function2;
                            Function2 function219 = i8 == 0 ? null : function22;
                            Function2 function220 = i9 == 0 ? null : function23;
                            Function2 function221 = i10 == 0 ? null : function24;
                            Function2 function222 = i12 == 0 ? null : function25;
                            if ((i3 & 4096) == 0) {
                                function27 = function220;
                                shape2 = INSTANCE.getShape(startRestartGroup, 6);
                                i14 &= -897;
                            } else {
                                function27 = function220;
                                shape2 = shape;
                            }
                            if ((i3 & 8192) == 0) {
                                textFieldColors2 = m2115colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, (i14 >> 9) & 7168, Integer.MAX_VALUE, 4095);
                                i14 &= -7169;
                            } else {
                                textFieldColors2 = textFieldColors;
                            }
                            Function2 function223 = function221;
                            if ((i3 & 16384) == 0) {
                                if (function218 == null) {
                                    paddingValues2 = m2106contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValues2 = m2105contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i14 &= -57345;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            if (i13 == 0) {
                                textFieldColors3 = textFieldColors2;
                                function28 = function222;
                                paddingValues3 = paddingValues2;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1171460386, true, new TextFieldDefaults$TextFieldDecorationBox$3(z, z6, interactionSource, textFieldColors2, shape2, i4, i14));
                            } else {
                                textFieldColors3 = textFieldColors2;
                                function28 = function222;
                                paddingValues3 = paddingValues2;
                                composableLambda = function26;
                            }
                            function29 = function218;
                            z4 = z6;
                            shape3 = shape2;
                            function210 = function219;
                            function211 = function223;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4096) != 0) {
                                i14 &= -897;
                            }
                            if ((i3 & 8192) != 0) {
                                i14 &= -7169;
                            }
                            if ((i3 & 16384) != 0) {
                                i14 &= -57345;
                            }
                            z4 = z3;
                            function29 = function2;
                            function210 = function22;
                            function27 = function23;
                            function211 = function24;
                            function28 = function25;
                            shape3 = shape;
                            textFieldColors3 = textFieldColors;
                            paddingValues3 = paddingValues;
                            composableLambda = function26;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1224712461, i4, i14, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:1249)");
                        }
                        int i18 = i14 << 6;
                        composer2 = startRestartGroup;
                        DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function29, function210, function27, function211, null, null, function28, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (234881024 & i4) | (i4 & 1879048192), (i14 & 14) | 432 | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function212 = function29;
                        function213 = function210;
                        function214 = function211;
                        function215 = function28;
                        shape4 = shape3;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function216 = composableLambda;
                        function217 = function27;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        function212 = function2;
                        function213 = function22;
                        function217 = function23;
                        function214 = function24;
                        function215 = function25;
                        shape4 = shape;
                        textFieldColors4 = textFieldColors;
                        paddingValues4 = paddingValues;
                        function216 = function26;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TextFieldDefaults$TextFieldDecorationBox$4(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function212, function213, function217, function214, function215, shape4, textFieldColors4, paddingValues4, function216, i, i2, i3));
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                if ((i2 & 7168) == 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                i13 = i3 & 32768;
                if (i13 == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                i14 = i11;
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                Function2 function2232 = function221;
                if ((i3 & 16384) == 0) {
                }
                if (i13 == 0) {
                }
                function29 = function218;
                z4 = z6;
                shape3 = shape2;
                function210 = function219;
                function211 = function2232;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i182 = i14 << 6;
                composer2 = startRestartGroup;
                DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function29, function210, function27, function211, null, null, function28, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (234881024 & i4) | (i4 & 1879048192), (i14 & 14) | 432 | (i182 & 7168) | (i182 & 57344) | (i182 & 458752) | (i182 & 3670016) | (i182 & 29360128) | (i182 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function212 = function29;
                function213 = function210;
                function214 = function211;
                function215 = function28;
                shape4 = shape3;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function216 = composableLambda;
                function217 = function27;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i172 = 16384;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            i13 = i3 & 32768;
            if (i13 == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            i14 = i11;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            Function2 function22322 = function221;
            if ((i3 & 16384) == 0) {
            }
            if (i13 == 0) {
            }
            function29 = function218;
            z4 = z6;
            shape3 = shape2;
            function210 = function219;
            function211 = function22322;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1822 = i14 << 6;
            composer2 = startRestartGroup;
            DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function29, function210, function27, function211, null, null, function28, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (234881024 & i4) | (i4 & 1879048192), (i14 & 14) | 432 | (i1822 & 7168) | (i1822 & 57344) | (i1822 & 458752) | (i1822 & 3670016) | (i1822 & 29360128) | (i1822 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function212 = function29;
            function213 = function210;
            function214 = function211;
            function215 = function28;
            shape4 = shape3;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function216 = composableLambda;
            function217 = function27;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        int i162 = 2048;
        if ((i3 & 8) == 0) {
        }
        int i1722 = 16384;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i13 = i3 & 32768;
        if (i13 == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        i14 = i11;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        Function2 function223222 = function221;
        if ((i3 & 16384) == 0) {
        }
        if (i13 == 0) {
        }
        function29 = function218;
        z4 = z6;
        shape3 = shape2;
        function210 = function219;
        function211 = function223222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i18222 = i14 << 6;
        composer2 = startRestartGroup;
        DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, function29, function210, function27, function211, null, null, function28, shape3, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (234881024 & i4) | (i4 & 1879048192), (i14 & 14) | 432 | (i18222 & 7168) | (i18222 & 57344) | (i18222 & 458752) | (i18222 & 3670016) | (i18222 & 29360128) | (i18222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function212 = function29;
        function213 = function210;
        function214 = function211;
        function215 = function28;
        shape4 = shape3;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function216 = composableLambda;
        function217 = function27;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01bf, code lost:
        if (r6.changed(r128) == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(String value, Function2 innerTextField, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2 function27;
        Function2 function28;
        ComposableLambda composableLambda;
        TextFieldColors textFieldColors3;
        Function2 function29;
        boolean z4;
        Function2 function210;
        Object obj2;
        PaddingValues paddingValues3;
        Composer composer2;
        boolean z5;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues4;
        Function2 function216;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(508645792);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)P(13,4,3,10,14,5,6,7,9,8,12,11!1,2)1312@73179L8,1318@73467L656:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        int i15 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            int i16 = 2048;
            if ((i3 & 8) == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        obj = function2;
                    } else {
                        Object obj3 = function2;
                        obj = obj3;
                        if ((i & 29360128) == 0) {
                            i4 |= startRestartGroup.changedInstance(obj3) ? 8388608 : 4194304;
                            obj = obj3;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i11 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i15 = 256;
                        }
                        i11 |= i15;
                    }
                    if ((i2 & 7168) == 0) {
                        if ((i3 & 8192) != 0) {
                        }
                        i16 = 1024;
                        i11 |= i16;
                    }
                    i13 = i11;
                    i14 = i3 & 16384;
                    if (i14 == 0) {
                        i13 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i13 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                    }
                    if ((i4 & 1533916891) == 306783378 || (46811 & i13) != 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            boolean z6 = i6 == 0 ? false : z3;
                            if (i7 != 0) {
                                obj = null;
                            }
                            Function2 function217 = i8 == 0 ? null : function22;
                            Function2 function218 = i9 == 0 ? null : function23;
                            Function2 function219 = i10 == 0 ? null : function24;
                            Function2 function220 = i12 == 0 ? function25 : null;
                            if ((i3 & 4096) == 0) {
                                textFieldColors2 = OutlinedTextFieldDefaults.INSTANCE.m1910colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 0, 0, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Integer.MAX_VALUE, 4095);
                                i13 &= -897;
                            } else {
                                textFieldColors2 = textFieldColors;
                            }
                            if ((i3 & 8192) == 0) {
                                paddingValues2 = OutlinedTextFieldDefaults.m1908contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i13 &= -7169;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            if (i14 == 0) {
                                function27 = function218;
                                function28 = function219;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 144282315, true, new TextFieldDefaults$OutlinedTextFieldDecorationBox$3(z, z6, interactionSource, textFieldColors2, i4, i13));
                            } else {
                                function27 = function218;
                                function28 = function219;
                                composableLambda = function26;
                            }
                            textFieldColors3 = textFieldColors2;
                            function29 = function217;
                            z4 = z6;
                            function210 = function220;
                            obj2 = obj;
                            paddingValues3 = paddingValues2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4096) != 0) {
                                i13 &= -897;
                            }
                            if ((i3 & 8192) != 0) {
                                i13 &= -7169;
                            }
                            z4 = z3;
                            function29 = function22;
                            function27 = function23;
                            function28 = function24;
                            function210 = function25;
                            textFieldColors3 = textFieldColors;
                            paddingValues3 = paddingValues;
                            composableLambda = function26;
                            obj2 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(508645792, i4, i13, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1299)");
                        }
                        int i17 = i13 << 6;
                        composer2 = startRestartGroup;
                        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, obj2, function29, function27, function28, null, null, function210, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12583344 | (i13 & 14) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function211 = obj2;
                        function212 = function29;
                        function213 = function27;
                        function214 = function28;
                        function215 = function210;
                        textFieldColors4 = textFieldColors3;
                        paddingValues4 = paddingValues3;
                        function216 = composableLambda;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        function212 = function22;
                        function213 = function23;
                        function215 = function25;
                        textFieldColors4 = textFieldColors;
                        paddingValues4 = paddingValues;
                        function216 = function26;
                        composer2 = startRestartGroup;
                        function211 = obj;
                        function214 = function24;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TextFieldDefaults$OutlinedTextFieldDecorationBox$4(this, value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function211, function212, function213, function214, function215, textFieldColors4, paddingValues4, function216, i, i2, i3));
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                if ((i2 & 7168) == 0) {
                }
                i13 = i11;
                i14 = i3 & 16384;
                if (i14 == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if (i14 == 0) {
                }
                textFieldColors3 = textFieldColors2;
                function29 = function217;
                z4 = z6;
                function210 = function220;
                obj2 = obj;
                paddingValues3 = paddingValues2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i172 = i13 << 6;
                composer2 = startRestartGroup;
                OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, obj2, function29, function27, function28, null, null, function210, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12583344 | (i13 & 14) | (i172 & 7168) | (i172 & 57344) | (i172 & 458752) | (i172 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function211 = obj2;
                function212 = function29;
                function213 = function27;
                function214 = function28;
                function215 = function210;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function216 = composableLambda;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            i13 = i11;
            i14 = i3 & 16384;
            if (i14 == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if (i14 == 0) {
            }
            textFieldColors3 = textFieldColors2;
            function29 = function217;
            z4 = z6;
            function210 = function220;
            obj2 = obj;
            paddingValues3 = paddingValues2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1722 = i13 << 6;
            composer2 = startRestartGroup;
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, obj2, function29, function27, function28, null, null, function210, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12583344 | (i13 & 14) | (i1722 & 7168) | (i1722 & 57344) | (i1722 & 458752) | (i1722 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function211 = obj2;
            function212 = function29;
            function213 = function27;
            function214 = function28;
            function215 = function210;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function216 = composableLambda;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        int i162 = 2048;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        i13 = i11;
        i14 = i3 & 16384;
        if (i14 == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if (i14 == 0) {
        }
        textFieldColors3 = textFieldColors2;
        function29 = function217;
        z4 = z6;
        function210 = function220;
        obj2 = obj;
        paddingValues3 = paddingValues2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i17222 = i13 << 6;
        composer2 = startRestartGroup;
        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z4, obj2, function29, function27, function28, null, null, function210, textFieldColors3, paddingValues3, composableLambda, composer2, (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 12583344 | (i13 & 14) | (i17222 & 7168) | (i17222 & 57344) | (i17222 & 458752) | (i17222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function211 = obj2;
        function212 = function29;
        function213 = function27;
        function214 = function28;
        function215 = function210;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function216 = composableLambda;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m2124indicatorLinegv0btCI(Modifier indicatorLine, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors colors, float f, float f2) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z2, interactionSource, colors, f, f2) : InspectableValueKt.getNoInspectorInfo(), new TextFieldDefaults$indicatorLine$2(z, z2, interactionSource, colors, f, f2));
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(1);
        UnfocusedIndicatorThickness = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(2);
        FocusedIndicatorThickness = m5607constructorimpl2;
        UnfocusedBorderThickness = m5607constructorimpl;
        FocusedBorderThickness = m5607constructorimpl2;
    }
}
