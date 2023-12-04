package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.material.internal.ViewUtils;
import com.google.logging.type.LogSeverity;
import com.google.zxing.pdf417.PDF417Common;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Exception;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.ThrowableUtil;
/* loaded from: classes4.dex */
final class HpackHuffmanDecoder implements ByteProcessor {
    private static final byte HUFFMAN_COMPLETE = 1;
    private static final int HUFFMAN_COMPLETE_SHIFT = 256;
    private static final byte HUFFMAN_EMIT_SYMBOL = 2;
    private static final int HUFFMAN_EMIT_SYMBOL_SHIFT = 512;
    private static final byte HUFFMAN_FAIL = 4;
    private static final int HUFFMAN_FAIL_SHIFT = 1024;
    private byte[] dest;
    private int k;
    private int state;
    private static final int[] HUFFS = {262144, 327680, 458752, 524288, 720896, 786432, 1048576, 1245184, 1638400, 1835008, 2097152, 2293760, 2752512, 3211264, 3735552, 4194560, 816, 817, 818, 865, 867, 869, 873, 879, 883, 884, 851968, 917504, 1114112, 1179648, 1310720, 1376256, 66096, 1442608, 66097, 1442609, 66098, 1442610, 66145, 1442657, 66147, 1442659, 66149, 1442661, 66153, 1442665, 66159, 1442671, 131632, 590384, 1507888, 2622256, 131633, 590385, 1507889, 2622257, 131634, 590386, 1507890, 2622258, 131681, 590433, 1507937, 2622305, 197168, 393776, 655920, 983600, 1573424, 2032176, 2687536, 3670832, 197169, 393777, 655921, 983601, 1573425, 2032177, 2687537, 3670833, 197170, 393778, 655922, 983602, 1573426, 2032178, 2687538, 3670834, 197217, 393825, 655969, 983649, 1573473, 2032225, 2687585, 3670881, 131683, 590435, 1507939, 2622307, 131685, 590437, 1507941, 2622309, 131689, 590441, 1507945, 2622313, 131695, 590447, 1507951, 2622319, 197219, 393827, 655971, 983651, 1573475, 2032227, 2687587, 3670883, 197221, 393829, 655973, 983653, 1573477, 2032229, 2687589, 3670885, 197225, 393833, 655977, 983657, 1573481, 2032233, 2687593, 3670889, 197231, 393839, 655983, 983663, 1573487, 2032239, 2687599, 3670895, 66163, 1442675, 66164, 1442676, LogSeverity.EMERGENCY_VALUE, 805, 813, 814, 815, 819, 820, 821, 822, 823, 824, 825, 131699, 590451, 1507955, 2622323, 131700, 590452, 1507956, 2622324, 66080, 1442592, 66085, 1442597, 66093, 1442605, 66094, 1442606, 197235, 393843, 655987, 983667, 1573491, 2032243, 2687603, 3670899, 197236, 393844, 655988, 983668, 1573492, 2032244, 2687604, 3670900, 131616, 590368, 1507872, 2622240, 131621, 590373, 1507877, 2622245, 131629, 590381, 1507885, 2622253, 131630, 590382, 1507886, 2622254, 197152, 393760, 655904, 983584, 1573408, 2032160, 2687520, 3670816, 197157, 393765, 655909, 983589, 1573413, 2032165, 2687525, 3670821, 197165, 393773, 655917, 983597, 1573421, 2032173, 2687533, 3670829, 197166, 393774, 655918, 983598, 1573422, 2032174, 2687534, 3670830, 66095, 1442607, 66099, 1442611, 66100, 1442612, 66101, 1442613, 66102, 1442614, 66103, 1442615, 66104, 1442616, 66105, 1442617, 131631, 590383, 1507887, 2622255, 131635, 590387, 1507891, 2622259, 131636, 590388, 1507892, 2622260, 131637, 590389, 1507893, 2622261, 197167, 393775, 655919, 983599, 1573423, 2032175, 2687535, 3670831, 197171, 393779, 655923, 983603, 1573427, 2032179, 2687539, 3670835, 197172, 393780, 655924, 983604, 1573428, 2032180, 2687540, 3670836, 197173, 393781, 655925, 983605, 1573429, 2032181, 2687541, 3670837, 131638, 590390, 1507894, 2622262, 131639, 590391, 1507895, 2622263, 131640, 590392, 1507896, 2622264, 131641, 590393, 1507897, 2622265, 197174, 393782, 655926, 983606, 1573430, 2032182, 2687542, 3670838, 197175, 393783, 655927, 983607, 1573431, 2032183, 2687543, 3670839, 197176, 393784, 655928, 983608, 1573432, 2032184, 2687544, 3670840, 197177, 393785, 655929, 983609, 1573433, 2032185, 2687545, 3670841, 1703936, 1769472, 1900544, 1966080, 2162688, 2228224, 2359296, 2424832, 2818048, 3014656, 3276800, 3473408, 3801088, 3997696, 4259840, 4456704, 829, 833, 863, 866, 868, 870, 871, 872, 876, 877, 878, 880, 882, 885, 2490368, 2555904, 66109, 1442621, 66113, 1442625, 66143, 1442655, 66146, 1442658, 66148, 1442660, 66150, 1442662, 66151, 1442663, 66152, 1442664, 131645, 590397, 1507901, 2622269, 131649, 590401, 1507905, 2622273, 131679, 590431, 1507935, 2622303, 131682, 590434, 1507938, 2622306, 197181, 393789, 655933, 983613, 1573437, 2032189, 2687549, 3670845, 197185, 393793, 655937, 983617, 1573441, 2032193, 2687553, 3670849, 197215, 393823, 655967, 983647, 1573471, 2032223, 2687583, 3670879, 197218, 393826, 655970, 983650, 1573474, 2032226, 2687586, 3670882, 131684, 590436, 1507940, 2622308, 131686, 590438, 1507942, 2622310, 131687, 590439, 1507943, 2622311, 131688, 590440, 1507944, 2622312, 197220, 393828, 655972, 983652, 1573476, 2032228, 2687588, 3670884, 197222, 393830, 655974, 983654, 1573478, 2032230, 2687590, 3670886, 197223, 393831, 655975, 983655, 1573479, 2032231, 2687591, 3670887, 197224, 393832, 655976, 983656, 1573480, 2032232, 2687592, 3670888, 66156, 1442668, 66157, 1442669, 66158, 1442670, 66160, 1442672, 66162, 1442674, 66165, 1442677, 826, 834, 835, 836, 131692, 590444, 1507948, 2622316, 131693, 590445, 1507949, 2622317, 131694, 590446, 1507950, 2622318, 131696, 590448, 1507952, 2622320, 197228, 393836, 655980, 983660, 1573484, 2032236, 2687596, 3670892, 197229, 393837, 655981, 983661, 1573485, 2032237, 2687597, 3670893, 197230, 393838, 655982, 983662, 1573486, 2032238, 2687598, 3670894, 197232, 393840, 655984, 983664, 1573488, 2032240, 2687600, 3670896, 131698, 590450, 1507954, 2622322, 131701, 590453, 1507957, 2622325, 66106, 1442618, 66114, 1442626, 66115, 1442627, 66116, 1442628, 197234, 393842, 655986, 983666, 1573490, 2032242, 2687602, 3670898, 197237, 393845, 655989, 983669, 1573493, 2032245, 2687605, 3670901, 131642, 590394, 1507898, 2622266, 131650, 590402, 1507906, 2622274, 131651, 590403, 1507907, 2622275, 131652, 590404, 1507908, 2622276, 197178, 393786, 655930, 983610, 1573434, 2032186, 2687546, 3670842, 197186, 393794, 655938, 983618, 1573442, 2032194, 2687554, 3670850, 197187, 393795, 655939, 983619, 1573443, 2032195, 2687555, 3670851, 197188, 393796, 655940, 983620, 1573444, 2032196, 2687556, 3670852, 2883584, 2949120, 3080192, 3145728, 3342336, 3407872, 3538944, 3604480, 3866624, 3932160, 4063232, 4128768, 4325376, 4390912, 4521984, 4718848, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 66117, 1442629, 66118, 1442630, 66119, 1442631, 66120, 1442632, 66121, 1442633, 66122, 1442634, 66123, 1442635, 66124, 1442636, 131653, 590405, 1507909, 2622277, 131654, 590406, 1507910, 2622278, 131655, 590407, 1507911, 2622279, 131656, 590408, 1507912, 2622280, 197189, 393797, 655941, 983621, 1573445, 2032197, 2687557, 3670853, 197190, 393798, 655942, 983622, 1573446, 2032198, 2687558, 3670854, 197191, 393799, 655943, 983623, 1573447, 2032199, 2687559, 3670855, 197192, 393800, 655944, 983624, 1573448, 2032200, 2687560, 3670856, 131657, 590409, 1507913, 2622281, 131658, 590410, 1507914, 2622282, 131659, 590411, 1507915, 2622283, 131660, 590412, 1507916, 2622284, 197193, 393801, 655945, 983625, 1573449, 2032201, 2687561, 3670857, 197194, 393802, 655946, 983626, 1573450, 2032202, 2687562, 3670858, 197195, 393803, 655947, 983627, 1573451, 2032203, 2687563, 3670859, 197196, 393804, 655948, 983628, 1573452, 2032204, 2687564, 3670860, 66125, 1442637, 66126, 1442638, 66127, 1442639, 66128, 1442640, 66129, 1442641, 66130, 1442642, 66131, 1442643, 66132, 1442644, 131661, 590413, 1507917, 2622285, 131662, 590414, 1507918, 2622286, 131663, 590415, 1507919, 2622287, 131664, 590416, 1507920, 2622288, 197197, 393805, 655949, 983629, 1573453, 2032205, 2687565, 3670861, 197198, 393806, 655950, 983630, 1573454, 2032206, 2687566, 3670862, 197199, 393807, 655951, 983631, 1573455, 2032207, 2687567, 3670863, 197200, 393808, 655952, 983632, 1573456, 2032208, 2687568, 3670864, 131665, 590417, 1507921, 2622289, 131666, 590418, 1507922, 2622290, 131667, 590419, 1507923, 2622291, 131668, 590420, 1507924, 2622292, 197201, 393809, 655953, 983633, 1573457, 2032209, 2687569, 3670865, 197202, 393810, 655954, 983634, 1573458, 2032210, 2687570, 3670866, 197203, 393811, 655955, 983635, 1573459, 2032211, 2687571, 3670867, 197204, 393812, 655956, 983636, 1573460, 2032212, 2687572, 3670868, 853, 854, 855, 857, 874, 875, 881, 886, 887, 888, 889, 890, 4587520, 4653056, 4784128, 4849920, 66133, 1442645, 66134, 1442646, 66135, 1442647, 66137, 1442649, 66154, 1442666, 66155, 1442667, 66161, 1442673, 66166, 1442678, 131669, 590421, 1507925, 2622293, 131670, 590422, 1507926, 2622294, 131671, 590423, 1507927, 2622295, 131673, 590425, 1507929, 2622297, 197205, 393813, 655957, 983637, 1573461, 2032213, 2687573, 3670869, 197206, 393814, 655958, 983638, 1573462, 2032214, 2687574, 3670870, 197207, 393815, 655959, 983639, 1573463, 2032215, 2687575, 3670871, 197209, 393817, 655961, 983641, 1573465, 2032217, 2687577, 3670873, 131690, 590442, 1507946, 2622314, 131691, 590443, 1507947, 2622315, 131697, 590449, 1507953, 2622321, 131702, 590454, 1507958, 2622326, 197226, 393834, 655978, 983658, 1573482, 2032234, 2687594, 3670890, 
    197227, 393835, 655979, 983659, 1573483, 2032235, 2687595, 3670891, 197233, 393841, 655985, 983665, 1573489, 2032241, 2687601, 3670897, 197238, 393846, 655990, 983670, 1573494, 2032246, 2687606, 3670902, 66167, 1442679, 66168, 1442680, 66169, 1442681, 66170, 1442682, 806, 810, 812, 827, 856, 858, 4915200, 5111808, 131703, 590455, 1507959, 2622327, 131704, 590456, 1507960, 2622328, 131705, 590457, 1507961, 2622329, 131706, 590458, 1507962, 2622330, 197239, 393847, 655991, 983671, 1573495, 2032247, 2687607, 3670903, 197240, 393848, 655992, 983672, 1573496, 2032248, 2687608, 3670904, 197241, 393849, 655993, 983673, 1573497, 2032249, 2687609, 3670905, 197242, 393850, 655994, 983674, 1573498, 2032250, 2687610, 3670906, 66086, 1442598, 66090, 1442602, 66092, 1442604, 66107, 1442619, 66136, 1442648, 66138, 1442650, 4980736, 5046272, 5177344, 5308416, 131622, 590374, 1507878, 2622246, 131626, 590378, 1507882, 2622250, 131628, 590380, 1507884, 2622252, 131643, 590395, 1507899, 2622267, 197158, 393766, 655910, 983590, 1573414, 2032166, 2687526, 3670822, 197162, 393770, 655914, 983594, 1573418, 2032170, 2687530, 3670826, 197164, 393772, 655916, 983596, 1573420, 2032172, 2687532, 3670828, 197179, 393787, 655931, 983611, 1573435, 2032187, 2687547, 3670843, 131672, 590424, 1507928, 2622296, 131674, 590426, 1507930, 2622298, 801, 802, 808, 809, 831, 5242880, 5373952, 5505024, 197208, 393816, 655960, 983640, 1573464, 2032216, 2687576, 3670872, 197210, 393818, 655962, 983642, 1573466, 2032218, 2687578, 3670874, 66081, 1442593, 66082, 1442594, 66088, 1442600, 66089, 1442601, 66111, 1442623, 807, 811, 892, 5439488, 5570560, 5767168, 131617, 590369, 1507873, 2622241, 131618, 590370, 1507874, 2622242, 131624, 590376, 1507880, 2622248, 131625, 590377, 1507881, 2622249, 197153, 393761, 655905, 983585, 1573409, 2032161, 2687521, 3670817, 197154, 393762, 655906, 983586, 1573410, 2032162, 2687522, 3670818, 197160, 393768, 655912, 983592, 1573416, 2032168, 2687528, 3670824, 197161, 393769, 655913, 983593, 1573417, 2032169, 2687529, 3670825, 131647, 590399, 1507903, 2622271, 66087, 1442599, 66091, 1442603, 66172, 1442684, 803, 830, 5636096, 5701632, 5832704, 5898240, 197183, 393791, 655935, 983615, 1573439, 2032191, 2687551, 3670847, 131623, 590375, 1507879, 2622247, 131627, 590379, 1507883, 2622251, 197159, 393767, 655911, 983591, 1573415, 2032167, 2687527, 3670823, 197163, 393771, 655915, 983595, 1573419, 2032171, 2687531, 3670827, 131708, 590460, 1507964, 2622332, 66083, 1442595, 66110, 1442622, ViewUtils.EDGE_TO_EDGE_FLAGS, 804, 832, 859, 861, 894, 5963776, 6029312, 197244, 393852, 655996, 983676, 1573500, 2032252, 2687612, 3670908, 131619, 590371, 1507875, 2622243, 131646, 590398, 1507902, 2622270, 197155, 393763, 655907, 983587, 1573411, 2032163, 2687523, 3670819, 197182, 393790, 655934, 983614, 1573438, 2032190, 2687550, 3670846, 66048, 1442560, 66084, 1442596, 66112, 1442624, 66139, 1442651, 66141, 1442653, 66174, 1442686, 862, 893, 6094848, 6160384, 131584, 590336, 1507840, 2622208, 131620, 590372, 1507876, 2622244, 131648, 590400, 1507904, 2622272, 131675, 590427, 1507931, 2622299, 197120, 393728, 655872, 983552, 1573376, 2032128, 2687488, 3670784, 197156, 393764, 655908, 983588, 1573412, 2032164, 2687524, 3670820, 197184, 393792, 655936, 983616, 1573440, 2032192, 2687552, 3670848, 197211, 393819, 655963, 983643, 1573467, 2032219, 2687579, 3670875, 131677, 590429, 1507933, 2622301, 131710, 590462, 1507966, 2622334, 66142, 1442654, 66173, 1442685, 828, 864, 891, 6225920, 197213, 393821, 655965, 983645, 1573469, 2032221, 2687581, 3670877, 197246, 393854, 655998, 983678, 1573502, 2032254, 2687614, 3670910, 131678, 590430, 1507934, 2622302, 131709, 590461, 1507965, 2622333, 66108, 1442620, 66144, 1442656, 66171, 1442683, 6291456, 7208960, 197214, 393822, 655966, 983646, 1573470, 2032222, 2687582, 3670878, 197245, 393853, 655997, 983677, 1573501, 2032253, 2687613, 3670909, 131644, 590396, 1507900, 2622268, 131680, 590432, 1507936, 2622304, 131707, 590459, 1507963, 2622331, 6356992, 6619136, 7274496, 8716288, 197180, 393788, 655932, 983612, 1573436, 2032188, 2687548, 3670844, 197216, 393824, 655968, 983648, 1573472, 2032224, 2687584, 3670880, 197243, 393851, 655995, 983675, 1573499, 2032251, 2687611, 3670907, 6422528, 6488064, 6684672, 6881280, 7340032, 7798784, 8781824, 10027008, 860, 963, 976, 6553600, 6750208, 6815744, 6946816, 7012352, 7405568, 7602176, 7864320, 8257536, 8847360, 9306112, 10092544, 11075584, 66140, 1442652, 66243, 1442755, 66256, 1442768, 896, 898, 899, 930, 952, 962, 992, 994, 7077888, 7143424, 131676, 590428, 1507932, 2622300, 131779, 590531, 1508035, 2622403, 131792, 590544, 1508048, 2622416, 66176, 1442688, 66178, 1442690, 197212, 393820, 655964, 983644, 1573468, 2032220, 2687580, 3670876, 197315, 393923, 656067, 983747, 1573571, 2032323, 2687683, 3670979, 197328, 393936, 656080, 983760, 1573584, 2032336, 2687696, 3670992, 131712, 590464, 1507968, 2622336, 131714, 590466, 1507970, 2622338, 197248, 393856, 656000, 983680, 1573504, 2032256, 2687616, 3670912, 197250, 393858, 656002, 983682, 1573506, 2032258, 2687618, 3670914, 66179, 1442691, 66210, 1442722, 66232, 1442744, 66242, 1442754, 66272, 1442784, 66274, 1442786, 921, PDF417Common.NUMBER_OF_CODEWORDS, 935, 940, 131715, 590467, 1507971, 2622339, 131746, 590498, 1508002, 2622370, 131768, 590520, 1508024, 2622392, 131778, 590530, 1508034, 2622402, 197251, 393859, 656003, 983683, 1573507, 2032259, 2687619, 3670915, 197282, 393890, 656034, 983714, 1573538, 2032290, 2687650, 3670946, 197304, 393912, 656056, 983736, 1573560, 2032312, 2687672, 3670968, 197314, 393922, 656066, 983746, 1573570, 2032322, 2687682, 3670978, 131808, 590560, 1508064, 2622432, 131810, 590562, 1508066, 2622434, 66201, 1442713, 66209, 1442721, 66215, 1442727, 66220, 1442732, 197344, 393952, 656096, 983776, 1573600, 2032352, 2687712, 3671008, 197346, 393954, 656098, 983778, 1573602, 2032354, 2687714, 3671010, 131737, 590489, 1507993, 2622361, 131745, 590497, 1508001, 2622369, 131751, 590503, 1508007, 2622375, 131756, 590508, 1508012, 2622380, 197273, 393881, 656025, 983705, 1573529, 2032281, 2687641, 3670937, 197281, 393889, 656033, 983713, 1573537, 2032289, 2687649, 3670945, 197287, 393895, 656039, 983719, 1573543, 2032295, 2687655, 3670951, 197292, 393900, 656044, 983724, 1573548, 2032300, 2687660, 3670956, 7471104, 7536640, 7667712, 7733248, 7929856, 8060928, 8323072, 8519680, 8912896, 9109504, 9371648, 9568256, 10158080, 10616832, 11141120, 11796480, 944, 945, 947, 977, 984, 985, 995, 997, 998, 7995392, 8126464, 8192000, 8388608, 8454144, 8585216, 8650752, 66224, 1442736, 66225, 1442737, 66227, 1442739, 66257, 1442769, 66264, 1442776, 66265, 1442777, 66275, 1442787, 66277, 1442789, 131760, 590512, 1508016, 2622384, 131761, 590513, 1508017, 2622385, 131763, 590515, 1508019, 2622387, 131793, 590545, 1508049, 2622417, 197296, 393904, 656048, 983728, 1573552, 2032304, 2687664, 3670960, 197297, 393905, 656049, 983729, 1573553, 2032305, 2687665, 3670961, 197299, 393907, 656051, 983731, 1573555, 2032307, 2687667, 3670963, 197329, 393937, 656081, 983761, 1573585, 2032337, 2687697, 3670993, 131800, 590552, 1508056, 2622424, 131801, 590553, 1508057, 2622425, 131811, 590563, 1508067, 2622435, 131813, 590565, 1508069, 2622437, 197336, 393944, 656088, 983768, 1573592, 2032344, 2687704, 3671000, 197337, 393945, 656089, 983769, 1573593, 2032345, 2687705, 3671001, 197347, 393955, 656099, 983779, 1573603, 2032355, 2687715, 3671011, 197349, 393957, 656101, 983781, 1573605, 2032357, 2687717, 3671013, 66278, 1442790, 897, TypedValues.Custom.TYPE_INT, TypedValues.Custom.TYPE_FLOAT, TypedValues.Custom.TYPE_COLOR, TypedValues.Custom.TYPE_BOOLEAN, 914, 922, 924, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 931, 932, 937, 938, 941, 131814, 590566, 1508070, 2622438, 66177, 1442689, 66180, 1442692, 66181, 1442693, 66182, 1442694, 66184, 1442696, 66194, 1442706, 197350, 393958, 656102, 983782, 1573606, 2032358, 2687718, 3671014, 131713, 590465, 1507969, 2622337, 131716, 590468, 1507972, 2622340, 197249, 393857, 656001, 983681, 1573505, 2032257, 2687617, 3670913, 197252, 393860, 656004, 983684, 1573508, 2032260, 2687620, 3670916, 131717, 590469, 1507973, 2622341, 131718, 590470, 1507974, 2622342, 131720, 590472, 1507976, 2622344, 131730, 590482, 1507986, 2622354, 197253, 393861, 656005, 983685, 1573509, 2032261, 2687621, 3670917, 197254, 393862, 656006, 983686, 1573510, 2032262, 2687622, 3670918, 
    197256, 393864, 656008, 983688, 1573512, 2032264, 2687624, 3670920, 197266, 393874, 656018, 983698, 1573522, 2032274, 2687634, 3670930, 66202, 1442714, 66204, 1442716, 66208, 1442720, 66211, 1442723, 66212, 1442724, 66217, 1442729, 66218, 1442730, 66221, 1442733, 131738, 590490, 1507994, 2622362, 131740, 590492, 1507996, 2622364, 131744, 590496, 1508000, 2622368, 131747, 590499, 1508003, 2622371, 197274, 393882, 656026, 983706, 1573530, 2032282, 2687642, 3670938, 197276, 393884, 656028, 983708, 1573532, 2032284, 2687644, 3670940, 197280, 393888, 656032, 983712, 1573536, 2032288, 2687648, 3670944, 197283, 393891, 656035, 983715, 1573539, 2032291, 2687651, 3670947, 131748, 590500, 1508004, 2622372, 131753, 590505, 1508009, 2622377, 131754, 590506, 1508010, 2622378, 131757, 590509, 1508013, 2622381, 197284, 393892, 656036, 983716, 1573540, 2032292, 2687652, 3670948, 197289, 393897, 656041, 983721, 1573545, 2032297, 2687657, 3670953, 197290, 393898, 656042, 983722, 1573546, 2032298, 2687658, 3670954, 197293, 393901, 656045, 983725, 1573549, 2032301, 2687661, 3670957, 8978432, 9043968, 9175040, 9240576, 9437184, 9502720, 9633792, 9830400, 10223616, 10420224, 10682368, 10878976, 11206656, 11403264, 11862016, 12451840, 946, 949, 953, 954, 955, 957, 958, 964, 966, 996, 1000, 1001, 9699328, 9764864, 9895936, 9961472, 66226, 1442738, 66229, 1442741, 66233, 1442745, 66234, 1442746, 66235, 1442747, 66237, 1442749, 66238, 1442750, 66244, 1442756, 131762, 590514, 1508018, 2622386, 131765, 590517, 1508021, 2622389, 131769, 590521, 1508025, 2622393, 131770, 590522, 1508026, 2622394, 197298, 393906, 656050, 983730, 1573554, 2032306, 2687666, 3670962, 197301, 393909, 656053, 983733, 1573557, 2032309, 2687669, 3670965, 197305, 393913, 656057, 983737, 1573561, 2032313, 2687673, 3670969, 197306, 393914, 656058, 983738, 1573562, 2032314, 2687674, 3670970, 131771, 590523, 1508027, 2622395, 131773, 590525, 1508029, 2622397, 131774, 590526, 1508030, 2622398, 131780, 590532, 1508036, 2622404, 197307, 393915, 656059, 983739, 1573563, 2032315, 2687675, 3670971, 197309, 393917, 656061, 983741, 1573565, 2032317, 2687677, 3670973, 197310, 393918, 656062, 983742, 1573566, 2032318, 2687678, 3670974, 197316, 393924, 656068, 983748, 1573572, 2032324, 2687684, 3670980, 66246, 1442758, 66276, 1442788, 66280, 1442792, 66281, 1442793, 769, TypedValues.Custom.TYPE_STRING, TypedValues.Custom.TYPE_DIMENSION, TypedValues.Custom.TYPE_REFERENCE, 907, 908, 909, 911, 131782, 590534, 1508038, 2622406, 131812, 590564, 1508068, 2622436, 131816, 590568, 1508072, 2622440, 131817, 590569, 1508073, 2622441, 197318, 393926, 656070, 983750, 1573574, 2032326, 2687686, 3670982, 197348, 393956, 656100, 983780, 1573604, 2032356, 2687716, 3671012, 197352, 393960, 656104, 983784, 1573608, 2032360, 2687720, 3671016, 197353, 393961, 656105, 983785, 1573609, 2032361, 2687721, 3671017, 66049, 1442561, 66183, 1442695, 66185, 1442697, 66186, 1442698, 66187, 1442699, 66188, 1442700, 66189, 1442701, 66191, 1442703, 131585, 590337, 1507841, 2622209, 131719, 590471, 1507975, 2622343, 131721, 590473, 1507977, 2622345, 131722, 590474, 1507978, 2622346, 197121, 393729, 655873, 983553, 1573377, 2032129, 2687489, 3670785, 197255, 393863, 656007, 983687, 1573511, 2032263, 2687623, 3670919, 197257, 393865, 656009, 983689, 1573513, 2032265, 2687625, 3670921, 197258, 393866, 656010, 983690, 1573514, 2032266, 2687626, 3670922, 131723, 590475, 1507979, 2622347, 131724, 590476, 1507980, 2622348, 131725, 590477, 1507981, 2622349, 131727, 590479, 1507983, 2622351, 197259, 393867, 656011, 983691, 1573515, 2032267, 2687627, 3670923, 197260, 393868, 656012, 983692, 1573516, 2032268, 2687628, 3670924, 197261, 393869, 656013, 983693, 1573517, 2032269, 2687629, 3670925, 197263, 393871, 656015, 983695, 1573519, 2032271, 2687631, 3670927, 10289152, 10354688, 10485760, 10551296, 10747904, 10813440, 10944512, 11010048, 11272192, 11337728, 11468800, 11599872, 11927552, 12124160, 12517376, 13565952, 915, 917, 918, 919, 920, 923, 925, 926, 933, 934, 936, 942, 943, 948, 950, 951, 66195, 1442707, 66197, 1442709, 66198, 1442710, 66199, 1442711, 66200, 1442712, 66203, 1442715, 66205, 1442717, 66206, 1442718, 131731, 590483, 1507987, 2622355, 131733, 590485, 1507989, 2622357, 131734, 590486, 1507990, 2622358, 131735, 590487, 1507991, 2622359, 197267, 393875, 656019, 983699, 1573523, 2032275, 2687635, 3670931, 197269, 393877, 656021, 983701, 1573525, 2032277, 2687637, 3670933, 197270, 393878, 656022, 983702, 1573526, 2032278, 2687638, 3670934, 197271, 393879, 656023, 983703, 1573527, 2032279, 2687639, 3670935, 131736, 590488, 1507992, 2622360, 131739, 590491, 1507995, 2622363, 131741, 590493, 1507997, 2622365, 131742, 590494, 1507998, 2622366, 197272, 393880, 656024, 983704, 1573528, 2032280, 2687640, 3670936, 197275, 393883, 656027, 983707, 1573531, 2032283, 2687643, 3670939, 197277, 393885, 656029, 983709, 1573533, 2032285, 2687645, 3670941, 197278, 393886, 656030, 983710, 1573534, 2032286, 2687646, 3670942, 66213, 1442725, 66214, 1442726, 66216, 1442728, 66222, 1442734, 66223, 1442735, 66228, 1442740, 66230, 1442742, 66231, 1442743, 131749, 590501, 1508005, 2622373, 131750, 590502, 1508006, 2622374, 131752, 590504, 1508008, 2622376, 131758, 590510, 1508014, 2622382, 197285, 393893, 656037, 983717, 1573541, 2032293, 2687653, 3670949, 197286, 393894, 656038, 983718, 1573542, 2032294, 2687654, 3670950, 197288, 393896, 656040, 983720, 1573544, 2032296, 2687656, 3670952, 197294, 393902, 656046, 983726, 1573550, 2032302, 2687662, 3670958, 131759, 590511, 1508015, 2622383, 131764, 590516, 1508020, 2622388, 131766, 590518, 1508022, 2622390, 131767, 590519, 1508023, 2622391, 197295, 393903, 656047, 983727, 1573551, 2032303, 2687663, 3670959, 197300, 393908, 656052, 983732, 1573556, 2032308, 2687668, 3670964, 197302, 393910, 656054, 983734, 1573558, 2032310, 2687670, 3670966, 197303, 393911, 656055, 983735, 1573559, 2032311, 2687671, 3670967, 956, 959, 965, 999, 1007, 11534336, 11665408, 11730944, 11993088, 12058624, 12189696, 12255232, 12582912, 13041664, 13631488, 14614528, 66236, 1442748, 66239, 1442751, 66245, 1442757, 66279, 1442791, 66287, 1442799, 777, 910, 912, 913, 916, 927, 131772, 590524, 1508028, 2622396, 131775, 590527, 1508031, 2622399, 131781, 590533, 1508037, 2622405, 131815, 590567, 1508071, 2622439, 197308, 393916, 656060, 983740, 1573564, 2032316, 2687676, 3670972, 197311, 393919, 656063, 983743, 1573567, 2032319, 2687679, 3670975, 197317, 393925, 656069, 983749, 1573573, 2032325, 2687685, 3670981, 197351, 393959, 656103, 983783, 1573607, 2032359, 2687719, 3671015, 131823, 590575, 1508079, 2622447, 66057, 1442569, 66190, 1442702, 66192, 1442704, 66193, 1442705, 66196, 1442708, 66207, 1442719, 197359, 393967, 656111, 983791, 1573615, 2032367, 2687727, 3671023, 131593, 590345, 1507849, 2622217, 131726, 590478, 1507982, 2622350, 197129, 393737, 655881, 983561, 1573385, 2032137, 2687497, 3670793, 197262, 393870, 656014, 983694, 1573518, 2032270, 2687630, 3670926, 131728, 590480, 1507984, 2622352, 131729, 590481, 1507985, 2622353, 131732, 590484, 1507988, 2622356, 131743, 590495, 1507999, 2622367, 197264, 393872, 656016, 983696, 1573520, 2032272, 2687632, 3670928, 197265, 393873, 656017, 983697, 1573521, 2032273, 2687633, 3670929, 197268, 393876, 656020, 983700, 1573524, 2032276, 2687636, 3670932, 197279, 393887, 656031, 983711, 1573535, 2032287, 2687647, 3670943, 939, 974, 983, 993, 1004, 1005, 12320768, 12386304, 12648448, 12845056, 13107200, 13303808, 13697024, 14155776, 14680064, 15597568, 66219, 1442731, 66254, 1442766, 66263, 1442775, 66273, 1442785, 66284, 1442796, 66285, 1442797, 967, 975, 1002, 1003, 131755, 590507, 1508011, 2622379, 131790, 590542, 1508046, 2622414, 131799, 590551, 1508055, 2622423, 131809, 590561, 1508065, 2622433, 197291, 393899, 656043, 983723, 1573547, 2032299, 2687659, 3670955, 197326, 393934, 656078, 983758, 1573582, 2032334, 2687694, 3670990, 197335, 393943, 656087, 983767, 1573591, 2032343, 2687703, 3670999, 197345, 393953, 656097, 983777, 1573601, 2032353, 2687713, 3671009, 131820, 590572, 1508076, 2622444, 131821, 590573, 1508077, 2622445, 66247, 1442759, 66255, 1442767, 66282, 1442794, 66283, 1442795, 197356, 393964, 656108, 983788, 1573612, 2032364, 2687724, 3671020, 197357, 393965, 656109, 983789, 1573613, 2032365, 2687725, 3671021, 131783, 590535, 1508039, 2622407, 131791, 590543, 1508047, 2622415, 
    131818, 590570, 1508074, 2622442, 131819, 590571, 1508075, 2622443, 197319, 393927, 656071, 983751, 1573575, 2032327, 2687687, 3670983, 197327, 393935, 656079, 983759, 1573583, 2032335, 2687695, 3670991, 197354, 393962, 656106, 983786, 1573610, 2032362, 2687722, 3671018, 197355, 393963, 656107, 983787, 1573611, 2032363, 2687723, 3671019, 12713984, 12779520, 12910592, 12976128, 13172736, 13238272, 13369344, 13434880, 13762560, 13959168, 14221312, 14417920, 14745600, 15138816, 15663104, 16121856, 960, 961, 968, 969, 970, 973, 978, 981, 986, 987, 1006, 1008, 1010, 1011, AnalyticsListener.EVENT_DRM_KEYS_LOADED, 13500416, 66240, 1442752, 66241, 1442753, 66248, 1442760, 66249, 1442761, 66250, 1442762, 66253, 1442765, 66258, 1442770, 66261, 1442773, 131776, 590528, 1508032, 2622400, 131777, 590529, 1508033, 2622401, 131784, 590536, 1508040, 2622408, 131785, 590537, 1508041, 2622409, 197312, 393920, 656064, 983744, 1573568, 2032320, 2687680, 3670976, 197313, 393921, 656065, 983745, 1573569, 2032321, 2687681, 3670977, 197320, 393928, 656072, 983752, 1573576, 2032328, 2687688, 3670984, 197321, 393929, 656073, 983753, 1573577, 2032329, 2687689, 3670985, 131786, 590538, 1508042, 2622410, 131789, 590541, 1508045, 2622413, 131794, 590546, 1508050, 2622418, 131797, 590549, 1508053, 2622421, 197322, 393930, 656074, 983754, 1573578, 2032330, 2687690, 3670986, 197325, 393933, 656077, 983757, 1573581, 2032333, 2687693, 3670989, 197330, 393938, 656082, 983762, 1573586, 2032338, 2687698, 3670994, 197333, 393941, 656085, 983765, 1573589, 2032341, 2687701, 3670997, 66266, 1442778, 66267, 1442779, 66286, 1442798, 66288, 1442800, 66290, 1442802, 66291, 1442803, 66303, 1442815, 971, 972, 131802, 590554, 1508058, 2622426, 131803, 590555, 1508059, 2622427, 131822, 590574, 1508078, 2622446, 131824, 590576, 1508080, 2622448, 197338, 393946, 656090, 983770, 1573594, 2032346, 2687706, 3671002, 197339, 393947, 656091, 983771, 1573595, 2032347, 2687707, 3671003, 197358, 393966, 656110, 983790, 1573614, 2032366, 2687726, 3671022, 197360, 393968, 656112, 983792, 1573616, 2032368, 2687728, 3671024, 131826, 590578, 1508082, 2622450, 131827, 590579, 1508083, 2622451, 131839, 590591, 1508095, 2622463, 66251, 1442763, 66252, 1442764, 197362, 393970, 656114, 983794, 1573618, 2032370, 2687730, 3671026, 197363, 393971, 656115, 983795, 1573619, 2032371, 2687731, 3671027, 197375, 393983, 656127, 983807, 1573631, 2032383, 2687743, 3671039, 131787, 590539, 1508043, 2622411, 131788, 590540, 1508044, 2622412, 197323, 393931, 656075, 983755, 1573579, 2032331, 2687691, 3670987, 197324, 393932, 656076, 983756, 1573580, 2032332, 2687692, 3670988, 13828096, 13893632, 14024704, 14090240, 14286848, 14352384, 14483456, 14548992, 14811136, 14942208, 15204352, 15400960, 15728640, 15925248, 16187392, 16384000, 979, 980, 982, 989, 990, 991, 1009, 1012, 1013, 1014, 1015, 1016, 1018, 1019, 1020, 1021, 66259, 1442771, 66260, 1442772, 66262, 1442774, 66269, 1442781, 66270, 1442782, 66271, 1442783, 66289, 1442801, 66292, 1442804, 131795, 590547, 1508051, 2622419, 131796, 590548, 1508052, 2622420, 131798, 590550, 1508054, 2622422, 131805, 590557, 1508061, 2622429, 197331, 393939, 656083, 983763, 1573587, 2032339, 2687699, 3670995, 197332, 393940, 656084, 983764, 1573588, 2032340, 2687700, 3670996, 197334, 393942, 656086, 983766, 1573590, 2032342, 2687702, 3670998, 197341, 393949, 656093, 983773, 1573597, 2032349, 2687709, 3671005, 131806, 590558, 1508062, 2622430, 131807, 590559, 1508063, 2622431, 131825, 590577, 1508081, 2622449, 131828, 590580, 1508084, 2622452, 197342, 393950, 656094, 983774, 1573598, 2032350, 2687710, 3671006, 197343, 393951, 656095, 983775, 1573599, 2032351, 2687711, 3671007, 197361, 393969, 656113, 983793, 1573617, 2032369, 2687729, 3671025, 197364, 393972, 656116, 983796, 1573620, 2032372, 2687732, 3671028, 66293, 1442805, 66294, 1442806, 66295, 1442807, 66296, 1442808, 66298, 1442810, 66299, 1442811, 66300, 1442812, 66301, 1442813, 131829, 590581, 1508085, 2622453, 131830, 590582, 1508086, 2622454, 131831, 590583, 1508087, 2622455, 131832, 590584, 1508088, 2622456, 197365, 393973, 656117, 983797, 1573621, 2032373, 2687733, 3671029, 197366, 393974, 656118, 983798, 1573622, 2032374, 2687734, 3671030, 197367, 393975, 656119, 983799, 1573623, 2032375, 2687735, 3671031, 197368, 393976, 656120, 983800, 1573624, 2032376, 2687736, 3671032, 131834, 590586, 1508090, 2622458, 131835, 590587, 1508091, 2622459, 131836, 590588, 1508092, 2622460, 131837, 590589, 1508093, 2622461, 197370, 393978, 656122, 983802, 1573626, 2032378, 2687738, 3671034, 197371, 393979, 656123, 983803, 1573627, 2032379, 2687739, 3671035, 197372, 393980, 656124, 983804, 1573628, 2032380, 2687740, 3671036, 197373, 393981, 656125, 983805, 1573629, 2032381, 2687741, 3671037, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 14876672, 15007744, 15073280, 15269888, 15335424, 15466496, 15532032, 15794176, 15859712, 15990784, 16056320, 16252928, 16318464, 16449536, 16515072, 66302, 1442814, 770, 771, 772, 773, 774, 775, 776, 779, 780, 782, 783, 784, 785, 786, 131838, 590590, 1508094, 2622462, 66050, 1442562, 66051, 1442563, 66052, 1442564, 66053, 1442565, 66054, 1442566, 66055, 1442567, 197374, 393982, 656126, 983806, 1573630, 2032382, 2687742, 3671038, 131586, 590338, 1507842, 2622210, 131587, 590339, 1507843, 2622211, 197122, 393730, 655874, 983554, 1573378, 2032130, 2687490, 3670786, 197123, 393731, 655875, 983555, 1573379, 2032131, 2687491, 3670787, 131588, 590340, 1507844, 2622212, 131589, 590341, 1507845, 2622213, 131590, 590342, 1507846, 2622214, 131591, 590343, 1507847, 2622215, 197124, 393732, 655876, 983556, 1573380, 2032132, 2687492, 3670788, 197125, 393733, 655877, 983557, 1573381, 2032133, 2687493, 3670789, 197126, 393734, 655878, 983558, 1573382, 2032134, 2687494, 3670790, 197127, 393735, 655879, 983559, 1573383, 2032135, 2687495, 3670791, 66056, 1442568, 66059, 1442571, 66060, 1442572, 66062, 1442574, 66063, 1442575, 66064, 1442576, 66065, 1442577, 66066, 1442578, 131592, 590344, 1507848, 2622216, 131595, 590347, 1507851, 2622219, 131596, 590348, 1507852, 2622220, 131598, 590350, 1507854, 2622222, 197128, 393736, 655880, 983560, 1573384, 2032136, 2687496, 3670792, 197131, 393739, 655883, 983563, 1573387, 2032139, 2687499, 3670795, 197132, 393740, 655884, 983564, 1573388, 2032140, 2687500, 3670796, 197134, 393742, 655886, 983566, 1573390, 2032142, 2687502, 3670798, 131599, 590351, 1507855, 2622223, 131600, 590352, 1507856, 2622224, 131601, 590353, 1507857, 2622225, 131602, 590354, 1507858, 2622226, 197135, 393743, 655887, 983567, 1573391, 2032143, 2687503, 3670799, 197136, 393744, 655888, 983568, 1573392, 2032144, 2687504, 3670800, 197137, 393745, 655889, 983569, 1573393, 2032145, 2687505, 3670801, 197138, 393746, 655890, 983570, 1573394, 2032146, 2687506, 3670802, 787, 788, 789, 791, 792, 793, 794, 795, 796, 797, 798, 799, 895, 988, 1017, 16580608, 66067, 1442579, 66068, 1442580, 66069, 1442581, 66071, 1442583, 66072, 1442584, 66073, 1442585, 66074, 1442586, 66075, 1442587, 131603, 590355, 1507859, 2622227, 131604, 590356, 1507860, 2622228, 131605, 590357, 1507861, 2622229, 131607, 590359, 1507863, 2622231, 197139, 393747, 655891, 983571, 1573395, 2032147, 2687507, 3670803, 197140, 393748, 655892, 983572, 1573396, 2032148, 2687508, 3670804, 197141, 393749, 655893, 983573, 1573397, 2032149, 2687509, 3670805, 197143, 393751, 655895, 983575, 1573399, 2032151, 2687511, 3670807, 131608, 590360, 1507864, 2622232, 131609, 590361, 1507865, 2622233, 131610, 590362, 1507866, 2622234, 131611, 590363, 1507867, 2622235, 197144, 393752, 655896, 983576, 1573400, 2032152, 2687512, 3670808, 197145, 393753, 655897, 983577, 1573401, 2032153, 2687513, 3670809, 197146, 393754, 655898, 983578, 1573402, 2032154, 2687514, 3670810, 197147, 393755, 655899, 983579, 1573403, 2032155, 2687515, 3670811, 66076, 1442588, 66077, 1442589, 66078, 1442590, 66079, 1442591, 66175, 1442687, 66268, 1442780, 66297, 1442809, 16646144, 16711680, 131612, 590364, 1507868, 2622236, 131613, 590365, 1507869, 2622237, 131614, 590366, 1507870, 2622238, 131615, 590367, 1507871, 2622239, 197148, 393756, 655900, 983580, 1573404, 2032156, 2687516, 3670812, 197149, 393757, 655901, 983581, 1573405, 2032157, 2687517, 3670813, 197150, 393758, 655902, 983582, 1573406, 2032158, 2687518, 3670814, 197151, 393759, 655903, 983583, 1573407, 2032159, 2687519, 3670815, 
    131711, 590463, 1507967, 2622335, 131804, 590556, 1508060, 2622428, 131833, 590585, 1508089, 2622457, 778, 781, 790, 1024, 197247, 393855, 655999, 983679, 1573503, 2032255, 2687615, 3670911, 197340, 393948, 656092, 983772, 1573596, 2032348, 2687708, 3671004, 197369, 393977, 656121, 983801, 1573625, 2032377, 2687737, 3671033, 66058, 1442570, 66061, 1442573, 66070, 1442582, 1024, 1024, 131594, 590346, 1507850, 2622218, 131597, 590349, 1507853, 2622221, 131606, 590358, 1507862, 2622230, 1024, 1024, 1024, 1024, 197130, 393738, 655882, 983562, 1573386, 2032138, 2687498, 3670794, 197133, 393741, 655885, 983565, 1573389, 2032141, 2687501, 3670797, 197142, 393750, 655894, 983574, 1573398, 2032150, 2687510, 3670806, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024};
    private static final Http2Exception BAD_ENCODING = (Http2Exception) ThrowableUtil.unknownStackTrace(Http2Exception.newStatic(Http2Error.COMPRESSION_ERROR, "HPACK - Bad Encoding", Http2Exception.ShutdownHint.HARD_SHUTDOWN), HpackHuffmanDecoder.class, "decode(..)");

