package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.material.internal.ViewUtils;
import com.google.zxing.pdf417.PDF417Common;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
/* loaded from: classes4.dex */
final class Bzip2Rand {
    private static final int[] RNUMS = {619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, HttpStatus.SC_RESET_CONTENT, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 697, 867, 561, 862, 687, 507, 283, 482, TsExtractor.TS_STREAM_TYPE_AC3, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, 105, 170, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 520, 932, 727, 476, 693, TypedValues.CycleType.TYPE_WAVE_PHASE, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, 500, 594, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 641, 801, 220, 162, 819, 984, 589, InputDeviceCompat.SOURCE_DPAD, 495, 799, 161, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, HttpStatus.SC_REQUEST_URI_TOO_LONG, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, 224, 469, 68, 770, 919, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 373, 294, 822, 808, 206, 184, 943, 795, 384, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 560, 951, 160, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, 447, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 353, 859, 672, 112, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 772, 154, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, HttpStatus.SC_LENGTH_REQUIRED, 521, 938, 300, 821, 78, 343, 175, 128, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 170, 774, 972, 275, 999, 639, 495, 78, 352, WebSocketProtocol.PAYLOAD_SHORT, 857, 956, 358, 619, 580, 124, 737, 594, TypedValues.TransitionType.TYPE_FROM, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 669, 112, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, 344, 805, 988, 739, FrameMetricsAggregator.EVERY_DURATION, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, PsExtractor.VIDEO_STREAM_MASK, 102, 654, 459, 51, 686, 754, 806, 760, FacebookRequestErrorClassification.ESC_APP_INACTIVE, 403, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 394, 687, 700, 946, 670, 656, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 140, 206, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, TypedValues.Custom.TYPE_DIMENSION, 758, 745, 193, ViewUtils.EDGE_TO_EDGE_FLAGS, 550, TypedValues.MotionType.TYPE_DRAW_PATH, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, 106, 366, TypedValues.Custom.TYPE_DIMENSION, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, TsExtractor.TS_STREAM_TYPE_E_AC3, 780, 773, 635, 389, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 100, 626, 958, 165, 504, 920, 176, 193, 713, 857, 265, 203, 50, 668, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 645, 990, 626, 197, TypedValues.PositionType.TYPE_POSITION_TYPE, 357, 358, 850, 858, 364, 936, 638};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int rNums(int i) {
        return RNUMS[i];
    }

    private Bzip2Rand() {
    }
}
