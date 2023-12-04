package com.ifriend.ui.imageView.touchImageView;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ifriend.ui.R;
import com.ortiz.touchview.FixedPixel;
import com.ortiz.touchview.ImageActionState;
import com.ortiz.touchview.OnTouchCoordinatesListener;
import com.ortiz.touchview.OnTouchImageViewListener;
import com.ortiz.touchview.OnZoomFinishedListener;
import com.ortiz.touchview.ZoomVariables;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TouchImageView.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 Ç\u00012\u00020\u0001:\u0010Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010b\u001a\u00020!2\u0006\u0010c\u001a\u00020\u0007H\u0016J\u0010\u0010d\u001a\u00020!2\u0006\u0010c\u001a\u00020\u0007H\u0007J\u0010\u0010e\u001a\u00020!2\u0006\u0010c\u001a\u00020\u0007H\u0016J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH\u0003J\b\u0010j\u001a\u00020gH\u0002J\b\u0010k\u001a\u00020gH\u0002J\b\u0010l\u001a\u00020gH\u0002J\u0012\u0010m\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010oH\u0002J\u0012\u0010p\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010oH\u0002J \u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\nH\u0002J(\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010w\u001a\u00020\nH\u0002J\b\u0010x\u001a\u00020UH\u0016JB\u0010y\u001a\u00020\n2\u0006\u0010v\u001a\u00020\n2\u0006\u0010z\u001a\u00020\n2\u0006\u0010{\u001a\u00020\n2\u0006\u0010|\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00072\u0006\u0010}\u001a\u00020\u00072\b\u0010~\u001a\u0004\u0018\u00010;H\u0002J\u0012\u0010\u007f\u001a\u00020g2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016J\u0013\u0010\u0082\u0001\u001a\u00020g2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0014J\u001b\u0010\u0085\u0001\u001a\u00020g2\u0007\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0014J\u0013\u0010\u0088\u0001\u001a\u00020g2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\f\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016J-\u0010\u008c\u0001\u001a\u00020g2\u0007\u0010\u008d\u0001\u001a\u00020\u00072\u0007\u0010\u008e\u0001\u001a\u00020\u00072\u0007\u0010\u008f\u0001\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u0007H\u0014J\u0013\u0010\u0091\u0001\u001a\u00020!2\b\u0010n\u001a\u0004\u0018\u00010oH\u0002J\u0007\u0010\u0092\u0001\u001a\u00020gJ\u0007\u0010\u0093\u0001\u001a\u00020gJ\u0007\u0010\u0094\u0001\u001a\u00020gJ.\u0010\u0095\u0001\u001a\u00020g2\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u009a\u0001\u001a\u00020!H\u0002J\u0015\u0010\u009b\u0001\u001a\u00020g2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0016J\u0013\u0010\u009e\u0001\u001a\u00020g2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\u0012\u0010\u009f\u0001\u001a\u00020g2\u0007\u0010 \u0001\u001a\u00020\u0007H\u0016J\u0015\u0010¡\u0001\u001a\u00020g2\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016J\u000f\u0010¤\u0001\u001a\u00020g2\u0006\u0010/\u001a\u00020\nJ\u0010\u0010¥\u0001\u001a\u00020g2\u0007\u0010¦\u0001\u001a\u00020\u0011J\u0010\u0010§\u0001\u001a\u00020g2\u0007\u0010¨\u0001\u001a\u00020PJ\u0010\u0010©\u0001\u001a\u00020g2\u0007\u0010ª\u0001\u001a\u00020RJ\u0014\u0010«\u0001\u001a\u00020g2\t\u0010¬\u0001\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010\u00ad\u0001\u001a\u00020g2\u0007\u0010®\u0001\u001a\u00020!J\u0012\u0010¯\u0001\u001a\u00020g2\u0007\u0010°\u0001\u001a\u00020UH\u0016J\u0019\u0010±\u0001\u001a\u00020g2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\nJ\u0011\u0010²\u0001\u001a\u00020g2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010³\u0001\u001a\u00020\u00072\u0007\u0010´\u0001\u001a\u00020\u00072\u0007\u0010µ\u0001\u001a\u00020\u00072\u0007\u0010¶\u0001\u001a\u00020\u0007H\u0002J\u0010\u0010·\u0001\u001a\u00020g2\u0007\u0010¸\u0001\u001a\u00020\u0000J\u0010\u0010·\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\nJ\"\u0010·\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\nJ-\u0010·\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\n2\t\u0010º\u0001\u001a\u0004\u0018\u00010UJ\"\u0010»\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\nJ.\u0010»\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\n2\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001J+\u0010»\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010¾\u0001\u001a\u00020\u0007J7\u0010»\u0001\u001a\u00020g2\u0007\u0010¹\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010¾\u0001\u001a\u00020\u00072\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001J\u001b\u0010¿\u0001\u001a\u00020J2\u0007\u0010À\u0001\u001a\u00020\n2\u0007\u0010Á\u0001\u001a\u00020\nH\u0004J$\u0010Â\u0001\u001a\u00020J2\u0007\u0010Ã\u0001\u001a\u00020\n2\u0007\u0010Ä\u0001\u001a\u00020\n2\u0007\u0010Å\u0001\u001a\u00020!H\u0004R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u000e\u0010$\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010&R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u0015R\u000e\u00103\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u0015R\u000e\u00108\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010I\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Z\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010=\"\u0004\b\\\u0010?R\u000e\u0010]\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010^\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006Î\u0001"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "currentZoom", "getCurrentZoom", "()F", "delayedZoomVariables", "Lcom/ortiz/touchview/ZoomVariables;", "doubleTapListener", "Landroid/view/GestureDetector$OnDoubleTapListener;", "doubleTapScale", "getDoubleTapScale", "setDoubleTapScale", "(F)V", "fling", "Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$Fling;", "floatMatrix", "", "gestureDetector", "Landroid/view/GestureDetector;", "imageActionState", "Lcom/ortiz/touchview/ImageActionState;", "imageHeight", "getImageHeight", "imageRenderedAtLeastOnce", "", "imageWidth", "getImageWidth", "isRotateImageToFitScreen", "isZoomEnabled", "()Z", "setZoomEnabled", "(Z)V", "isZoomed", "matchViewHeight", "matchViewWidth", "maxScale", "maxScaleIsSetByMultiplier", "maxScaleMultiplier", "max", "maxZoom", "getMaxZoom", "setMaxZoom", "minScale", "min", "minZoom", "getMinZoom", "setMinZoom", "onDrawReady", "orientation", "orientationChangeFixedPixel", "Lcom/ortiz/touchview/FixedPixel;", "getOrientationChangeFixedPixel", "()Lcom/ortiz/touchview/FixedPixel;", "setOrientationChangeFixedPixel", "(Lcom/ortiz/touchview/FixedPixel;)V", "orientationJustChanged", "prevMatchViewHeight", "prevMatchViewWidth", "prevMatrix", "Landroid/graphics/Matrix;", "prevViewHeight", "prevViewWidth", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "scrollPosition", "Landroid/graphics/PointF;", "getScrollPosition", "()Landroid/graphics/PointF;", "superMaxScale", "superMinScale", "touchCoordinatesListener", "Lcom/ortiz/touchview/OnTouchCoordinatesListener;", "touchImageViewListener", "Lcom/ortiz/touchview/OnTouchImageViewListener;", "touchMatrix", "touchScaleType", "Landroid/widget/ImageView$ScaleType;", "userSpecifiedMinScale", "userTouchListener", "Landroid/view/View$OnTouchListener;", "viewHeight", "viewSizeChangeFixedPixel", "getViewSizeChangeFixedPixel", "setViewSizeChangeFixedPixel", "viewWidth", "zoomedRect", "Landroid/graphics/RectF;", "getZoomedRect", "()Landroid/graphics/RectF;", "canScrollHorizontally", "direction", "canScrollHorizontallyFroyo", "canScrollVertically", "compatPostOnAnimation", "", "runnable", "Ljava/lang/Runnable;", "fitImageToView", "fixScaleTrans", "fixTrans", "getDrawableHeight", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawableWidth", "getFixDragTrans", "delta", "viewSize", "contentSize", "getFixTrans", "trans", TypedValues.CycleType.S_WAVE_OFFSET, "getScaleType", "newTranslationAfterChange", "prevImageSize", "imageSize", "prevViewSize", "drawableSize", "sizeChangeFixedPixel", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSizeChanged", "w", "h", "oldw", "oldh", "orientationMismatch", "resetZoom", "resetZoomAnimated", "savePreviousImageValues", "scaleImage", "deltaScale", "", "focusX", "focusY", "stretchImageToSuper", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "setMaxZoomRatio", "setOnDoubleTapListener", "onDoubleTapListener", "setOnTouchCoordinatesListener", "onTouchCoordinatesListener", "setOnTouchImageViewListener", "onTouchImageViewListener", "setOnTouchListener", "onTouchListener", "setRotateImageToFitScreen", "rotateImageToFitScreen", "setScaleType", "type", "setScrollPosition", "setState", "setViewSize", RtspHeaders.Values.MODE, "size", "drawableWidth", "setZoom", "img", "scale", "scaleType", "setZoomAnimated", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ortiz/touchview/OnZoomFinishedListener;", "zoomTimeMs", "transformCoordBitmapToTouch", "bx", "by", "transformCoordTouchToBitmap", "x", "y", "clipToBitmap", "AnimatedZoom", "Companion", "CompatScroller", "DoubleTapZoom", "Fling", "GestureListener", "PrivateOnTouchListener", "ScaleListener", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class TouchImageView extends AppCompatImageView {
    public static final float AUTOMATIC_MIN_ZOOM = -1.0f;
    private static final int DEFAULT_ZOOM_TIME = 500;
    private static final float SUPER_MAX_MULTIPLIER = 1.25f;
    private static final float SUPER_MIN_MULTIPLIER = 0.75f;
    private float currentZoom;
    private ZoomVariables delayedZoomVariables;
    private GestureDetector.OnDoubleTapListener doubleTapListener;
    private float doubleTapScale;
    private Fling fling;
    private float[] floatMatrix;
    private GestureDetector gestureDetector;
    private ImageActionState imageActionState;
    private boolean imageRenderedAtLeastOnce;
    private boolean isRotateImageToFitScreen;
    private boolean isZoomEnabled;
    private float matchViewHeight;
    private float matchViewWidth;
    private float maxScale;
    private boolean maxScaleIsSetByMultiplier;
    private float maxScaleMultiplier;
    private float minScale;
    private boolean onDrawReady;
    private int orientation;
    private FixedPixel orientationChangeFixedPixel;
    private boolean orientationJustChanged;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    private ScaleGestureDetector scaleDetector;
    private float superMaxScale;
    private float superMinScale;
    private OnTouchCoordinatesListener touchCoordinatesListener;
    private OnTouchImageViewListener touchImageViewListener;
    private Matrix touchMatrix;
    private ImageView.ScaleType touchScaleType;
    private float userSpecifiedMinScale;
    private View.OnTouchListener userTouchListener;
    private int viewHeight;
    private FixedPixel viewSizeChangeFixedPixel;
    private int viewWidth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TouchImageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFixDragTrans(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    private final float getFixTrans(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= f2) {
            f5 = (f2 + f4) - f3;
        } else {
            f4 = (f2 + f4) - f3;
            f5 = f4;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.orientationChangeFixedPixel = FixedPixel.CENTER;
        this.viewSizeChangeFixedPixel = FixedPixel.CENTER;
        super.setClickable(true);
        this.orientation = getResources().getConfiguration().orientation;
        this.scaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.touchMatrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.floatMatrix = new float[9];
        this.currentZoom = 1.0f;
        if (this.touchScaleType == null) {
            this.touchScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = 1.0f * 0.75f;
        this.superMaxScale = 3.0f * SUPER_MAX_MULTIPLIER;
        setImageMatrix(this.touchMatrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(ImageActionState.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TouchImageView, i, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (!isInEditMode()) {
                this.isZoomEnabled = obtainStyledAttributes.getBoolean(R.styleable.TouchImageView_zoom_enabled, true);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float getCurrentZoom() {
        return this.currentZoom;
    }

    public final boolean isZoomEnabled() {
        return this.isZoomEnabled;
    }

    public final void setZoomEnabled(boolean z) {
        this.isZoomEnabled = z;
    }

    public final FixedPixel getOrientationChangeFixedPixel() {
        return this.orientationChangeFixedPixel;
    }

    public final void setOrientationChangeFixedPixel(FixedPixel fixedPixel) {
        this.orientationChangeFixedPixel = fixedPixel;
    }

    public final FixedPixel getViewSizeChangeFixedPixel() {
        return this.viewSizeChangeFixedPixel;
    }

    public final void setViewSizeChangeFixedPixel(FixedPixel fixedPixel) {
        this.viewSizeChangeFixedPixel = fixedPixel;
    }

    public final float getDoubleTapScale() {
        return this.doubleTapScale;
    }

    public final void setDoubleTapScale(float f) {
        this.doubleTapScale = f;
    }

    public final void setRotateImageToFitScreen(boolean z) {
        this.isRotateImageToFitScreen = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    public final void setOnTouchImageViewListener(OnTouchImageViewListener onTouchImageViewListener) {
        Intrinsics.checkNotNullParameter(onTouchImageViewListener, "onTouchImageViewListener");
        this.touchImageViewListener = onTouchImageViewListener;
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        Intrinsics.checkNotNullParameter(onDoubleTapListener, "onDoubleTapListener");
        this.doubleTapListener = onDoubleTapListener;
    }

    public final void setOnTouchCoordinatesListener(OnTouchCoordinatesListener onTouchCoordinatesListener) {
        Intrinsics.checkNotNullParameter(onTouchCoordinatesListener, "onTouchCoordinatesListener");
        this.touchCoordinatesListener = onTouchCoordinatesListener;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == ImageView.ScaleType.MATRIX) {
            super.setScaleType(ImageView.ScaleType.MATRIX);
            return;
        }
        this.touchScaleType = type;
        if (this.onDrawReady) {
            setZoom(this);
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.touchScaleType;
        Intrinsics.checkNotNull(scaleType);
        return scaleType;
    }

    public final boolean isZoomed() {
        return !(this.currentZoom == 1.0f);
    }

    public final RectF getZoomedRect() {
        if (this.touchScaleType == ImageView.ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(0.0f, 0.0f, true);
        PointF transformCoordTouchToBitmap2 = transformCoordTouchToBitmap(this.viewWidth, this.viewHeight, true);
        float drawableWidth = getDrawableWidth(getDrawable());
        float drawableHeight = getDrawableHeight(getDrawable());
        return new RectF(transformCoordTouchToBitmap.x / drawableWidth, transformCoordTouchToBitmap.y / drawableHeight, transformCoordTouchToBitmap2.x / drawableWidth, transformCoordTouchToBitmap2.y / drawableHeight);
    }

    public final void savePreviousImageValues() {
        if (this.viewHeight == 0 || this.viewWidth == 0) {
            return;
        }
        this.touchMatrix.getValues(this.floatMatrix);
        this.prevMatrix.setValues(this.floatMatrix);
        this.prevMatchViewHeight = this.matchViewHeight;
        this.prevMatchViewWidth = this.matchViewWidth;
        this.prevViewHeight = this.viewHeight;
        this.prevViewWidth = this.viewWidth;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("orientation", this.orientation);
        bundle.putFloat("saveScale", this.currentZoom);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt("viewWidth", this.viewWidth);
        bundle.putInt("viewHeight", this.viewHeight);
        this.touchMatrix.getValues(this.floatMatrix);
        bundle.putFloatArray("matrix", this.floatMatrix);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.viewSizeChangeFixedPixel);
        bundle.putSerializable("orientationChangeFixedPixel", this.orientationChangeFixedPixel);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.currentZoom = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            Intrinsics.checkNotNull(floatArray);
            this.floatMatrix = floatArray;
            this.prevMatrix.setValues(floatArray);
            this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
            this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
            this.prevViewHeight = bundle.getInt("viewHeight");
            this.prevViewWidth = bundle.getInt("viewWidth");
            this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
            this.viewSizeChangeFixedPixel = (FixedPixel) bundle.getSerializable("viewSizeChangeFixedPixel");
            this.orientationChangeFixedPixel = (FixedPixel) bundle.getSerializable("orientationChangeFixedPixel");
            if (this.orientation != bundle.getInt("orientation")) {
                this.orientationJustChanged = true;
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.onDrawReady = true;
        this.imageRenderedAtLeastOnce = true;
        ZoomVariables zoomVariables = this.delayedZoomVariables;
        if (zoomVariables != null) {
            Intrinsics.checkNotNull(zoomVariables);
            float scale = zoomVariables.getScale();
            ZoomVariables zoomVariables2 = this.delayedZoomVariables;
            Intrinsics.checkNotNull(zoomVariables2);
            float focusX = zoomVariables2.getFocusX();
            ZoomVariables zoomVariables3 = this.delayedZoomVariables;
            Intrinsics.checkNotNull(zoomVariables3);
            float focusY = zoomVariables3.getFocusY();
            ZoomVariables zoomVariables4 = this.delayedZoomVariables;
            Intrinsics.checkNotNull(zoomVariables4);
            setZoom(scale, focusX, focusY, zoomVariables4.getScaleType());
            this.delayedZoomVariables = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i = getResources().getConfiguration().orientation;
        if (i != this.orientation) {
            this.orientationJustChanged = true;
            this.orientation = i;
        }
        savePreviousImageValues();
    }

    public final float getMaxZoom() {
        return this.maxScale;
    }

    public final void setMaxZoom(float f) {
        this.maxScale = f;
        this.superMaxScale = f * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = false;
    }

    public final void setMaxZoomRatio(float f) {
        this.maxScaleMultiplier = f;
        float f2 = this.minScale * f;
        this.maxScale = f2;
        this.superMaxScale = f2 * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = true;
    }

    public final float getMinZoom() {
        return this.minScale;
    }

    public final void setMinZoom(float f) {
        float min;
        this.userSpecifiedMinScale = f;
        if (f == -1.0f) {
            if (this.touchScaleType == ImageView.ScaleType.CENTER || this.touchScaleType == ImageView.ScaleType.CENTER_CROP) {
                Drawable drawable = getDrawable();
                int drawableWidth = getDrawableWidth(drawable);
                int drawableHeight = getDrawableHeight(drawable);
                if (drawable != null && drawableWidth > 0 && drawableHeight > 0) {
                    float f2 = this.viewWidth / drawableWidth;
                    float f3 = this.viewHeight / drawableHeight;
                    if (this.touchScaleType == ImageView.ScaleType.CENTER) {
                        min = Math.min(f2, f3);
                    } else {
                        min = Math.min(f2, f3) / Math.max(f2, f3);
                    }
                    this.minScale = min;
                }
            } else {
                this.minScale = 1.0f;
            }
        } else {
            this.minScale = f;
        }
        if (this.maxScaleIsSetByMultiplier) {
            setMaxZoomRatio(this.maxScaleMultiplier);
        }
        this.superMinScale = this.minScale * 0.75f;
    }

    public final void resetZoom() {
        this.currentZoom = 1.0f;
        fitImageToView();
    }

    public final void resetZoomAnimated() {
        setZoomAnimated(1.0f, 0.5f, 0.5f);
    }

    public final void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public final void setZoom(float f, float f2, float f3) {
        setZoom(f, f2, f3, this.touchScaleType);
    }

    public final void setZoom(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        if (!this.onDrawReady) {
            this.delayedZoomVariables = new ZoomVariables(f, f2, f3, scaleType);
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f4 = this.currentZoom;
            float f5 = this.minScale;
            if (f4 < f5) {
                this.currentZoom = f5;
            }
        }
        if (scaleType != this.touchScaleType) {
            Intrinsics.checkNotNull(scaleType);
            setScaleType(scaleType);
        }
        resetZoom();
        scaleImage(f, this.viewWidth / 2.0f, this.viewHeight / 2.0f, true);
        this.touchMatrix.getValues(this.floatMatrix);
        float[] fArr = this.floatMatrix;
        float f6 = this.matchViewWidth;
        float f7 = 2;
        float f8 = f - 1;
        fArr[2] = ((this.viewWidth - f6) / f7) - ((f2 * f8) * f6);
        float f9 = this.matchViewHeight;
        fArr[5] = ((this.viewHeight - f9) / f7) - ((f3 * f8) * f9);
        this.touchMatrix.setValues(fArr);
        fixTrans();
        savePreviousImageValues();
        setImageMatrix(this.touchMatrix);
    }

    public final void setZoom(TouchImageView img) {
        Intrinsics.checkNotNullParameter(img, "img");
        PointF scrollPosition = img.getScrollPosition();
        setZoom(img.currentZoom, scrollPosition.x, scrollPosition.y, img.getScaleType());
    }

    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(0.5f, 0.5f);
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(this.viewWidth / 2.0f, this.viewHeight / 2.0f, true);
        transformCoordTouchToBitmap.x /= drawableWidth;
        transformCoordTouchToBitmap.y /= drawableHeight;
        return transformCoordTouchToBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean orientationMismatch(Drawable drawable) {
        boolean z = this.viewWidth > this.viewHeight;
        Intrinsics.checkNotNull(drawable);
        return z != (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight());
    }

    private final int getDrawableWidth(Drawable drawable) {
        if (orientationMismatch(drawable) && this.isRotateImageToFitScreen) {
            Intrinsics.checkNotNull(drawable);
            return drawable.getIntrinsicHeight();
        }
        Intrinsics.checkNotNull(drawable);
        return drawable.getIntrinsicWidth();
    }

    private final int getDrawableHeight(Drawable drawable) {
        if (orientationMismatch(drawable) && this.isRotateImageToFitScreen) {
            Intrinsics.checkNotNull(drawable);
            return drawable.getIntrinsicWidth();
        }
        Intrinsics.checkNotNull(drawable);
        return drawable.getIntrinsicHeight();
    }

    public final void setScrollPosition(float f, float f2) {
        setZoom(this.currentZoom, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixTrans() {
        this.touchMatrix.getValues(this.floatMatrix);
        float[] fArr = this.floatMatrix;
        this.touchMatrix.postTranslate(getFixTrans(fArr[2], this.viewWidth, getImageWidth(), (this.isRotateImageToFitScreen && orientationMismatch(getDrawable())) ? getImageWidth() : 0.0f), getFixTrans(fArr[5], this.viewHeight, getImageHeight(), 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixScaleTrans() {
        fixTrans();
        this.touchMatrix.getValues(this.floatMatrix);
        float imageWidth = getImageWidth();
        int i = this.viewWidth;
        if (imageWidth < i) {
            float imageWidth2 = (i - getImageWidth()) / 2;
            if (this.isRotateImageToFitScreen && orientationMismatch(getDrawable())) {
                imageWidth2 += getImageWidth();
            }
            this.floatMatrix[2] = imageWidth2;
        }
        float imageHeight = getImageHeight();
        int i2 = this.viewHeight;
        if (imageHeight < i2) {
            this.floatMatrix[5] = (i2 - getImageHeight()) / 2;
        }
        this.touchMatrix.setValues(this.floatMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.matchViewWidth * this.currentZoom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.matchViewHeight * this.currentZoom;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int viewSize = setViewSize(mode, size, drawableWidth);
        int viewSize2 = setViewSize(mode2, size2, drawableHeight);
        if (!this.orientationJustChanged) {
            savePreviousImageValues();
        }
        setMeasuredDimension((viewSize - getPaddingLeft()) - getPaddingRight(), (viewSize2 - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        fitImageToView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
        if (r4 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fitImageToView() {
        boolean z;
        FixedPixel fixedPixel = this.orientationJustChanged ? this.orientationChangeFixedPixel : this.viewSizeChangeFixedPixel;
        this.orientationJustChanged = false;
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || this.touchMatrix == null || this.prevMatrix == null) {
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f = this.currentZoom;
            float f2 = this.minScale;
            if (f < f2) {
                this.currentZoom = f2;
            }
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        float f3 = drawableWidth;
        float f4 = this.viewWidth / f3;
        float f5 = drawableHeight;
        float f6 = this.viewHeight / f5;
        ImageView.ScaleType scaleType = this.touchScaleType;
        switch (scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                f4 = 1.0f;
                f6 = f4;
                int i = this.viewWidth;
                float f7 = i - (f4 * f3);
                int i2 = this.viewHeight;
                float f8 = i2 - (f6 * f5);
                this.matchViewWidth = i - f7;
                this.matchViewHeight = i2 - f8;
                if (isZoomed() && !this.imageRenderedAtLeastOnce) {
                    if (this.isRotateImageToFitScreen && orientationMismatch(drawable)) {
                        this.touchMatrix.setRotate(90.0f);
                        this.touchMatrix.postTranslate(f3, 0.0f);
                        this.touchMatrix.postScale(f4, f6);
                    } else {
                        this.touchMatrix.setScale(f4, f6);
                    }
                    ImageView.ScaleType scaleType2 = this.touchScaleType;
                    int i3 = scaleType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType2.ordinal()];
                    if (i3 == 5) {
                        this.touchMatrix.postTranslate(0.0f, 0.0f);
                    } else if (i3 == 6) {
                        this.touchMatrix.postTranslate(f7, f8);
                    } else {
                        float f9 = 2;
                        this.touchMatrix.postTranslate(f7 / f9, f8 / f9);
                    }
                    this.currentZoom = 1.0f;
                } else {
                    if (!(this.prevMatchViewWidth == 0.0f)) {
                        if (this.prevMatchViewHeight != 0.0f) {
                            z = false;
                            break;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    savePreviousImageValues();
                    this.prevMatrix.getValues(this.floatMatrix);
                    float[] fArr = this.floatMatrix;
                    float f10 = this.currentZoom;
                    fArr[0] = (this.matchViewWidth / f3) * f10;
                    fArr[4] = (this.matchViewHeight / f5) * f10;
                    float f11 = fArr[2];
                    float f12 = fArr[5];
                    this.floatMatrix[2] = newTranslationAfterChange(f11, f10 * this.prevMatchViewWidth, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
                    this.floatMatrix[5] = newTranslationAfterChange(f12, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
                    this.touchMatrix.setValues(this.floatMatrix);
                }
                fixTrans();
                setImageMatrix(this.touchMatrix);
                return;
            case 2:
                f4 = Math.max(f4, f6);
                f6 = f4;
                int i4 = this.viewWidth;
                float f72 = i4 - (f4 * f3);
                int i22 = this.viewHeight;
                float f82 = i22 - (f6 * f5);
                this.matchViewWidth = i4 - f72;
                this.matchViewHeight = i22 - f82;
                if (isZoomed()) {
                    break;
                }
                if (!(this.prevMatchViewWidth == 0.0f)) {
                }
                savePreviousImageValues();
                this.prevMatrix.getValues(this.floatMatrix);
                float[] fArr2 = this.floatMatrix;
                float f102 = this.currentZoom;
                fArr2[0] = (this.matchViewWidth / f3) * f102;
                fArr2[4] = (this.matchViewHeight / f5) * f102;
                float f112 = fArr2[2];
                float f122 = fArr2[5];
                this.floatMatrix[2] = newTranslationAfterChange(f112, f102 * this.prevMatchViewWidth, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
                this.floatMatrix[5] = newTranslationAfterChange(f122, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
                this.touchMatrix.setValues(this.floatMatrix);
                fixTrans();
                setImageMatrix(this.touchMatrix);
                return;
            case 3:
                float min = Math.min(1.0f, Math.min(f4, f6));
                f4 = Math.min(min, min);
                f6 = f4;
                int i42 = this.viewWidth;
                float f722 = i42 - (f4 * f3);
                int i222 = this.viewHeight;
                float f822 = i222 - (f6 * f5);
                this.matchViewWidth = i42 - f722;
                this.matchViewHeight = i222 - f822;
                if (isZoomed()) {
                }
                if (!(this.prevMatchViewWidth == 0.0f)) {
                }
                savePreviousImageValues();
                this.prevMatrix.getValues(this.floatMatrix);
                float[] fArr22 = this.floatMatrix;
                float f1022 = this.currentZoom;
                fArr22[0] = (this.matchViewWidth / f3) * f1022;
                fArr22[4] = (this.matchViewHeight / f5) * f1022;
                float f1122 = fArr22[2];
                float f1222 = fArr22[5];
                this.floatMatrix[2] = newTranslationAfterChange(f1122, f1022 * this.prevMatchViewWidth, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
                this.floatMatrix[5] = newTranslationAfterChange(f1222, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
                this.touchMatrix.setValues(this.floatMatrix);
                fixTrans();
                setImageMatrix(this.touchMatrix);
                return;
            case 4:
            case 5:
            case 6:
                f4 = Math.min(f4, f6);
                f6 = f4;
                int i422 = this.viewWidth;
                float f7222 = i422 - (f4 * f3);
                int i2222 = this.viewHeight;
                float f8222 = i2222 - (f6 * f5);
                this.matchViewWidth = i422 - f7222;
                this.matchViewHeight = i2222 - f8222;
                if (isZoomed()) {
                }
                if (!(this.prevMatchViewWidth == 0.0f)) {
                }
                savePreviousImageValues();
                this.prevMatrix.getValues(this.floatMatrix);
                float[] fArr222 = this.floatMatrix;
                float f10222 = this.currentZoom;
                fArr222[0] = (this.matchViewWidth / f3) * f10222;
                fArr222[4] = (this.matchViewHeight / f5) * f10222;
                float f11222 = fArr222[2];
                float f12222 = fArr222[5];
                this.floatMatrix[2] = newTranslationAfterChange(f11222, f10222 * this.prevMatchViewWidth, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
                this.floatMatrix[5] = newTranslationAfterChange(f12222, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
                this.touchMatrix.setValues(this.floatMatrix);
                fixTrans();
                setImageMatrix(this.touchMatrix);
                return;
            default:
                int i4222 = this.viewWidth;
                float f72222 = i4222 - (f4 * f3);
                int i22222 = this.viewHeight;
                float f82222 = i22222 - (f6 * f5);
                this.matchViewWidth = i4222 - f72222;
                this.matchViewHeight = i22222 - f82222;
                if (isZoomed()) {
                }
                if (!(this.prevMatchViewWidth == 0.0f)) {
                }
                savePreviousImageValues();
                this.prevMatrix.getValues(this.floatMatrix);
                float[] fArr2222 = this.floatMatrix;
                float f102222 = this.currentZoom;
                fArr2222[0] = (this.matchViewWidth / f3) * f102222;
                fArr2222[4] = (this.matchViewHeight / f5) * f102222;
                float f112222 = fArr2222[2];
                float f122222 = fArr2222[5];
                this.floatMatrix[2] = newTranslationAfterChange(f112222, f102222 * this.prevMatchViewWidth, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
                this.floatMatrix[5] = newTranslationAfterChange(f122222, this.prevMatchViewHeight * this.currentZoom, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
                this.touchMatrix.setValues(this.floatMatrix);
                fixTrans();
                setImageMatrix(this.touchMatrix);
                return;
        }
    }

    private final int setViewSize(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    private final float newTranslationAfterChange(float f, float f2, float f3, int i, int i2, int i3, FixedPixel fixedPixel) {
        float f4 = i2;
        float f5 = 0.5f;
        if (f3 < f4) {
            return (f4 - (i3 * this.floatMatrix[0])) * 0.5f;
        }
        if (f > 0.0f) {
            return -((f3 - f4) * 0.5f);
        }
        if (fixedPixel == FixedPixel.BOTTOM_RIGHT) {
            f5 = 1.0f;
        } else if (fixedPixel == FixedPixel.TOP_LEFT) {
            f5 = 0.0f;
        }
        return -(((((-f) + (i * f5)) / f2) * f3) - (f4 * f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ImageActionState imageActionState) {
        this.imageActionState = imageActionState;
    }

    @Deprecated(message = "")
    public final boolean canScrollHorizontallyFroyo(int i) {
        return canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f = this.floatMatrix[2];
        if (getImageWidth() < this.viewWidth) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.viewWidth)) + ((float) 1) < getImageWidth() || i <= 0;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f = this.floatMatrix[5];
        if (getImageHeight() < this.viewHeight) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.viewHeight)) + ((float) 1) < getImageHeight() || i <= 0;
        }
        return false;
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;)V", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onDoubleTapEvent", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onSingleTapConfirmed", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.doubleTapListener;
            return onDoubleTapListener != null ? onDoubleTapListener.onSingleTapConfirmed(e) : TouchImageView.this.performClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            TouchImageView.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            Fling fling = TouchImageView.this.fling;
            if (fling != null) {
                fling.cancelFling();
            }
            TouchImageView touchImageView = TouchImageView.this;
            Fling fling2 = new Fling((int) f, (int) f2);
            TouchImageView.this.compatPostOnAnimation(fling2);
            touchImageView.fling = fling2;
            return super.onFling(motionEvent, e2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (TouchImageView.this.isZoomEnabled()) {
                GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.doubleTapListener;
                boolean onDoubleTap = onDoubleTapListener != null ? onDoubleTapListener.onDoubleTap(e) : false;
                if (TouchImageView.this.imageActionState == ImageActionState.NONE) {
                    float doubleTapScale = (TouchImageView.this.getDoubleTapScale() > 0.0f ? 1 : (TouchImageView.this.getDoubleTapScale() == 0.0f ? 0 : -1)) == 0 ? TouchImageView.this.maxScale : TouchImageView.this.getDoubleTapScale();
                    if (!(TouchImageView.this.getCurrentZoom() == TouchImageView.this.minScale)) {
                        doubleTapScale = TouchImageView.this.minScale;
                    }
                    TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(doubleTapScale, e.getX(), e.getY(), false));
                    return true;
                }
                return onDoubleTap;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.doubleTapListener;
            if (onDoubleTapListener != null) {
                return onDoubleTapListener.onDoubleTapEvent(e);
            }
            return false;
        }
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$PrivateOnTouchListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;)V", "last", "Landroid/graphics/PointF;", "onTouch", "", "v", "Landroid/view/View;", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class PrivateOnTouchListener implements View.OnTouchListener {
        private final PointF last = new PointF();

        public PrivateOnTouchListener() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
            if (r1 != 6) goto L15;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ImageActionState.NONE);
                return false;
            }
            if (TouchImageView.this.isZoomEnabled()) {
                TouchImageView.this.scaleDetector.onTouchEvent(event);
            }
            TouchImageView.this.gestureDetector.onTouchEvent(event);
            PointF pointF = new PointF(event.getX(), event.getY());
            if (TouchImageView.this.imageActionState == ImageActionState.NONE || TouchImageView.this.imageActionState == ImageActionState.DRAG || TouchImageView.this.imageActionState == ImageActionState.FLING) {
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (TouchImageView.this.imageActionState == ImageActionState.DRAG) {
                                float f = pointF.x - this.last.x;
                                float f2 = pointF.y - this.last.y;
                                TouchImageView touchImageView = TouchImageView.this;
                                float fixDragTrans = touchImageView.getFixDragTrans(f, touchImageView.viewWidth, TouchImageView.this.getImageWidth());
                                TouchImageView touchImageView2 = TouchImageView.this;
                                TouchImageView.this.touchMatrix.postTranslate(fixDragTrans, touchImageView2.getFixDragTrans(f2, touchImageView2.viewHeight, TouchImageView.this.getImageHeight()));
                                TouchImageView.this.fixTrans();
                                this.last.set(pointF.x, pointF.y);
                            }
                        }
                    }
                    TouchImageView.this.setState(ImageActionState.NONE);
                } else {
                    this.last.set(pointF);
                    Fling fling = TouchImageView.this.fling;
                    if (fling != null) {
                        fling.cancelFling();
                    }
                    TouchImageView.this.setState(ImageActionState.DRAG);
                }
            }
            OnTouchCoordinatesListener onTouchCoordinatesListener = TouchImageView.this.touchCoordinatesListener;
            if (onTouchCoordinatesListener != null) {
                onTouchCoordinatesListener.onTouchCoordinate(v, event, TouchImageView.this.transformCoordTouchToBitmap(event.getX(), event.getY(), true));
            }
            TouchImageView touchImageView3 = TouchImageView.this;
            touchImageView3.setImageMatrix(touchImageView3.touchMatrix);
            View.OnTouchListener onTouchListener = TouchImageView.this.userTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(v, event);
            }
            OnTouchImageViewListener onTouchImageViewListener = TouchImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
            }
            return true;
        }
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "onScaleEnd", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            TouchImageView.this.setState(ImageActionState.ZOOM);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            TouchImageView.this.scaleImage(detector.getScaleFactor(), detector.getFocusX(), detector.getFocusY(), true);
            OnTouchImageViewListener onTouchImageViewListener = TouchImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
                return true;
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            super.onScaleEnd(detector);
            TouchImageView.this.setState(ImageActionState.NONE);
            float currentZoom = TouchImageView.this.getCurrentZoom();
            boolean z = true;
            if (TouchImageView.this.getCurrentZoom() > TouchImageView.this.maxScale) {
                currentZoom = TouchImageView.this.maxScale;
            } else if (TouchImageView.this.getCurrentZoom() < TouchImageView.this.minScale) {
                currentZoom = TouchImageView.this.minScale;
            } else {
                z = false;
            }
            float f = currentZoom;
            if (z) {
                TouchImageView touchImageView = TouchImageView.this;
                TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(f, touchImageView.viewWidth / 2, TouchImageView.this.viewHeight / 2, true));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scaleImage(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        double d2;
        if (z) {
            f3 = this.superMinScale;
            f4 = this.superMaxScale;
        } else {
            f3 = this.minScale;
            f4 = this.maxScale;
        }
        float f5 = this.currentZoom;
        float f6 = ((float) d) * f5;
        this.currentZoom = f6;
        if (f6 > f4) {
            this.currentZoom = f4;
            d2 = f4;
        } else {
            if (f6 < f3) {
                this.currentZoom = f3;
                d2 = f3;
            }
            float f7 = (float) d;
            this.touchMatrix.postScale(f7, f7, f, f2);
            fixScaleTrans();
        }
        d = d2 / f5;
        float f72 = (float) d;
        this.touchMatrix.postScale(f72, f72, f, f2);
        fixScaleTrans();
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0003H\u0002R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$DoubleTapZoom;", "Ljava/lang/Runnable;", "targetZoom", "", "focusX", "focusY", "stretchImageToSuper", "", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;FFFZ)V", "bitmapX", "bitmapY", "endTouch", "Landroid/graphics/PointF;", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "startTime", "", "startTouch", "startZoom", "calculateDeltaScale", "", "t", "interpolate", "run", "", "translateImageToCenterTouchPosition", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class DoubleTapZoom implements Runnable {
        private final float bitmapX;
        private final float bitmapY;
        private final PointF endTouch;
        private final AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        private final long startTime;
        private final PointF startTouch;
        private final float startZoom;
        private final boolean stretchImageToSuper;
        private final float targetZoom;

        public DoubleTapZoom(float f, float f2, float f3, boolean z) {
            TouchImageView.this.setState(ImageActionState.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = TouchImageView.this.getCurrentZoom();
            this.targetZoom = f;
            this.stretchImageToSuper = z;
            PointF transformCoordTouchToBitmap = TouchImageView.this.transformCoordTouchToBitmap(f2, f3, false);
            float f4 = transformCoordTouchToBitmap.x;
            this.bitmapX = f4;
            float f5 = transformCoordTouchToBitmap.y;
            this.bitmapY = f5;
            this.startTouch = TouchImageView.this.transformCoordBitmapToTouch(f4, f5);
            this.endTouch = new PointF(TouchImageView.this.viewWidth / 2, TouchImageView.this.viewHeight / 2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ImageActionState.NONE);
                return;
            }
            float interpolate = interpolate();
            TouchImageView.this.scaleImage(calculateDeltaScale(interpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
            translateImageToCenterTouchPosition(interpolate);
            TouchImageView.this.fixScaleTrans();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.touchMatrix);
            OnTouchImageViewListener onTouchImageViewListener = TouchImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
            }
            if (interpolate < 1.0f) {
                TouchImageView.this.compatPostOnAnimation(this);
            } else {
                TouchImageView.this.setState(ImageActionState.NONE);
            }
        }

        private final void translateImageToCenterTouchPosition(float f) {
            float f2 = this.startTouch.x + ((this.endTouch.x - this.startTouch.x) * f);
            float f3 = this.startTouch.y + (f * (this.endTouch.y - this.startTouch.y));
            PointF transformCoordBitmapToTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            TouchImageView.this.touchMatrix.postTranslate(f2 - transformCoordBitmapToTouch.x, f3 - transformCoordBitmapToTouch.y);
        }

        private final float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.startTime)) / 500.0f));
        }

        private final double calculateDeltaScale(float f) {
            float f2 = this.startZoom;
            return (f2 + (f * (this.targetZoom - f2))) / TouchImageView.this.getCurrentZoom();
        }
    }

    protected final PointF transformCoordTouchToBitmap(float f, float f2, boolean z) {
        this.touchMatrix.getValues(this.floatMatrix);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr = this.floatMatrix;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    protected final PointF transformCoordBitmapToTouch(float f, float f2) {
        this.touchMatrix.getValues(this.floatMatrix);
        return new PointF(this.floatMatrix[2] + (getImageWidth() * (f / getDrawable().getIntrinsicWidth())), this.floatMatrix[5] + (getImageHeight() * (f2 / getDrawable().getIntrinsicHeight())));
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00060\u000fR\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$Fling;", "Ljava/lang/Runnable;", "velocityX", "", "velocityY", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;II)V", "currX", "getCurrX", "()I", "setCurrX", "(I)V", "currY", "getCurrY", "setCurrY", "scroller", "Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$CompatScroller;", "Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;", "getScroller", "()Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$CompatScroller;", "setScroller", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$CompatScroller;)V", "cancelFling", "", "run", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class Fling implements Runnable {
        private int currX;
        private int currY;
        private CompatScroller scroller;

        public Fling(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            TouchImageView.this.setState(ImageActionState.FLING);
            this.scroller = new CompatScroller(TouchImageView.this.getContext());
            TouchImageView.this.touchMatrix.getValues(TouchImageView.this.floatMatrix);
            int i7 = (int) TouchImageView.this.floatMatrix[2];
            int i8 = (int) TouchImageView.this.floatMatrix[5];
            if (TouchImageView.this.isRotateImageToFitScreen && TouchImageView.this.orientationMismatch(TouchImageView.this.getDrawable())) {
                i7 -= (int) TouchImageView.this.getImageWidth();
            }
            if (TouchImageView.this.getImageWidth() > TouchImageView.this.viewWidth) {
                i3 = TouchImageView.this.viewWidth - ((int) TouchImageView.this.getImageWidth());
                i4 = 0;
            } else {
                i3 = i7;
                i4 = i3;
            }
            if (TouchImageView.this.getImageHeight() > TouchImageView.this.viewHeight) {
                i5 = TouchImageView.this.viewHeight - ((int) TouchImageView.this.getImageHeight());
                i6 = 0;
            } else {
                i5 = i8;
                i6 = i5;
            }
            this.scroller.fling(i7, i8, i, i2, i3, i4, i5, i6);
            this.currX = i7;
            this.currY = i8;
        }

        public final CompatScroller getScroller() {
            return this.scroller;
        }

        public final void setScroller(CompatScroller compatScroller) {
            Intrinsics.checkNotNullParameter(compatScroller, "<set-?>");
            this.scroller = compatScroller;
        }

        public final int getCurrX() {
            return this.currX;
        }

        public final void setCurrX(int i) {
            this.currX = i;
        }

        public final int getCurrY() {
            return this.currY;
        }

        public final void setCurrY(int i) {
            this.currY = i;
        }

        public final void cancelFling() {
            TouchImageView.this.setState(ImageActionState.NONE);
            this.scroller.forceFinished(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            OnTouchImageViewListener onTouchImageViewListener = TouchImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
            }
            if (!this.scroller.isFinished() && this.scroller.computeScrollOffset()) {
                int currX = this.scroller.getCurrX();
                int currY = this.scroller.getCurrY();
                int i = currX - this.currX;
                int i2 = currY - this.currY;
                this.currX = currX;
                this.currY = currY;
                TouchImageView.this.touchMatrix.postTranslate(i, i2);
                TouchImageView.this.fixTrans();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.touchMatrix);
                TouchImageView.this.compatPostOnAnimation(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\fJF\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$CompatScroller;", "", "context", "Landroid/content/Context;", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;Landroid/content/Context;)V", "currX", "", "getCurrX", "()I", "currY", "getCurrY", "isFinished", "", "()Z", "overScroller", "Landroid/widget/OverScroller;", "getOverScroller", "()Landroid/widget/OverScroller;", "setOverScroller", "(Landroid/widget/OverScroller;)V", "computeScrollOffset", "fling", "", "startX", "startY", "velocityX", "velocityY", "minX", "maxX", "minY", "maxY", "forceFinished", "finished", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public final class CompatScroller {
        private OverScroller overScroller;

        public CompatScroller(Context context) {
            this.overScroller = new OverScroller(context);
        }

        public final OverScroller getOverScroller() {
            return this.overScroller;
        }

        public final void setOverScroller(OverScroller overScroller) {
            Intrinsics.checkNotNullParameter(overScroller, "<set-?>");
            this.overScroller = overScroller;
        }

        public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.overScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        public final void forceFinished(boolean z) {
            this.overScroller.forceFinished(z);
        }

        public final boolean isFinished() {
            return this.overScroller.isFinished();
        }

        public final boolean computeScrollOffset() {
            this.overScroller.computeScrollOffset();
            return this.overScroller.computeScrollOffset();
        }

        public final int getCurrX() {
            return this.overScroller.getCurrX();
        }

        public final int getCurrY() {
            return this.overScroller.getCurrY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compatPostOnAnimation(Runnable runnable) {
        postOnAnimation(runnable);
    }

    public final void setZoomAnimated(float f, float f2, float f3) {
        setZoomAnimated(f, f2, f3, 500);
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i) {
        compatPostOnAnimation(new AnimatedZoom(this, f, new PointF(f2, f3), i));
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i, OnZoomFinishedListener onZoomFinishedListener) {
        AnimatedZoom animatedZoom = new AnimatedZoom(this, f, new PointF(f2, f3), i);
        animatedZoom.setListener(onZoomFinishedListener);
        compatPostOnAnimation(animatedZoom);
    }

    public final void setZoomAnimated(float f, float f2, float f3, OnZoomFinishedListener onZoomFinishedListener) {
        AnimatedZoom animatedZoom = new AnimatedZoom(this, f, new PointF(f2, f3), 500);
        animatedZoom.setListener(onZoomFinishedListener);
        compatPostOnAnimation(animatedZoom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$AnimatedZoom;", "Ljava/lang/Runnable;", "targetZoom", "", "focus", "Landroid/graphics/PointF;", "zoomTimeMillis", "", "(Lcom/ifriend/ui/imageView/touchImageView/TouchImageView;FLandroid/graphics/PointF;I)V", "interpolator", "Landroid/view/animation/LinearInterpolator;", "startFocus", "startTime", "", "startZoom", "targetFocus", "zoomFinishedListener", "Lcom/ortiz/touchview/OnZoomFinishedListener;", "interpolate", "run", "", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public final class AnimatedZoom implements Runnable {
        private final LinearInterpolator interpolator;
        private final PointF startFocus;
        private final long startTime;
        private final float startZoom;
        private final PointF targetFocus;
        private final float targetZoom;
        final /* synthetic */ TouchImageView this$0;
        private OnZoomFinishedListener zoomFinishedListener;
        private final int zoomTimeMillis;

        public AnimatedZoom(TouchImageView touchImageView, float f, PointF focus, int i) {
            Intrinsics.checkNotNullParameter(focus, "focus");
            this.this$0 = touchImageView;
            this.interpolator = new LinearInterpolator();
            touchImageView.setState(ImageActionState.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = touchImageView.getCurrentZoom();
            this.targetZoom = f;
            this.zoomTimeMillis = i;
            this.startFocus = touchImageView.getScrollPosition();
            this.targetFocus = focus;
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolate = interpolate();
            float f = this.startZoom;
            this.this$0.setZoom(f + ((this.targetZoom - f) * interpolate), this.startFocus.x + ((this.targetFocus.x - this.startFocus.x) * interpolate), this.startFocus.y + ((this.targetFocus.y - this.startFocus.y) * interpolate));
            if (interpolate < 1.0f) {
                this.this$0.compatPostOnAnimation(this);
                return;
            }
            this.this$0.setState(ImageActionState.NONE);
            OnZoomFinishedListener onZoomFinishedListener = this.zoomFinishedListener;
            if (onZoomFinishedListener != null) {
                onZoomFinishedListener.onZoomFinished();
            }
        }

        private final float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.startTime)) / this.zoomTimeMillis));
        }

        public final void setListener(OnZoomFinishedListener onZoomFinishedListener) {
            this.zoomFinishedListener = onZoomFinishedListener;
        }
    }

    /* compiled from: TouchImageView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/ui/imageView/touchImageView/TouchImageView$Companion;", "", "()V", "AUTOMATIC_MIN_ZOOM", "", "DEFAULT_ZOOM_TIME", "", "SUPER_MAX_MULTIPLIER", "SUPER_MIN_MULTIPLIER", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