    public AsciiString decode(ByteBuf byteBuf, int i) throws Http2Exception {
        if (i == 0) {
            return AsciiString.EMPTY_STRING;
        }
        this.dest = new byte[(i * 8) / 5];
        try {
            int readerIndex = byteBuf.readerIndex();
            int forEachByte = byteBuf.forEachByte(readerIndex, i, this);
            if (forEachByte == -1) {
                byteBuf.readerIndex(readerIndex + i);
                if ((this.state & 256) != 256) {
                    throw BAD_ENCODING;
                }
                return new AsciiString(this.dest, 0, this.k, false);
            }
            byteBuf.readerIndex(forEachByte);
            throw BAD_ENCODING;
        } finally {
            this.dest = null;
            this.k = 0;
            this.state = 0;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
    public boolean process(byte b) {
        return processNibble(b >> 4) && processNibble(b);
    }

    private boolean processNibble(int i) {
        int i2 = HUFFS[(i & 15) | (this.state >> 12)];
        this.state = i2;
        if ((i2 & 1024) != 0) {
            return false;
        }
        if ((i2 & 512) != 0) {
            byte[] bArr = this.dest;
            int i3 = this.k;
            this.k = i3 + 1;
            bArr[i3] = (byte) i2;
            return true;
        }
        return true;
    }
}
