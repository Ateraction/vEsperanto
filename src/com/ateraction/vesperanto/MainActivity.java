package com.ateraction.vesperanto;

//vEsperanto
//Stand alone mode: use only available media
//https://github.com/Ateraction/vEsperanto
//https://play.google.com/store/apps/details?id=com.ateraction.vesperanto
//Commit error git :boom: :camel: 
//-----------things to do-------------

//TODO remove signsWritting before rewriting(useful for debug)
//TODO Remove video end
//TODO Clean all requests before sending(not only user, but google or SignLang

//TODO Remove all TXT search (with delete *.* at a request begin or at search start)


//TODO add ateraction video to app ressources or download it (correct videNotFound)


//TODO create a log Request File
//TODO add video researchFinishNotFound Date (to allow an update after xxx days )

//TODO count words form log request  to create words stats
//TODO Save modifications
//TODO add word Lemmatizer like TreeTagger 


//TODO use a real wordDatabase (Size+Time) like lexique.org in french 129Kwords 
/* http://www.statistiques-mondiales.com/langues.htm  
* http://lexique.org/outils/Manuel_Lexique.htm
* http://www.lexique.org/moteur/simple.php
* maison
* ortho	phon	lemme	cgram	genre	nombre	freqlemfilms2	freqlemlivres	freqfilms2	freqlivres	infover	nbhomogr	nbhomoph	islem	nblettres	nbphons	cvcv	p_cvcv	voisorth	voisphon	puorth	puphon	syll	nbsyll	cv_cv	orthrenv	phonrenv	orthosyll	cgramortho	deflem	defobs	old20	pld20	morphoder	nbmorph
* maison	mEz§	maison	NOM		s	605.75	575.34	570.30	461.55		1	2	1	6	4	CVVCVC	CVCV	2	8	6	4	mE-z§	2	CV-CV	nosiam
*/ 

//TODO use add more languages
/* French
 *L'ONU possède 6 langues officielles1 : le mandarin, le français, l’espagnol, le russe, l’arabe et l’anglais.
 *Les langues de travail du Secrétariat de l'ONU sont l'anglais et le français.
 */


//TODO add more media providers for LSF (actually only using Elix French Videos: 	~6000signs)
/* French Sign Languages FSL/Langues des Signes françaises LSF
 * Some of the french providers :
*/

/*Wikimedia 
 * http://commons.wikimedia.org/wiki/Category:LSF
 * 
 * This category has the following 2 subcategories, out of 2 total.
 * LSF fingerspelling27
 * Videos Langue des signes française32
 *  
 * http://fr.wikibooks.org/wiki/Langue_des_signes_fran%C3%A7aise/Vocabulaire
 Available words under Wikibook FSL(LSF)  
 Langue des signes française/Outils
 Langue des signes française/Vocab/affreux
 Langue des signes française/Vocab/aider
 Langue des signes française/Vocab/amende
 Langue des signes française/Vocab/automatique
 Langue des signes française/Vocab/avocat
 Langue des signes française/Vocab/configuration
 Langue des signes française/Vocab/demander
 Langue des signes française/Vocab/education
 Langue des signes française/Vocab/humanitaire
 Langue des signes française/Vocab/informer
 Langue des signes française/Vocab/international
 Langue des signes française/Vocab/inviter
 Langue des signes française/Vocab/juge
 Langue des signes française/Vocab/juger
 Langue des signes française/Vocab/lsf
 Langue des signes française/Vocab/moche
 Langue des signes française/Vocab/montrer
 Langue des signes française/Vocab/neutre
 Langue des signes française/Vocab/payer
 Langue des signes française/Vocab/preferer
 Langue des signes française/Vocab/preter
 Langue des signes française/Vocab/presenter
 Langue des signes française/Vocab/regarder
 Langue des signes française/Vocab/rendre
 Langue des signes française/Vocab/s'inscrire
 Langue des signes française/Vocab/social
 Langue des signes française/Vocab/syntaxe
 Langue des signes française/Vocab/verbe
 Langue des signes française/Vocab/vocabulaire
 Langue des signes française/Vocab/voix

 * http://commons.wikimedia.org/wiki/Category:Ogg_videos
 * http://commons.wikimedia.org/wiki/API
 * http://www.ditesleenlanguedessignes.fr/videos/original/bonjour.mp4
 * 
 * 
 */



 /*Wikisign
  *  http://lsf.wikisign.org/wiki/Wikisign:Accueil
 * http://lsc.wikisign.org/wiki/Wikisign:Portada
 * http://dgs.wikisign.org/wiki/Wikisign:Hauptseite
 * WIKISIGN FR 559signs Catalana???signs Deutsche840
 * Not a lot signs but a good list
 */


 /*Autres sites-dictionnaires
 Voir MultiDico, la recherche multi-dictionnaire
 http://lsf.wikisign.org/wiki/Sp%C3%A9cial:MultiDico?signe=bonjour


 Elix 	~6000 signes et 8000 définitions en LSF
 Sématos 	~2800 signes
 DicoL.S.F. 	~2600 signes, dont d'autres L.S.
 Web LSF Lexique 	~2100 signes (au repos)
 Université Paris8 	~2100 signes (au repos)
 Pisourd 	~1400 signes, médecine et prévention
 SignPuddle 	~900 signes (SignPuddle LSF Suisse : ~3500 signes), uniquement SignWriting
 LSF Plus 	~700 signes
 Université Nancy2 	~450 signes, termes de spécialité (au repos)
 L'impôt en LSF 	~350 signes, fiscalité (au repos)
 Répertoire lexical 	~170 signes, maths et français (au repos)
 LangueSignes 	~80 signes (dessins explicatifs)
 Et d'autres petits dicos (au repos) : Languedessignes , Wikibook lsf , Signes Bébé
 Annuaire des cours de LSF sur l'ensemble du territoire Français


 http://lsf.wikisign.org/wiki/Sp%C3%A9cial:MultiDico
 http://lsf.wikisign.org/wiki/Spécial:MultiDico
 MultiSite research with

 WikiSign
 Culinan
 WebLSFLexique
 Sourds.net
 Pisourd  //http://www.pisourd.ch/  blue background video + used hand configs +optionnal sign writting
 SpreadTheSign
 SignPuddle-FR
 SignPuddle-CH
 Univ. Paris8
 LSF Plus
 Handi'cnam
 Hanploi iPhone
 L'impot en LSF
 Sematos
 LangueSignes
 Signes Bébé

 http://www.culinan.net/  1171signes

 http://blog.ove.asso.fr/neosignes/2009/06/18/hasard/     
 On constate qu’à l’heure actuelle, les dictionnaires de LSF existants ne sont plus suffisants car l’enseignement au collège est davantage exigeant : les élèves sourds doivent assimiler plus de lexique. Les enseignants désirent faire usage des signes plus spécifiques et adéquats aux termes disciplinaires rencontrés dans les programmes. Les dictionnaires LSF (livres) existants sont difficilement accessibles par leur conception en deux dimensions. Il est donc nécessaire pour les professionnels de la langue des signes de s’engager dans des pistes de réflexion sur les signes employés à l’état actuel et de les créer au besoin. Ces nouveaux signes doivent être cohérents avec leur objet et plus facilement adoptés par le public.

 On s’aperçoit que dans certaines disciplines, comme les sciences, elles demandent un vocabulaire bien particulier que les élèves n’ont pas souvent en français. Leur faible niveau en français ne permet pas de bien utiliser les livres ou les textes en cours; On rencontre le même problème en LSF, beaucoup de mots scientifiques ne trouvent pas leur équivalence en LSF et plus le niveau d’étude est plus élevé, plus il demande un vocabulaire précis. Les élèves qui arrivent en 6ème présentent une grande hétérogénéité quant à leur niveau en langue des signes.

 http://ijs.92.dico.free.fr/maths/page022.html

 http://www.lsfdico-injsmetz.fr/recherche-alphabetique.php?mot=648&lettre=a

 http://www.lsfdico-injsmetz.fr/recherche-alphabetique.php?mot=2296&lettre=a&valeur=200
 The background is a movingBackground



 * 
 * Not Referenced but most important 
 * SpreadTheSign http://www.spreadthesign.com/
 * Problem after a request there is no clear parameters in your address (Hide)
 * numerous way to get the request but the easiest: make them visible(HTML modification) or Log request.
 * 
 * Extract the data using a networkRequestLogger (for exemple mozilla plugins...)
 * Run the request on the page
 * Get the results
 * X-Requested-With:	XMLHttpRequest
 User-Agent:	Mozilla/5.0 (Windows NT 6.1; WOW64; rv:30.0) Gecko/20100101 Firefox/30.0
 Referer:	http://www.spreadthesign.com/
 Pragma:	no-cache
 Host:	www.spreadthesign.com
 Content-Type:	application/x-www-form-urlencoded; charset=UTF-8
 Content-Length:	44
 Connection:	keep-alive
 Cache-Control:	no-cache
 Accept-Language:	fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3
 Accept-Encoding:	gzip, deflate
 Accept:	* / *
 Cookie envoyé
 __utmz:	131969357.1404155068.1.1.utmcsr=lsf.wikisign.org|utmccn=(referral)|utmcmd=referral|utmcct=/spread_the_sign.php
 __utmc:	131969357
 __utmb:	131969357.23.10.1406420770
 __utma:	131969357.672733194.1404155068.1404155068.1406420770.2
 Contenu de la requête
 page=1&lang=10&class=0&group=0&search=bonjou
 En-têtes de la réponse 163ms
 X-Powered-By:	PHP/5.3.10-1ubuntu3.11
 Vary:	Accept-Encoding
 Transfer-Encoding:	chunked
 Server:	nginx
 Pragma:	no-cache
 Last-Modified:	Sun, 27 Jul 2014 00:52:28 GMT
 Expires:	Mon, 26 Jul 1997 05:00:00 GMT
 Date:	Sun, 27 Jul 2014 00:52:28 GMT
 Content-Type:	text/html; charset=utf-8
 Content-Encoding:	gzip
 Connection:	keep-alive
 Cache-Control:	no-store, no-cache, must-revalidate, post-check=0, pre-check=0
 Contenu de la réponse 0ms
 <div id="tablelist"> <div class="list-row dark"> <ul> <li class="caption">bonjour</li> <li class="flags"> <a href="/fr/4021/bonjour-hello%21-fran%C3%A7ais-anglais" title="Anglais" class="display_video_btn" data-magnet="410" data-video-language="1" data-video-id="4021"> <img src="/images/flags/1.gif" alt="Anglais" /> </a> <a href="/fr/4023/bonjour-hall%C3%A5-fran%C3%A7ais-su%C3%A9dois-" title="Suédois " class="display_video_btn" data-magnet="410" data-video-language="2" data-video-id="4023"> <img src="/images/flags/2.gif" alt="Suédois " /> </a> <a href="/fr/4020/bonjour-labas-fran%C3%A7ais-lituanien-" title="Lituanien " class="display_video_btn" data-magnet="410" data-video-language="3" data-video-id="4020"> <img src="/images/flags/3.gif" alt="L

 ...
 and try to correct it
 * SpreadTheSign http://www.spreadthesign.com/includes/search.inc.php?page=1&lang=10&class=0&group=0&search=bonjour
 * http://lsf.wikisign.org/spread_the_sign.php?i=12836
 * http://lsf.wikisign.org/spread_the_sign.php?i=12836 May work ???
 * 
 * 
 * OK in French there is Elix
 * http://www.elix-lsf.fr/spip.php?page=mes_signes&id_auteur=2223&debut_signes_theque=11#pagination_signes_theque
 * 
 * http://www.elix-lsf.fr/spip.php?page=opensearch.xml
 * For open search 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * CamFind looks like PercentEncoding
 * http://en.wikipedia.org/wiki/Percent-encoding
 * may be fixed by function fixedEncodeURI (str) {
 return encodeURI(str).replace(/%5B/g, '[').replace(/%5D/g, ']');
 }
 * but it's not a basic percent encoding:
 *  in fact the %255B %255D replace %5B %5D
 *  down vote accepted
 *  %20=' ' is space
 *  %3A=':'
 *  %3D="="
 *  %26 ='&'
 *  %5B = '['
 and %5D = ']'
 * baseString POST&http%3A%2F%2Fapi.camfindapp.com%2Fimage_requests&image_request%255Baltitude%255D%3D%26image_request%255Bdevice_id%255D%3D359077050652820%26image_request%255Blanguage%255D%3Dfr%26image_request%255Blatitude%255D%3D0.0%26image_request%255Blocale%255D%3DFR%26image_request%255Blongitude%255D%3D0.0%26oauth_consumer_key%3D9P_bk62AO6sdUxFXBOxUng%26oauth_nonce%3D1234%26oauth_signature_method%3DHMAC-SHA1%26oauth_timestamp%3D1405772043%26oauth_version%3D1.0
 * 
 * baseString POST&http %3A %2F %2F api.camfindapp.com/image_requests&image_request %255B altitude %255D %3D %26 image_request %255B device_id %255D %3D359077050652820%26image_request %255B language %255D %3D fr %26 image_request %255Blatitude %255D %3D 0.0 %26 image_request %255B locale %255D %3D FR %26 image_request %255B longitude %255D %3D 0.0 %26 oauth_consumer_key %3D 9P_bk62AO6sdUxFXBOxUng %26 oauth_nonce %3D 1234 %26 oauth_signature_method %3D HMAC-SHA1 %26 oauth_timestamp %3D 1405772043 %26 oauth_version %3D 1.0
 * baseString POST&http://api.camfindapp.com/image_requests&image_request[altitude]=&image_request[device_id]=359077050652820%26image_request[language]fr&image_request[latitude]=0.0&image_request[locale]=FR&image_request[longitude]=0.0&oauth_consumer_key=9P_bk62AO6sdUxFXBOxUng&oauth_nonce=1234&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1405772043&oauth_version=1.0
 *
 * GGGG ---->Request: Header: OAuth oauth_timestamp="1405772043", oauth_nonce="1234", oauth_version="1.0", oauth_consumer_key="9P_bk62AO6sdUxFXBOxUng", oauth_signature_method="HMAC-SHA1", oauth_signature="8YW6xgtzWQSQin6teXxw8wnep0w%3D"
 * 
 * */

//TODO clean packages import
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.EntityUtils;

import android.app.ActionBar;
import android.app.ActionBar.LayoutParams;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData.Item;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.ExifInterface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.MediaStore;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Video;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.text.Html;
import android.text.format.Time;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.FindListener;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.VideoView;
import com.ateraction.vesperanto.R;




public class MainActivity extends Activity implements OnClickListener,
		OnCompletionListener,OnPreparedListener, OnLongClickListener {
	private SpeechRecognizer sr;
	public AudioManager am;
    public SpeechRecognizer     speechRecognizer;
    public String lastPartialResult;
	// implements OnClickListener for UI handling
	 //implements OnCompletionListener for video list handling
//,OnInfoListener is based upon api17
	// Need handler for callbacks to the UI thread
	final Handler mHandler = new Handler();
	// Create runnable for posting
	final Runnable mUpdateResults = new Runnable() {
		//String	lastRequestNotNull;
		public void run() {
			String	lastRequestNotNull= lastRequest;
			 if (lastRequest!=null){
			   /*  ((TextView) findViewById(R.id.text1)).setText(
							Html.fromHtml(
									lastRequest+"   <br>   "+
							((TextView) findViewById(R.id.text1)).getText()
							
							)
							);*/
				 processRequest(lastRequest);
				 writeSharedPrefString("lastRequest",lastRequest);
				 lastRequestNotNull=lastRequest;
				 if (lastRequest!=null)processRequest(lastRequest);
				 else processRequest(lastRequestNotNull);
			 }
			 //processRequest(lastRequest);
			Log.d("mUpdateResults"," process Request finished"+lastRequest);
			
			updateResultsInUi();
		}
	};
	final Runnable mDownloadFinish = new Runnable() {
		public void run() {
			// processRequest(lastRequest);
			updateMediaInUi();
		}
	};

	protected void startLongRunningOperation() {
		Log.d("updateResultsInUi","Star LongRunningOperation");
		// Fire off a thread to do some work that we shouldn't do directly in
		// the UI thread
		Thread t = new Thread() {
			public void run() {
				// mResults = doSomethingExpensive();
				// processRequest(lastRequest);
				// for (int i=0;i<8000;i++){}
				mHandler.post(mDownloadFinish);
				mHandler.post(mUpdateResults);
			}
		};
		t.start();
	}

	private void updateResultsInUi() {
		/*Toast.makeText(getApplicationContext(),
				"updateResultsInUi processRequest finished", Toast.LENGTH_SHORT)
				.show();
				*/
		Log.d("updateResultsInUi"," processRequest finished");
		// Back in the UI thread -- update our UI elements based on the data in
		// mResults
		// [ . . . ]
		hscrollView5.invalidate();
	}

	private void updateMediaInUi() {
		
		/*Toast.makeText(
				getApplicationContext(),
				" updateMediaInUivAdvanced Dowload en Thread processRequest finished",
				Toast.LENGTH_SHORT).show();
		*/
		Log.d("updateMediaInUi"," processRequest finished");
		// Back in the UI thread -- update our UI elements based on the data in
		// mResults
		// [ . . . ]
	}

	
	
	
	
	String languagePref = Locale.getDefault().getDisplayLanguage();// Locale.FRENCH.toString();
  String[] historyList={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	
  	// UI
	LinearLayout main, scrollLayout, scrollLayout2, hscrollLayout1,
			hscrollLayout2, hscrollLayout0, hscrollLayout5, videoLayout;
	ScrollView scrollView, scrollView2;
	HorizontalScrollView hscrollView1, hscrollView2, hscrollView0,
			hscrollView5;
	View tempView;// Not a good name for a declaration here
	TextView valueTV;
	
	// Web
	String lastLinkInside;// LastLink in the last html page

	// used to resend the request for refresh or diff test
	String lastRequest;// last request is thingYouSaid at last run (last
						 // clickOn)
	
	static String lastOnVideoLongClick;
	protected static final int REQUEST_OK = 1;

	Boolean SLVideoActivated = false;
	Boolean SWSpellingActivated = false;
	Boolean SLSpellingActivated = false;
	Boolean SecurityActivated = false;
	Boolean GoogleActivated = true;

	
	
	Boolean bWebActivated = true;
	Boolean SafeSearchActivated=true;
	Boolean ListenActivated=false;
	
	
	Boolean AutoHideActivated = true;
	Boolean AutoScrollActivated = true;
	Boolean VibratorActivated = true;
	int imageSizePref;
	
	// Image&Video tool
	String[] signLanguageVideo;// just the name of the video .mp4 found in
								// /videoFolder
	int[][] imageList;// the image lists
	int signLanguageVideoCounter = 0;
	// final String[]
	// wordsYouSaid;//={"","","","","","","","","","","","","","","","","","","","","","","","",""};
	Bundle bundle;
	// bundle=this.;
	// bundle=this.getBundle();
	Boolean needDownload = false;
	int count = 0;
	String lastOnMediaLongClick = null;
	String[] userFoundList={"","","","","","","","","","","","","","","","","","","","","","","","",""};
	
	/**
* Look up the default recognizer service in the preferences.
* If the default have not been set then set the first available
* recognizer as the default. If no recognizer is installed then
* return null.
*/

	/*
private ComponentName getServiceComponent() {
String pkg = mPrefs.getString(getString(R.string.keyService), null);
String cls = mPrefs.getString(getString(R.string.prefRecognizerServiceCls), null);
if (pkg == null || cls == null) {
List<ResolveInfo> services = getPackageManager().queryIntentServices(
new Intent(RecognitionService.SERVICE_INTERFACE),0);
if (services.isEmpty()) {
return null;
}
ResolveInfo ri = services.iterator().next();
pkg = ri.serviceInfo.packageName;
cls = ri.serviceInfo.name;
SharedPreferences.Editor editor = mPrefs.edit();
editor.putString(getString(R.string.keyService), pkg);
editor.putString(getString(R.string.prefRecognizerServiceCls), cls);
editor.commit();
}
return new ComponentName(pkg, cls);
}
*/

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// ToDdo implements save state//
		// On create run on start and screen orientation change
		Log.i("onCreate "," "+savedInstanceState);
		blueTooth("");
		
		vibrate(100);
		 // Vibrate for 500 milliseconds
		 //v.vibrate(500);
		readSharedPref("lastRequest");
		//writeSharedPref(""); 
		readSharedPref("lastRequest");
		lastRequest=readSharedPref("lastRequest");
		/*Boolean SLVideoActivated = false;
		Boolean SWSpellingActivated = false;
		Boolean SLSpellingActivated = false;
		Boolean SecurityActivated = false;
		Boolean GoogleActivated = true;
		
	
		Boolean bWebActivated = true;
		Boolean SafeSearchActivated=true;
		
		
		Boolean AutoHideActivated = true;
		Boolean AutoScrollActivated = true;
		Boolean VibratorActivated = true;
		*/
		SLVideoActivated=readSharedPrefBoolean("SLVideoActivated");
		SWSpellingActivated = readSharedPrefBoolean("SWSpellingActivated");
		SLSpellingActivated = readSharedPrefBoolean("SLSpellingActivated");
		SecurityActivated = readSharedPrefBoolean("SecurityActivated");
		GoogleActivated = readSharedPrefBoolean("GoogleActivated",true);
		ListenActivated= readSharedPrefBoolean("ListenActivated",ListenActivated);
	
		 bWebActivated = readSharedPrefBoolean("bWebActivated",bWebActivated);
		 SafeSearchActivated=readSharedPrefBoolean("SafeSearchActivated",SafeSearchActivated);
		
		
		 AutoHideActivated = readSharedPrefBoolean("AutoHideActivated");
		 AutoScrollActivated = readSharedPrefBoolean("AutoScrollActivated");
		 VibratorActivated = readSharedPrefBoolean("VibratorActivated");
		 imageSizePref= readSharedPrefInt("imageSizePref");
		
		
		
		 
		super.onCreate(savedInstanceState);
		// prepare the View
		setContentView(R.layout.activity_main);

		// add Listeners to UI
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button2).setOnLongClickListener(this);
		//findViewById(R.id.toggleButton1).setOnClickListener(this);
		
		//trying to make a continous speech listener But crashes on SamsungS3 mini and works on klipad
		
		//sr = SpeechRecognizer.createSpeechRecognizer(this);       
       // sr.setRecognitionListener(new SpeechListener());      
		
		
		
		 // Continuous listening throught Speech Recognizer needs RECORD_AUDIO permissions
	     //<uses-permission android:name="android.permission.RECORD_AUDIO" />
		
        //SpeechRecognizer     speechRecognizer;
       if (ListenActivated){
		speechRecognizer = SpeechRecognizer.createSpeechRecognizer(getBaseContext());
        MyRecognitionListener speechListener=new MyRecognitionListener();
        speechRecognizer.setRecognitionListener(speechListener);
        //Removed to avoid crash but not Started so nothing could happen
        //
        //speechRecognizer.startListening(RecognizerIntent.getVoiceDetailsIntent(getApplicationContext()));
        speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
        Log.i("speechRecognizer"," "+        		SpeechRecognizer.isRecognitionAvailable(getBaseContext())
        		);
       }
		/*
		//CompospeechRecognizernentName serviceComponent = getServiceComponent();
		//if (serviceComponent == null) {
		//toast(getString(R.string.errorNoDefaultRecognizer));
		////TODO: goToStore();
		//} else {
		Log.i("Starting service: " + serviceComponent);
		mSr = SpeechRecognizer.createSpeechRecognizer(this, serviceComponent);
		if (mSr == null) {
		toast(getString(R.string.errorNoDefaultRecognizer));
		} else {
		setUpRecognizerGui(mSr);
		}
		}
		*/
		
		
		
		valueTV= new TextView(this);
		  View linearLayout =  (LinearLayout) findViewById(R.id.videoLayout);
		 ((LinearLayout) linearLayout).addView(valueTV);
		  
		// this.getBaseContext().getSystemService(DOWNLOAD_SERVICE);
		// this.getBaseContext().grantUriPermission(toPackage, uri, modeFlags)

		if (savedInstanceState != null)
			if(debug>1)Toast.makeText(
					getApplicationContext(),
					"SavedInstanceState not Null OnCreate: AppStarted "
							+ savedInstanceState.toString()
							+ "Download service "
							+ this.getBaseContext().getSystemService(
									DOWNLOAD_SERVICE), Toast.LENGTH_SHORT)
					.show();

		else
			if(debug>1)Toast.makeText(
					getApplicationContext(),
					"!!!!!!!SavedInstanceState is Null OnCreate: AppStarted "
							+ this.toString()
							+ "Download service "
							+ this.getBaseContext().getSystemService(
									DOWNLOAD_SERVICE), Toast.LENGTH_SHORT)
					.show();//
		if(debug>1)Toast.makeText(getApplicationContext(),
				"press on mic button and talk, scroll down to access options",
				Toast.LENGTH_LONG).show();

		// adding all the layouts
		// setContentView(R.layout.activity_main);
		main = (LinearLayout) findViewById(R.id.main);
		scrollView = (ScrollView) findViewById(R.id.scrollView1);
		scrollLayout = (LinearLayout) findViewById(R.id.scrollLayout);
		
		
		videoLayout =(LinearLayout) findViewById(R.id.videoLayout);
		
		
		
		scrollView2 = (ScrollView) findViewById(R.id.scrollView2);
		scrollLayout2 = (LinearLayout) findViewById(R.id.scrollLayout2);

		
		
		
		// hscrollView0=(HorizontalScrollView)findViewById(R.id.horizontalScrollView0);
		// hscrollLayout0= (LinearLayout) findViewById(R.id.hscrollLayout0);

		// used for SWSpelling
		hscrollView1 = (HorizontalScrollView) findViewById(R.id.horizontalScrollView1);
		
	
			
		hscrollLayout1 = (LinearLayout) findViewById(R.id.hscrollLayout1);			
		/*if (SWSpellingActivated)hscrollLayout1.setVisibility(View.VISIBLE);
		else hscrollLayout1.setVisibility(View.GONE);*/
			
			
			

		// used For Security List
		hscrollView2 = (HorizontalScrollView) findViewById(R.id.horizontalScrollView2);
		hscrollLayout2 = (LinearLayout) findViewById(R.id.hscrollLayout2);
		
		/*if (SecurityActivated)hscrollLayout2.setVisibility(View.VISIBLE);
		else hscrollLayout2.setVisibility(View.VISIBLE);*/
			

		

		// used For Google Image
		hscrollLayout5 = (LinearLayout) findViewById(R.id.hscrollLayout5);
		hscrollView5 = (HorizontalScrollView) findViewById(R.id.horizontalScrollView5);
		
		processRequest("");//Ateraction Vesperanto Hexasense project");
		if (SLVideoActivated)videoLayout.setVisibility(View.VISIBLE);
		else videoLayout.setVisibility(View.GONE);
		if (SWSpellingActivated)hscrollView1.setVisibility(View.VISIBLE);
		else hscrollView1.setVisibility(View.GONE);
		if (SecurityActivated)hscrollView2.setVisibility(View.VISIBLE);
		else hscrollView2.setVisibility(View.GONE);
		if (GoogleActivated)hscrollView5.setVisibility(View.VISIBLE);
		else hscrollView5.setVisibility(View.GONE);	
		//if (GoogleActivated)hscrollLayout5.setVisibility(View.VISIBLE);
			

		// Not really used for compatibility but really powerfull
		GridView gridview = (GridView) findViewById(R.id.gridView1);
		// gridview.setAdapter(new ImageAdapter(this));
		if (lastRequest!=null)processRequest(lastRequest);
	}
	


	private Intent createRecognizerIntent(String phrase, String lang) {
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getApplicationContext().getPackageName());
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
		intent.putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true);
		// We let the recognizer know what the user was instructed to say.
		intent.putExtra(RecognizerIntent.EXTRA_PROMPT, phrase);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, lang);
		//if (mPrefs.getBoolean(getString(R.string.keyMaxOneResult), mRes.getBoolean(R.bool.defaultMaxOneResult))) {
		intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);
		//}
		return intent;
		}
	@Override
	public boolean onLongClick(View v) {
		
		((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.BLUE);
		speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
			return true;
	}
	@Override
	public void onClick(View v) {
		// super.o(v);
		// Toast.makeText(getApplicationContext(),"click", Toast.LENGTH_SHORT
		// ).show();

		// this.getActionBar().setDisplayUseLogoEnabled(false);
		// this.getActionBar().setHomeButtonEnabled(true);//API14
		/*
		 * ProgressDialog progressBar;
		 * 
		 * // prepare for a progress bar dialog progressBar = new
		 * ProgressDialog(v.getContext()); progressBar.setCancelable(true);
		 * progressBar.setMessage("File downloading ...");
		 * progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		 * progressBar.setProgress(0); progressBar.setMax(100);
		 * progressBar.show();-*
		 * 
		 * //reset progress bar status /*progressBar.setProgress(75);//Status =
		 * 75; progressBar.getActionBar().setDisplayShowTitleEnabled(true);
		 * progressBar.dismiss();
		 */
		((ImageButton)findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(android.R.color.background_dark));//(int)android.R.color.background_dark);//Color.LTGRAY);
		//((ImageButton)findViewById(R.id.button2)).setBackgroundResource(android.R.drawable.stat_notify_call_mute);//ic_.ic_btn_speak_now);
		//((ImageButton)findViewById(R.id.button2)).setImageDrawable((Drawable)android.R.drawable.stat_notify_call_mute);//ic_.ic_btn_speak_now);
		((ImageButton)findViewById(R.id.button2)).setImageResource(android.R.drawable.stat_notify_call_mute);//ic_.ic_btn_speak_now);
		((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.LTGRAY);
		//((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.LTGRAY);
/*presence_away 	presence_busy
presence_busy
presence_invisible
presence_invisible 	presence_offline
presence_offline 	presence_online
presence_online*/
		
		valueTV.setText(" ");
		tempView = new View(v.getContext());

		// voiceIntent = new
		// Intent(RecognizerIntent.ACTION_VOICE_SEARCH_HANDS_FREE);
		// voiceIntent.putExtra(RecognizerIntent.EXTRA_SECURE, isLocked &&
		// mKeyguardManager.isKeyguardSecure());
		//android.speech.RecognizerIntent
		//android.speech.RecognitionListener;
		//android.speech.RecognitionService.
		Intent i = (new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH){	});
		
		
		/*
	     //trying continous speak but crash
		
		Intent intentRecognizer = createRecognizerIntent("parlez", "fr");
		
		
		
		
		
		//Intent intentRecognizer = i;//RecognizerIntent("phrase", "fr");
		
		final Handler handler = new Handler();
	    final SpeechRecognizer sr;
		 
	    
		 sr=SpeechRecognizer.createSpeechRecognizer (this.getApplicationContext() );
		 final Runnable stopListening = new Runnable() {
			 @Override
			 public void run() {
			 sr.stopListening();
			 }
			 };
		// RecognitionListener rl;
		 
		 sr.setRecognitionListener(new RecognitionListener() {
			 @Override
			 public void onBeginningOfSpeech() {
			 Log.i("SpeechRecognizer","onBeginningOfSpeech");
			// mState = State.LISTENING;
			 }
			 @Override
			 public void onBufferReceived(byte[] buffer) {
			 //Log.i("onBufferReceived: " + buffer.length);
			 // TODO maybe show buffer waveform
			 }
			 @Override
			 public void onEndOfSpeech() {
			// mState = State.TRANSCRIBING;
			 handler.removeCallbacks(stopListening);
			// mButtonMicrophone.setState(mState);
			// if (mAudioCue != null) {
			 //mAudioCue.playStopSound();
			 //}
			 }
			 @Override
			 public void onError(int error) {
			// mState = State.ERROR;
				 Log.e("VoiceSearch", "results"+error);
			 handler.removeCallbacks(stopListening);
			// mButtonMicrophone.setState(mState);
			 //if (mAudioCue != null) {
			 //mAudioCue.playErrorSound();
			 //}
			 switch (error) {
			 case SpeechRecognizer.ERROR_AUDIO:
			// setErrorMessage(R.string.errorResultAudioError);
			 break;
			 case SpeechRecognizer.ERROR_CLIENT:
			// setErrorMessage(R.string.errorResultClientError);
			 break;
			 case SpeechRecognizer.ERROR_NETWORK:
			// setErrorMessage(R.string.errorResultNetworkError);
			 break;
			 case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
			// setErrorMessage(R.string.errorResultNetworkError);
			 break;
			 case SpeechRecognizer.ERROR_SERVER:
			 //setErrorMessage(R.string.errorResultServerError);
			 break;
			 case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
			 //setErrorMessage(R.string.errorResultServerError);
			 break;
			 case SpeechRecognizer.ERROR_NO_MATCH:
			 //setErrorMessage(R.string.errorResultNoMatch);
			 break;
			 case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
			 //setErrorMessage(R.string.errorResultNoMatch);
			 break;
			 case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
			 // This is programmer error.
			 break;
			 default:
			 break;
			 }
			 }
			 @Override
			 public void onEvent(int eventType, Bundle params) {
			 Log.i("SpeechRecognizer","onEvent: " + eventType + " " + params);
			 // TODO: no recognizer service seems to call this
			 }
			 @Override
			 public void onPartialResults(Bundle partialResults) {
			 // This is supported (only?) by Google Voice Search.
			 // The following is Google-specific.
			 Log.i("SpeechRecognizer","onPartialResults: keySet: " + partialResults.keySet());
			 String[] results = partialResults.getStringArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS");
			 //double[] resultsConfidence = partialResults.getDoubleArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS_CONFIDENCE");
			 if (results != null) {
			 //setPartialResult(results);
				 Log.e("VoiceSaerch", "results"+results);
			 }
			 }
			 @Override
			 public void onReadyForSpeech(Bundle params) {
			// mState = State.RECORDING;
			 //mButtonMicrophone.setState(mState);
			 handler.postDelayed(stopListening,5000);// LISTENING_TIMEOUT);
			 }
			 @Override
			 public void onResults(Bundle results) {
			 handler.removeCallbacks(stopListening);
			 ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
			 //mState = State.INIT;
			// mButtonMicrophone.setState(mState);
			 if (matches.isEmpty()) {
			 //toast("ERROR: No results"); // TODO
			 } else {
			 // TODO: we just take the first result for the time being
			 // TODO: confidence scores support is in API 14
			 String result = matches.iterator().next();
			// int dist = Utils.phraseDistance(mPhrase, result);
			 //setUiResult(mLang, result, dist);
			 //if (isStorePhrase) {addEntry(mPhrase, mLang, dist, result); }
			 }
			 }
			 @Override
			 public void onRmsChanged(float rmsdB) {
				// if (rmsdB!=oldRmsdB)
					 Log.d("leapkh", "onRmsChanged"+rmsdB);//oldRmsdB=rmsdB; 
			// mButtonMicrophone.setVolumeLevel(rmsdB);
			 }
			 });
			 //sr.startListening(intentRecognizer);
			 sr.startListening(	 intentRecognizer);
			 
			 
			 
			 
			 startActivityForResult(intentRecognizer, REQUEST_OK);
			 */
		
		/*{
		@Override
			public void onPartialResults(Bundle partialResults) {
			// This is supported (only?) by Google Voice Search.
			// The following is Google-specific.
			Log.i("onPartialResults: keySet: " , partialResults.keySet().toString());
			String[] results = partialResults.getStringArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS");
			//double[] resultsConfidence = partialResults.getDoubleArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS_CONFIDENCE");
			if (results != null) {
				Log.i("onPartialResults: keySet: " , results.toString());
				
				//setPartialResult(results);
			}
			}
		}*/
		
																		// Mode
																		// Ok //
																		// (Samsung
																		// Powered
																		// by
																		// VLingo,Google,SampleRecognizer);
		// Intent i = new
		// Intent(RecognizerIntent.ACTION_VOICE_SEARCH_HANDS_FREE);//(depend of
		// users system like samsung SVoice)

		// String languagePref = "fr";//or, whatever iso code...
		// String languagePref = Locale.US.toString();
		// String languagePref = Locale.FRENCH.toString();
		languagePref = Locale.getDefault().getDisplayLanguage();
		
		//i.putExtra(RecognizerIntent.EXTRA_ORIGIN, "SpeakNow");//API 14 used for website origin
		i.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);//1to 3 results is a good choice for normal use, but could use more (e.g. image mix) 
		
		//Specific to gGoogle Voice Recognition		
		i.putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true);//return  realTime Analysis
		//I put Extra doesn 
		//public void onPartialResults(Bundle partialResults) {
		//	    String[] results = 
		//	      partialResults.getStringArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS");
		//	    updateTheUi(results);
		//	  }
		
		
		
		i.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS, 9000L );//return  realTime Analysis
		//EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS  API8
		//The amount of time that it should take after we stop hearing speech to consider the input complete.
		//Note that it is extremely rare you'd want to specify this value in an intent.
		
		//If you don't have a very good reason to change these, you should leave them as they are.
		
		//Note also that certain values may cause undesired or unexpected results - use judiciously!
		
		//Additionally, depending on the recognizer implementation, these values may have no effect. 
		//no effect on my two distributions
		
		i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, languagePref);
		i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, languagePref);
		// Only user langage and no other interpretations...
		i.putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE,
				languagePref);
		// OK Language is set for User

		// need LANGUAGE_MODEL_FREE_FORM to enter a free text
		i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
				RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
		// .LANGUAGE_MODEL_WEB_SEARCH);

		// i.putExtra(RecognizerIntent.ACTION_VOICE_SEARCH_HANDS_FREE,"please talk");
		// min API level 16

		// Custom Extra Prompt
		i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak now: " + languagePref);

		// i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en_US");
		// i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
		// Locale.US.toString());
		try {
			startActivityForResult(i, REQUEST_OK);//normal Mode
			
		} catch (Exception e) {
			Toast.makeText(this, "startActivityForResult error .",
					Toast.LENGTH_SHORT).show();
		}
		// this.addViews(v);

		// Array2DExemple myArray2dExemple=new Array2DExemple();
		// Toast.makeText(this, "onClick on view "+v +"recognizer" +i.getType()+
		// INPUT_METHOD_SERVICE.toString(), Toast.LENGTH_SHORT).show();

		// Toast.makeText(getApplicationContext(),"press on mic button and talk, scroll down to access options",
		// Toast.LENGTH_LONG ).show();

	}

	
	
	
	
	
	public void onContentChanged() {
		// Toast.makeText(this, "ContentChanged",Toast.LENGTH_SHORT).show();
		Log.v("onContentChanged", " NOP");
	}

	// /////////////////////////////////////////////////////////////
	// AutoScroll part...
	TimerTask scrollerSchedule;
	Timer scrollTimer;
	int scrollPos;
	int scrollMax;
	Runnable Timer_Tick;

	public void stopAutoScrolling(final HorizontalScrollView HSView) {
		scrollTimer.cancel();
		
		
	}
	public void startAutoScrolling(final HorizontalScrollView HSView) {
		lastScrollPos = -1;
		endScroll = -1;
		if (scrollTimer == null) {
			int scrollPos = 0;
			scrollTimer = new Timer();
			Timer_Tick = new Runnable() {
				public void run() {
					// hscrollView1.scrollTo(posMax, 0);
					// hscrollView1.fling(1);

					moveScrollView(HSView, hscrollView2);
				}
			};

			if (scrollerSchedule != null) {
				scrollerSchedule.cancel();
				scrollerSchedule = null;
			}

			scrollerSchedule = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(Timer_Tick);

				}
			};

			scrollTimer.schedule(scrollerSchedule, 2000, 20);//
		}
	}

	int lastScrollPos;
	double scrollStep = 1.0;
	int endScroll = -1;

	public void moveScrollView(final HorizontalScrollView HSView,
			HorizontalScrollView slaveView) {
		boolean log =false;
		
		scrollPos = (int) (HSView.getScrollX() + scrollStep);
		// HSView.setMeasureAllChildren(true);
		// int actualWidth = (hscrollView1.getMeasuredWidth());
		// scrollMax = actualWidth;

		// hscrollView1
		// Toast.makeText(this,"actualWidth"+actualWidth
		// +hscrollView1.getHorizontalFadingEdgeLength()+" scrollPos"+scrollPos+" maxScrollAmount "+hscrollView1.getMaxScrollAmount(),
		// Toast.LENGTH_SHORT ).show();//hscrollView1.getMaxScrollAmount();
		// if(scrollPos >= scrollMax){
		if (log)Log.d("UI-AutoScrollView ", " lastScrollPos=" + lastScrollPos
				+ " scrollPos" + scrollPos + " endScroll" + endScroll);

		// if (scrollPos==0)scrollStep=1;

		if (endScroll != -1) {
			endScroll += 1;
			if (scrollPos + 60 < endScroll) {
				if (scrollPos + 260 < endScroll) {

					scrollPos = 0;
					lastScrollPos = -1;

					if (log)Log.d("UI-AutoScrollView ", "scrollPos+100==endScroll"
							+ "scrollPos" + scrollPos + "lastScrollPos="
							+ lastScrollPos + " endScroll" + endScroll);
					scrollStep = 1.0;
					endScroll = -1;
					// HSView.scrollTo(scrollPos, 0);
				} else {

					if (log)Log.d("UI-AutoScrollView ", "scrollPos+50==endScroll"
							+ "scrollPos" + scrollPos + "lastScrollPos="
							+ lastScrollPos + " endScroll" + endScroll);
					scrollStep = 0;
					// lastScrollPos=-1;
					HSView.scrollTo(0, 0);
				}
			}

		} else {

			if (scrollPos == lastScrollPos) {
				scrollStep = 0;
				lastScrollPos = scrollPos + 1;
				endScroll = scrollPos;

				if (log)Log.d("UI-AutoScrollView ", "scrollPos == lastScrollPos"
						+ scrollPos + "lastScrollPos=" + lastScrollPos
						+ " endScroll" + endScroll);

				// HSView.scrollTo(scrollPos, 0);
				// scrollTimer.schedule(scrollerSchedule, 30, 10);
				// scrollTimer.purge();
				// scrollTimer.schedule(scrollerSchedule, 30, 10);
				// scrollTimer.cancel();
				// scrollTimer.cancel();//not reusable after
				// scrollTimer=null;
				// scrollerSchedule=null;
				// scrollTimer.schedule(scrollerSchedule, 200, 10);
				// scrollTimer.
				// scrollTimer=new Timer();
				// scrollTimer.cancel();
				// scrollTimer.schedule(scrollerSchedule, 200, 10);
				// startAutoScrolling(HSView);
			} else {
				if (scrollPos > 20)
					scrollStep = 2.0;

				if (log)Log.d("UI-AutoScrollView ", "scrollPos>20   " + scrollPos
						+ "lastScrollPos=" + lastScrollPos + " endScroll"
						+ endScroll);
				lastScrollPos = scrollPos;
				HSView.scrollTo(scrollPos, 0);
			}
			slaveView.scrollTo(scrollPos, 0);
			hscrollView5.scrollTo(scrollPos, 0);

		}

	}

	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);

		// View namebar = view.findViewById(R.id.namebar);
		// ((LinearLayout)namebar.getParent()).removeView(namebar);

		// this.onMenuItemSelected(featureId, item); onContextMenuClosed(menu)
		if(debug>1)Toast.makeText(
				this,
				"menu:" + "item.getMenuInfo().toString()" + " select  "
						+ item.toString(), Toast.LENGTH_SHORT).show();
		// switch (item.toString()){} //not working for1.6 need 1.7 and KitKat
		if (item.toString() == "English")
			languagePref = Locale.US.toString();// Locale.getDefault().getDisplayLanguage();//Locale.FRENCH.toString();
		if (item.toString() == "Français")
			languagePref = Locale.FRENCH.toString();// Locale.getDefault().getDisplayLanguage();//Locale.FRENCH.toString();
		if (item.toString() == "UserLanguage")
			languagePref = Locale.getDefault().getDisplayLanguage();// Locale.FRENCH.toString();
		// Locale.getDefault().getDisplayLanguage();

		if (item.toString() == "ScrollR")
			hscrollView1.fling(150);// velocityX);// ;
		if (item.toString() == "Espagnol")
			((LinearLayout) mVideoView.getParent()).removeView(mVideoView);// if
		
		if (item.toString() == "Change"){
			// View v;
		  // v=this.getCurrentFocus();
		   File file;

			/*file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ v.getContentDescription()
					+ ".jpg");
			*/

			file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ lastOnMediaLongClick
					+ ".jpg");

			showFileChooser();
			//lastOnMediaLongClick = v
					//.getContentDescription().toString();//((LinearLayout) mVideoView.getParent()).removeView(mVideoView);// if
		}
		if (item.toString() == "ChangeVideo"){
			// View v;
		  // v=this.getCurrentFocus();
		   File file;

			/*file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ v.getContentDescription()
					+ ".jpg");
			*/

			file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ lastOnVideoLongClick
					+"video"
					+ ".mp4");

			showVideoFileChooser();
			//lastOnMediaLongClick = v
					//.getContentDescription().toString();//((LinearLayout) mVideoView.getParent()).removeView(mVideoView);// if
		}
		
		
		
		
		 /* menu.add(0, v.getId(), 20, "Change");
		  menu.add(0, v.getId(), 21, "TakePhoto");
		  menu.add(0, v.getId(), 22, "Hide");
		  menu.add(0, v.getId(), 23, "AutoScroll");
		  menu.add(0, v.getId(), 24, "ReloadImage");
		  menu.add(0, v.getId(), 25, "NormalSize");*/
		if (item.toString() == "Hide"){
			
				
				(findViewById(R.id.horizontalScrollView5)).setVisibility(View.GONE);
				
				//if (mVideoView.getVisibility() == View.GONE){
				/*	findViewById(R.id.videoLayout).setVisibility(View.VISIBLE);
					SLVideoActivated=true;}
				else{
					findViewById(R.id.videoLayout).setVisibility(View.GONE);
					SLVideoActivated=false;
				}*/	
				
			
			
		}
		if (item.toString() == "ReloadImage"){
		
			File file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense/fr"
					+ File.separator
					+ lastOnMediaLongClick
					+ ".jpg");
			if (!file.exists()){
				/* path = Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense" + File.separator
						+"video"+ File.separator
						 + File.separator
						+ lastOnMediaLongClick + ".mp4";*/
				 file=new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense/"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				 }
			
		 // Erase the old File and reload it
		  if  (file.exists())file.delete();
		  processRequest(lastRequest);			
		}
		
		if (item.toString() == "ReloadVideo"){
			File file = new File(lastOnVideoLongClick);/*Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ "video"
						+ File.separator
						+ lastOnVideoLongClick
						+ ".mp4");*/
			
			 // Erase the old File and reload it
			  if  (file.exists())file.delete();
			  processRequest(lastRequest);			
			}
		
		if (item.toString() == "HideVideo"){
			(findViewById(R.id.videoLayout)).setVisibility(View.GONE);
			SLVideoActivated=false;
			writeSharedPrefBool("SLVideoActivated",SLVideoActivated);
		}	
		
		if (item.toString() == "debug"){
			//to handle API2.0 to 4
			//1 use V7support ActionBar could be replaced by action bar Sherlock
			//2 Or fir API3.0to4 use GoogleActionBar
			ActionBar actionBar = getActionBar();
			actionBar.setSubtitle("mytest");
			actionBar.setTitle("ateraction"); 
			//actionBar.show();
			/*Tab tab=new Tab();
			actionBar.
			actionBar.addTab( tab);
			actionBar.hide();
			*/
			
			
			
			debug=1;
			//writeSharedPrefBool("debug",debug);
			
		}
		
		if (item.toString() == "ValidateVideo"){
			 File file;
			 
				// AlertDialog.Builder alertDialogBuilder;
				// alertDialogBuilder=new AlertDialog.Builder(MainActivity.);
				// alertDialogBuilder.show();
				// AlertDialog alertDialog;
				 
				// alertDialog.show();
				 //alertDialog=new AlertDialog();
				 
					/*file = new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ v.getContentDescription()
							+ ".jpg");
					*/

				 Log.d("validate Video",Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense/video"
							+ File.separator
							+ lastOnVideoLongClick //+lastOnMediaLongClick
							+ ".mp4");
				 
					file = new File( lastOnVideoLongClick );
						/*	Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense/video"
							+ File.separator
							+lastOnMediaLongClick
							+ ".mp4");*/
				
					String videoName =file.getName().substring(0, file.getName().length()-4);
				 // Erase the old File and make a photo to replace it
				  if  (file.exists()){
					  File validationPath=new File(Environment
								.getExternalStorageDirectory()
								+ File.separator
								+ "hexasense/video"
								+ File.separator
								+ "fr"
								);
					  if (!validationPath.isDirectory())validationPath.mkdirs();
					  
					  
					  
					 File newPath=new File(Environment
								.getExternalStorageDirectory()
								+ File.separator
								+ "hexasense/video"
								+ File.separator
								+ "fr"
								+ File.separator
								+ videoName//lastOnVideoLongClick
								+ ".mp4");
					  
					  if (file.renameTo(newPath)) file.delete();
					 
				  
				  
				  
				  }
				  
				 /* getPhoto(Environment
				  .getExternalStorageDirectory() +
				  File.separator + "hexasense" +
				  File.separator
				  +lastOnMediaLongClick+".jpg");*/
				  			 
				  if(debug>1)Toast.makeText(getApplicationContext(),
				 "Long click on Video:For Validation "
				  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
				 Toast.LENGTH_SHORT).show();
				 
				
		}
		if (item.toString() == "Validate"){
			 File file;
			 
				// AlertDialog.Builder alertDialogBuilder;
				// alertDialogBuilder=new AlertDialog.Builder(MainActivity.);
				// alertDialogBuilder.show();
				// AlertDialog alertDialog;
				 
				// alertDialog.show();
				 //alertDialog=new AlertDialog();
				 
					/*file = new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ v.getContentDescription()
							+ ".jpg");
					*/

				 Log.d("validate Picture",Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				 
					file = new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				
				 // Erase the old File and make a photo to replace it
				  if  (file.exists()){
					  File validationPath=new File(Environment
								.getExternalStorageDirectory()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+ "fr"
								);
					  if (!validationPath.isDirectory())validationPath.mkdirs();
					  
					 File newPath=new File(Environment
								.getExternalStorageDirectory()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+ "fr"
								+ File.separator
								+ lastOnMediaLongClick
								+ ".jpg");
					  
					  if (file.renameTo(newPath)) file.delete();
					 
				  
				  
				  
				  }
				  
				 /* getPhoto(Environment
				  .getExternalStorageDirectory() +
				  File.separator + "hexasense" +
				  File.separator
				  +lastOnMediaLongClick+".jpg");*/
				  			 
				  if(debug>1)Toast.makeText(getApplicationContext(),
				 "Long click on Image:For Validation "
				  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
				 Toast.LENGTH_SHORT).show();
				 
				
		}
		
		if (item.toString() == "TakePhoto"){
			 File file;
			 
			// AlertDialog.Builder alertDialogBuilder;
			// alertDialogBuilder=new AlertDialog.Builder(MainActivity.);
			// alertDialogBuilder.show();
			// AlertDialog alertDialog;
			 
			// alertDialog.show();
			 //alertDialog=new AlertDialog();
			 
				/*file = new File(Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ v.getContentDescription()
						+ ".jpg");
				*/

			 Log.d("takingPicture",Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ lastOnMediaLongClick
						+ ".jpg");
			 
				file = new File(Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ lastOnMediaLongClick
						+ ".jpg");
			
			 // Erase the old File and make a photo to replace it
			  if  (file.exists())file.delete();
			  
			  getPhoto(Environment
			  .getExternalStorageDirectory() +
			  File.separator + "hexasense" +
			  File.separator
			  +lastOnMediaLongClick+".jpg");
			  			 
			  if(debug>1)Toast.makeText(getApplicationContext(),
			 "Long click on Image: "
			  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
			 Toast.LENGTH_SHORT).show();
			 
			
		}
		if (item.toString() == "MakeVideo"){
			 File file;
			 
			// AlertDialog.Builder alertDialogBuilder;
			// alertDialogBuilder=new AlertDialog.Builder(MainActivity.);
			// alertDialogBuilder.show();
			// AlertDialog alertDialog;
			 
			// alertDialog.show();
			 //alertDialog=new AlertDialog();
			 
				/*file = new File(Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ v.getContentDescription()
						+ ".jpg");
				*/
			// lastOnVideoLongClick="bonjour";
			 Log.d("makingVideo",lastOnVideoLongClick.toString());/*Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ "video"
						+ File.separator
						+ lastOnVideoLongClick
						+ ".mp4");
						*/
			 
				file = new File(lastOnVideoLongClick.toString());/*Environment
						.getExternalStorageDirectory()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+ "video"
						+ File.separator
						+ lastOnVideoLongClick
						+ ".mp4");
						*/
			
			 // Erase the old File and make a photo to replace it
			  if  (file.exists())file.delete();
			  ListenActivated=false;
			  writeSharedPrefBool("ListenActivated",ListenActivated);
				//((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.BLUE);
				//speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
				((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.GRAY);
				speechRecognizer.stopListening();//createRecognizerIntent("fr", "fr"));
				speechRecognizer.cancel();
				//speechRecognizer.destroy();
				
			  getVideo(lastOnVideoLongClick.toString());/*Environment
			  .getExternalStorageDirectory() +
			  File.separator + "hexasense" +
			  File.separator+"video"+File.separator
			  +lastOnVideoLongClick+".mp4");
			  */
			  			 
			  if(debug>1)Toast.makeText(getApplicationContext(),
			 "Long click on Video: "
			  +lastOnVideoLongClick+"    toString "+lastOnVideoLongClick,
			 Toast.LENGTH_SHORT).show();
			 
			
		}
		

		
		
		//sdg
		// (hscrollView2.getVisibility()==0)hscrollView2.setVisibility(4);else
																			// hscrollView2.setVisibility(0);
		if (item.toString() == "SL-Video")
			((LinearLayout) mVideoView.getParent()).addView(mVideoView);

		// flag//mVideoView.setEnabled(!mVideoView.isEnabled());//i
		// (mVideoView.isEnabled()==true)mVideoView.setEnabled(false);else//.setAlpha((float)
		// 0.5);//hscrollView0.setVisibility(4);else
		// hscrollView0.setVisibility(0);

		if (item.toString() == "Esperanto")
			if (mVideoView.getVisibility() == View.GONE)
				mVideoView.setVisibility(View.VISIBLE);
			else
				mVideoView.setVisibility(View.GONE);

		if (item.toString() == "SLVideoOnOff"){
				
			if((findViewById(R.id.videoLayout)).getVisibility()==View.GONE){
			//if (mVideoView.getVisibility() == View.GONE){
				findViewById(R.id.videoLayout).setVisibility(View.VISIBLE);
				writeSharedPrefBool("SLVideoActivated",SLVideoActivated);
				SLVideoActivated=true;}
			else{
				findViewById(R.id.videoLayout).setVisibility(View.GONE);
				SLVideoActivated=false;
				writeSharedPrefBool("SLVideoActivated",SLVideoActivated);
			}	
			
		}
		 
		// if (item.toString() ==
		// "SL-Video")//((LinearLayout)mVideoView.getParent()).addView(mVideoView);//mVideoView.setEnabled(!mVideoView.isEnabled());//if
		// (mVideoView.isEnabled()==true)mVideoView.setEnabled(false);
		if (item.toString() == "SW-spell"){
			if (hscrollView1.getVisibility() == View.GONE)
				hscrollView1.setVisibility(View.VISIBLE);
			else hscrollView1.setVisibility(View.GONE);
		writeSharedPrefBool("SLVideoActivated",SLVideoActivated);}
		
		
		if (item.toString() == "Google")
			if (hscrollView5.getVisibility() == View.GONE)
				hscrollView5.setVisibility(View.VISIBLE);
			else
				hscrollView5.setVisibility(View.GONE);
		if (item.toString() == "User")
			if (hscrollView2.getVisibility() == View.GONE)
				hscrollView2.setVisibility(View.VISIBLE);
			else
				hscrollView2.setVisibility(View.GONE);
		if (item.toString() == "AutoScroll")
			startAutoScrolling(hscrollView5);// startAutoScrolling(hscrollView1);//if
		if (item.toString() == "StopAutoScroll")
			stopAutoScrolling(hscrollView5);
		
		if (item.toString() == "AutoScrollGoogle")
			startAutoScrolling(hscrollView5);// startAutoScrolling(hscrollView1);//if
												// (hscrollView2.getVisibility()==View.GONE)hscrollView2.setVisibility(View.VISIBLE);else
												// hscrollView2.setVisibility(View.GONE);
		if (item.toString() == "AutoScrollUser")
			startAutoScrolling(hscrollView2);// startAutoScrolling(hscrollView1);//if
												// (hscrollView2.getVisibility()==View.GONE)hscrollView2.setVisibility(View.VISIBLE);else
												// hscrollView2.setVisibility(View.GONE);
		if (item.toString() == "AutoscrollSW-spell")
			startAutoScrolling(hscrollView1);// startAutoScrolling(hscrollView1);//if
												// (hscrollView2.getVisibility()==View.GONE)hscrollView2.setVisibility(View.VISIBLE);else
												// hscrollView2.setVisibility(View.GONE);
		// hscrollView1,hscrollView2,hscrollView0,hscrollView5;

		if (item.toString() == "VideoAlpha")
			if (mVideoView.getAlpha() == (float) 0.5)
				mVideoView.setAlpha((float) 1);
			else
				mVideoView.setAlpha((float) 0.5);
		if (item.toString() == "Blank")
			mVideoView.setBackgroundColor(Color.parseColor("white"));// .getAlpha()==(float)
																		// 0.5)mVideoView.setAlpha((float)
																		// 1);else
																		// mVideoView.setAlpha((float)
																		// 0.5);
		if (item.toString() == "BlankBackground")
			mVideoView
					.setDrawingCacheBackgroundColor(Color.parseColor("white"));
		// .getAlpha()==(float) // 0.5)mVideoView.setAlpha((float) // 1);else//
		// mVideoView.setAlpha((float) // 0.5);
		// mVideoView.getAnimation();
		if (item.toString() == "RotateVideo")
			mVideoView.setRotation(mVideoView.getRotation() + 10);// only view
																	// is moving
																	// cause the
																	// videorender
																	// is locked

		if (item.toString() == "RotateView")
			hscrollView5.setRotation(hscrollView5.getRotation() + 45);// only
																		// view
																		// is
																		// moving
																		// cause
																		// the
																		// videorender
																		// is
																		// locked
		if (item.toString() == "MicroSize") {
			ViewGroup.LayoutParams params = hscrollView5.getLayoutParams();
			// params.width=50;
			params.height = 100;
			imageSizePref=params.height;
			writeSharedPrefInt("imageSizePref",params.height);
			
			hscrollView5.setLayoutParams(params);
		}// hscrollView5.setMinimumHeight(800);hscrollView5.setMinimumWidth(1024);//only
			// view is moving cause the videorender is locked

		if (item.toString() == "FullSize") {
			ViewGroup.LayoutParams params = hscrollView5.getLayoutParams();
			// params.width=300;//LayoutParams.WRAP_CONTENT;
			params.height = 300;
			imageSizePref=params.height;
			writeSharedPrefInt("imageSizePref",params.height);
			hscrollView5.setLayoutParams(params);
			/*
			 * for (int child=0 ;child<hscrollView5.getChildCount();child++){ //
			 * hscrollView5.getChildAt(child)child LayoutParams
			 * childParams=(LayoutParams)
			 * hscrollView5.getChildAt(child).getLayoutParams();
			 * childParams.height=500;
			 * hscrollView5.getChildAt(child).setLayoutParams(childParams); }
			 */

		}// hscrollView5.setMinimumHeight(800);hscrollView5.setMinimumWidth(1024);//only
			// view is moving cause the videorender is locked
		if (item.toString() == "NormalSize") {
			ViewGroup.LayoutParams params = hscrollView5.getLayoutParams();
			// params.width=50;
			params.height = 200;
			imageSizePref=params.height;
			writeSharedPrefInt("imageSizePref",params.height);
			hscrollView5.setLayoutParams(params);
		}// hscrollView5.setMinimumHeight(800);hscrollView5.setMinimumWidth(1024);//only
			// view is moving cause the videorender is locked

		if (item.toString() == "Inject") {
			try {
				processRequest("pierre capdepuy pierre capdepuy pierre capdepuy pierre 	");
				this.setTitle("injection");
			} catch (Exception e) {
				this.setTitle("injection e" + e.toString());
			}
		}
		if (item.toString() == "Reload") {
			try {
				processRequest(lastRequest);
				this.setTitle("Reload");
			} catch (Exception e) {
				this.setTitle("reload error" + e.toString());
			}
		}

		if (item.toString() == "pickContact") {
			pickContact();
		}
		if (item.toString() == "getPhoto") {
			getPhoto("");
		}

		if (item.toString() == "Help"){
			 //((ToggleButton) findViewById(R.id.toggleButton1)).setChecked(SLVideoActivated);
			showHelp();
		}
		if (item.toString() == "SelectViews"){
			 //((ToggleButton) findViewById(R.id.toggleButton1)).setChecked(SLVideoActivated);
			showViews();
		}
		
		if (item.toString() == "SafeSearch"){
			//showAbout();
			SafeSearchActivated= !SafeSearchActivated;
			writeSharedPrefBool("SafeSearchActivated",SafeSearchActivated);
			
			//if (SafeSearchActivated)
			Toast.makeText(this,"SafeSearch: "+SafeSearchActivated, Toast.LENGTH_LONG ).show();
			if (SafeSearchActivated) item.setIcon(android.R.drawable.ic_lock_lock);
			else item.setIcon(android.R.drawable.ic_menu_report_image);
			
			
		}
		if (item.toString() == "Validation"){
			showValidation();
			
				
			
		}
		
		if (item.toString() == "About"){
			showAbout();
			
				if (findViewById(R.id.webView1).getVisibility() == View.GONE)
					findViewById(R.id.webView1).setVisibility(View.VISIBLE);
				else
					findViewById(R.id.webView1).setVisibility(View.GONE);
			
		}
		if (item.toString() == "loadList"){
			//processRequest("bonjour");
			  
			/*Handler handler = new Handler(); 
			    handler.postDelayed(new Runnable() { 
			         public void run() { 
			        	// processRequest("fin");// my_button.setBackgroundResource(R.drawable.defaultcard);
			        	 //chooseList();
			         } 
			    }, 2000);*/
			
			    //processRequest("liste");
			    
			    
			    
			    File file;
				if (true){
				//*Don't* hardcode "/sdcard"
				File sdcard = Environment.getExternalStorageDirectory();
				
				//Get the text file
				
				 file = new File(sdcard+ "/" + "hexasense","wordList");
				if (!file.isDirectory()){
					file.mkdirs();
				}
				
				file = new File(sdcard+ "/" + "hexasense"+"/wordList","EtienneBrunetWordList.txt");
				
				
				if (!file.isFile()){
					raw2SD(R.raw.fr,sdcard+ "/" + "hexasense"+"/wordList"+"/"+"EtienneBrunetWordList.txt");
					
					
					//getResources().openRawResource();
					//  InputStream fis = getResources().openRawResource(this.getBaseContext().getResources().getIdentifier(sonidoActual,"raw", this.getApplicationContext().getPackageName() ));
				}
				
				}
				
			    chooseList();
			    
			
			
			
			
			//processRequest("chargement");
			
		/*	runOnUiThread(new Runnable() { public void run() {
				processRequest("veuillez patienter");
				//loadList();
			} });*/
			
			//this.runOnUiThread(new Thread(){  });
		//loadList();
			//languagePref = Locale.getDefault().getDisplayLanguage();// Locale.FRENCH.toString();
		// Locale.getDefault().getDisplayLanguage();
		}
		return false;
	}

	public void onVideoToggleClicked(View view) {
	    // Is the toggle on?
		//ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
		//((ToggleButton) view).setChecked(SLVideoActivated);
	   
		boolean on = ((ToggleButton) view).isChecked();
	    Log.d("checked------------------------","");
	    if (on) {
	    	SLVideoActivated=true;
	    	findViewById(R.id.videoLayout).setVisibility(View.VISIBLE);
	    	// Enable vibrate
	    } else {
	    	SLVideoActivated=false;
	    	
	    	findViewById(R.id.videoLayout).setVisibility(View.GONE);
	        // Disable vibrate
	    }
	    writeSharedPrefBool("SLVideoActivated",SLVideoActivated);
	}
	
	public void onSWSpellToggleClicked(View view) {
	    // Is the toggle on?
		//ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
		//((ToggleButton) view).setChecked(SLVideoActivated);
	   
		boolean on = ((ToggleButton) view).isChecked();
	    Log.d("checked------------------------","");
	    if (on) {
	    	SWSpellingActivated=true;
	    	findViewById(R.id.horizontalScrollView1).setVisibility(View.VISIBLE);
	    	// Enable vibrate
	    } else {
	    	SWSpellingActivated=false;
	    	
	    	findViewById(R.id.horizontalScrollView1).setVisibility(View.GONE);
	        // Disable vibrate
	    }
	    writeSharedPrefBool("SWSpellingActivated",SWSpellingActivated);
	}
	
	public void onSecurityToggleClicked(View view) {
	    // Is the toggle on?
		//ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
		//((ToggleButton) view).setChecked(SLVideoActivated);
	   
		boolean on = ((ToggleButton) view).isChecked();
	    Log.d("checked------------------------","");
	    if (on) {
	    	SecurityActivated=true;
	    	findViewById(R.id.horizontalScrollView2).setVisibility(View.VISIBLE);
	    	// Enable vibrate
	    } else {
	    	SecurityActivated=false;
	    	
	    	findViewById(R.id.horizontalScrollView2).setVisibility(View.GONE);
	        // Disable vibrate
	    	
	    }
	    writeSharedPrefBool("SecurityActivated",SecurityActivated);
	}
	
	public void onGoogleToggleClicked(View view) {
	    // Is the toggle on?
		//ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
		//((ToggleButton) view).setChecked(SLVideoActivated);
	  
		boolean on = ((ToggleButton) view).isChecked();
	    Log.d("checked------------------------","");
	    if (on) {
	    	GoogleActivated=true;
	    	findViewById(R.id.horizontalScrollView5).setVisibility(View.VISIBLE);
	    	// Enable vibrate
	    } else {
	    	GoogleActivated=false;
	    	
	    	findViewById(R.id.horizontalScrollView5).setVisibility(View.GONE);
	        // Disable vibrate
	    }
	    writeSharedPrefBool("GoogleActivated",GoogleActivated);
	}
	
	
	
	
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Toast.makeText(this,"onCreateOptionsMenu "+menu.toString(),
		// Toast.LENGTH_LONG ).show();
		Item item;
		
		//menu.size()
		
		//menu.add("SelectViews");
		menu.add("SelectViews").setIcon(android.R.drawable.ic_menu_view).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		//menu.getItem(0).setIcon(android.R.drawable.ic_menu_view);
		//menu.getItem(0).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);//.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		//menu.getItem(menu.size()-1).setIcon(android.R.drawable.btn_dialog);
		//((ImageButton)findViewById(R.id.button2)).setImageResource(android.R.drawable.stat_notify_call_mute)
		menu.add("Reload").setIcon(android.R.drawable.ic_popup_sync).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);;
		menu.add("loadList").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		//menu.add("pickContact");
		//menu.add("getPhoto");
		//menu.addSubMenu("languages");
		//menu.add("Français");//working
		// menu.add(1, 0, 1, "cool");
		
		//menu.add("English");//working
		
		//menu.add("Espagnol");
		//menu.add("Esperanto");
		//menu.addSubMenu("Other languages");

		//menu.add("SL-Video");
		//menu.add("SLVideoOnOff");
		//menu.addSubMenu("SL-VideoOptions");
		//menu.add("VideoAlpha");

		//menu.add("SL-spell");
		//menu.add("SW-spell");
		//menu.add("SW-Image");
		//menu.add("User");
		//menu.add("Google");
		
		
		
		/*menu.add("StopAutoScroll");
		menu.add("AutoscrollSW-spell");
		menu.add("AutoscrollUser");
		menu.add("AutoScrollGoogle");
		*/
		//menu.add("AutoScroll");
		
		/*
		menu.add("FullSize");
		menu.add("MicroSize");
		menu.add("NormalSize");
		menu.add("BlankVideo");
		*/

		

		//menu.add("Inject");
		if (SafeSearchActivated) menu.add("SafeSearch").setIcon(android.R.drawable.ic_lock_lock).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		else menu.add("SafeSearch").setIcon(android.R.drawable.ic_menu_report_image).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
			
		menu.add("Help").setIcon(android.R.drawable.ic_menu_help).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		menu.add("debug").setIcon(android.R.drawable.ic_menu_manage).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		menu.add("Validation").setIcon(android.R.drawable.ic_menu_info_details).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		menu.add("About").setIcon(android.R.drawable.ic_menu_info_details).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		// languagePref =
		// Locale.getDefault().getDisplayLanguage();//Locale.FRENCH.toString();

		// ((TextView)findViewById(R.id.texte)).setText(“Menu”);
		// MenuInflater inflater = getMenuInflater();
		// inflater.inflate(R.menu.option, menu);
		// inflater.inflate(R.layout.menu, menu);
		Log.v("menu", "menu created" + menu.toString());
		return true;
	}

	static final int PICK_CONTACT_REQUEST = 2; // The request code
	static final int ACTION_CAMERA_BUTTON_REQUEST = 3; // The request code

	private void pickContact() {
		Intent pickContactIntent = new Intent(Intent.ACTION_PICK,
				Uri.parse("content://contacts"));
		pickContactIntent.setType(Phone.CONTENT_TYPE); // Show user only
														// contacts w/ phone
														// numbers
		// pickContactIntent.setType( Phone.CONTACT_STATUS_ICON); // Show user
		// only contacts w/ phone numbers
		startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);
	}

	private static final int REQUEST_PHOTO = 4;

	private void getPhoto(String string) {
		if (string == "")
			string = Environment.getExternalStorageDirectory() + File.separator
					+ "hexasense" + File.separator + "userPhoto" + ".jpg";// "userPhoto";

		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		// intent.setData("");
		// createButton("Tomar foto", intent, REQUEST_PHOTO);

		
		 Log.d("takingPicture",Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ lastOnMediaLongClick
					+ ".jpg");
		 
			File file = new File(Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+ lastOnMediaLongClick
					+ ".jpg");
		
		 // Erase the old File and make a photo to replace it
		  if  (file.exists())file.delete();
		  
		 /* getPhoto(Environment
		  .getExternalStorageDirectory() +
		  File.separator + "hexasense" +
		  File.separator
		  +lastOnMediaLongClick+".jpg");
		 */
		if (debug>1)  Toast.makeText(getApplicationContext(),
		 "Long click on Image: "
		  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
		 Toast.LENGTH_SHORT).show();
		
		
		
		/*
		 * Environment.getExternalStorageDirectory() + File.separator +
		 * "hexasense" + File.separator + wordsYouSaid[foundWord] + ".jpg"
		 */

		/*
		 * //if extra bigImage else littleImage
		 *
		 * //+ wordsYouSaid[foundWord] +
		 * ".jpg")));
		 */
		  intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(string)));
		//intent.putExtra("", Uri.fromFile(new File(string)));// +
															// wordsYouSaid[foundWord]
															// + ".jpg")));

		startActivityForResult(intent, REQUEST_PHOTO);

		/*
		 * String FILE_PATH="myphoto2.jpg"; Intent imageCaptureIntent = new
		 * Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		 * imageCaptureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new
		 * File(FILE_PATH))); startActivityForResult(imageCaptureIntent,
		 * REQUEST_PHOTO);
		 */

		// Intent pickContactIntent = new Intent(Intent.ACTION_SYSTEM_TUTORIAL,
		// Uri.parse("content://contacts"));
		// Intent actionCameraButtonIntent = new
		// Intent(Intent.ACTION_CAMERA_BUTTON, Uri.parse("content://contacts"));
		// actionCameraButtonIntent.setType()
		// pickContactIntent.setType(Phone.CONTENT_TYPE); // Show user only
		// contacts w/ phone numbers
		// startActivityForResult(actionCameraButtonIntent,
		// ACTION_CAMERA_BUTTON_REQUEST);
	}

	private static final int FILE_SELECT_CODE = 5;

	private void showFileChooser() {
		Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("*/*");
		intent.addCategory(Intent.CATEGORY_OPENABLE);
		// intent.putExtra("", Uri.fromFile(new File(string)));//+
		// wordsYouSaid[foundWord] + ".jpg")));

		try {
			startActivityForResult(Intent.createChooser(intent,
					"Select a file to replace existing media"),
					FILE_SELECT_CODE);

		} catch (android.content.ActivityNotFoundException ex) {
			// Potentially direct the user to the Market with a Dialog
			Toast.makeText(this, "Please install a File Manager.",
					Toast.LENGTH_SHORT).show();
		}
	}
	
	private Uri fileUri;

	private static final int REQUEST_VIDEO = 6;

	private void getVideo(String string) {
		if (string == "")
			string = Environment.getExternalStorageDirectory() + File.separator
					+ "hexasense" +File.separator+"video" +File.separator + "uservideo" + ".mp4";// "userPhoto";

		Intent intent = new Intent("android.media.action.VIDEO_CAMERA");//INTENT_ACTION_VIDEO_CAMERA
		// intent.setData("");
		// createButton("Tomar foto", intent, REQUEST_PHOTO);
		//Uri fileUri = getOutputMediaFileUri();//MEDIA_TYPE_VIDEO);  // create a file to save the video
		   // intent.putExtra(MediaStore.EXTRA_OUTPUT, string);  // set the image file name

		    intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1); // set the video image quality
		
		    intent.putExtra(MediaStore.EXTRA_DURATION_LIMIT , 3);
		
		 Log.d("makingVideo",lastOnVideoLongClick.toString());/*Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator+
					"video"+
					File.separator
					+ lastOnVideoLongClick
					+ ".mp4");*/
		 
			File file = new File(lastOnVideoLongClick.toString());/*Environment
					.getExternalStorageDirectory()
					+ File.separator
					+ "hexasense"
					+ File.separator+
					"video"+
					File.separator
					+ lastOnVideoLongClick
					+ ".mp4");*/
		
		 // Erase the old File and make a photo to replace it
		  if  (file.exists())file.delete();
		  
		 /* getPhoto(Environment
		  .getExternalStorageDirectory() +
		  File.separator + "hexasense" +
		  File.separator
		  +lastOnMediaLongClick+".jpg");
		 */
		  if (debug>1) Toast.makeText(getApplicationContext(),
		 "Long click on Video: "
		  +lastOnVideoLongClick+"    toString "+lastOnVideoLongClick,
		 Toast.LENGTH_SHORT).show();
		
		
		
		/*
		 * Environment.getExternalStorageDirectory() + File.separator +
		 * "hexasense" + File.separator + wordsYouSaid[foundWord] + ".jpg"
		 */

		/*
		 * //if extra bigImage else littleImage
		 *
		 * //+ wordsYouSaid[foundWord] +
		 * ".jpg")));
		 */
		 
		  // intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(string)));
		  			//intent.putExtra("", Uri.fromFile(new File(string)));// +
															// wordsYouSaid[foundWord]
															// + ".jpg")));

		  
		//startActivityForResult(intent, REQUEST_VIDEO);
		
		//create new Intent
	    //Intent 
		intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
	     fileUri = getOutputMediaFileUri(MEDIA_TYPE_VIDEO);
	   //String fileUri =lastOnVideoLongClick;//  getOutputMediaFileUri(MEDIA_TYPE_VIDEO);  // create a file to save the video
	    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);  // set the image file name

	    intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1); // set the video image quality to high

	    // start the Video Capture Intent
	    startActivityForResult(intent, REQUEST_VIDEO);

		
		
		

		/*
		 * String FILE_PATH="myphoto2.jpg"; Intent imageCaptureIntent = new
		 * Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		 * imageCaptureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new
		 * File(FILE_PATH))); startActivityForResult(imageCaptureIntent,
		 * REQUEST_PHOTO);
		 */

		// Intent pickContactIntent = new Intent(Intent.ACTION_SYSTEM_TUTORIAL,
		// Uri.parse("content://contacts"));
		// Intent actionCameraButtonIntent = new
		// Intent(Intent.ACTION_CAMERA_BUTTON, Uri.parse("content://contacts"));
		// actionCameraButtonIntent.setType()
		// pickContactIntent.setType(Phone.CONTENT_TYPE); // Show user only
		// contacts w/ phone numbers
		// startActivityForResult(actionCameraButtonIntent,
		// ACTION_CAMERA_BUTTON_REQUEST);
	}
	
	
	public static final int MEDIA_TYPE_IMAGE = 1;
	public static final int MEDIA_TYPE_VIDEO = 2;

	/** Create a file Uri for saving an image or video */
	private static Uri getOutputMediaFileUri(int type){
	      return Uri.fromFile(getOutputMediaFile(type));
	}

	/** Create a File for saving an image or video */
	private static File getOutputMediaFile(int type){
	    // To be safe, you should check that the SDCard is mounted
	    // using Environment.getExternalStorageState() before doing this.

	    //File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
	           //   Environment.DIRECTORY_PICTURES), "MyCameraApp");
	    // This location works best if you want the created images to be shared
	    // between applications and persist after your app has been uninstalled.

	    File mediaStorageDir = new File(Environment.getExternalStorageDirectory()+"/hexasense"  //.getAbsolutePath()getExternalStoragePublicDirectory(
	              , "video");
	    
	    // Create the storage directory if it does not exist
	    if (! mediaStorageDir.exists()){
	        if (! mediaStorageDir.mkdirs()){
	            Log.d("MyCameraApp", "failed to create directory");
	            return null;
	        }
	    }

	    // Create a media file name
	    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    File mediaFile;
	    if (type == MEDIA_TYPE_IMAGE){
	        mediaFile = new File(mediaStorageDir.getPath() + File.separator +
	        "IMG_"+ "timeStamp" + ".jpg");
	    } else if(type == MEDIA_TYPE_VIDEO) {
	    	
	       /* mediaFile = new File(mediaStorageDir.getPath() + File.separator +
	        "VID_"+ "timeStamp" + ".mp4");*/
	    	//String filename="";
	    	//filename =lastOnVideoLongClick.to;
	       // mediaFile = new File(mediaStorageDir.getPath() + File.separator +
	    	 //      "Bonjour"+ ".mp4");
	        mediaFile = new File(
		    	       lastOnVideoLongClick);
	       
	    } else {
	        return null;
	    }

	    return mediaFile;
	}
	
	private static final int VIDEO_FILE_SELECT_CODE = 7;

	private void showVideoFileChooser() {
		Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("*/*");
		intent.addCategory(Intent.CATEGORY_OPENABLE);
		// intent.putExtra("", Uri.fromFile(new File(string)));//+
		// wordsYouSaid[foundWord] + ".jpg")));

		try {
			startActivityForResult(Intent.createChooser(intent,
					"Select a video to replace existing media"),
					VIDEO_FILE_SELECT_CODE);

		} catch (android.content.ActivityNotFoundException ex) {
			// Potentially direct the user to the Market with a Dialog
			Toast.makeText(this, "Please install a File Manager.",
					Toast.LENGTH_SHORT).show();
		}
	}

	private static final int TEXT_FILE_SELECT_CODE =8;

	private void showTextFileChooser() {
		Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("text/plain");
		intent.addCategory(Intent.CATEGORY_OPENABLE);
		// intent.putExtra("", Uri.fromFile(new File(string)));//+
		// wordsYouSaid[foundWord] + ".jpg")));

		try {
			startActivityForResult(Intent.createChooser(intent,
					"Select a video to replace existing media"),
					TEXT_FILE_SELECT_CODE);

		} catch (android.content.ActivityNotFoundException ex) {
			// Potentially direct the user to the Market with a Dialog
			Toast.makeText(this, "Please install a File Manager.",
					Toast.LENGTH_SHORT).show();
		}
	}

	
	
	
	public void copyFile2File(File src, File dst) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	void quickReplaceRefInFile(String ref, String newRef)
	{
		
		
		replaceRefInFile(true,
				Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +"hexasense/image",
				"ImageList.txt",ref,
				ref
						+ "  "
						+ newRef
						+ System.getProperty("line.separator"));
		
		/*file2ExtStorage(true,
				"hexasense/image",
				"ImageList.txt",
				ref
						+ "  "
						+ newRef
						+ System.getProperty("line.separator"));*/
		//openFile();
		//searchRef(ref);
		//writeRef(newRef);
		
	}
	
	public void replaceRefInFile(Boolean append, String directory,
			String fileName, String text2Find, String text2Write) {

		
		//textRead(directory+fileName,text2Find,text2Write);//(String fileInput,String item, String writeIn)
		textReadWrite(directory+fileName,text2Find,text2Write);//(String fileInput,String item, String writeIn)
		//public  String textReadWrite(String fileInput,String item, String copyFromRef) {
		// simplycreating a directory and a file inSDcar
		// String filename
		// =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+"/"+"mydirectory"+"/"+
		// "myfile2.txt";//
		
		//File sdCard = Environment.getExternalStorageDirectory();
		File dir = new File( directory);// "/Hexasense");
		dir.mkdirs();
		File file1 = new File(dir, fileName);// "hexasense.txt");

		
		
		try {
			FileOutputStream f = new FileOutputStream(file1, append);

			f.write(text2Write.getBytes());
			// f.write((InputStream)new
			// URL("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4").);
			f.close();
			
			
			
			
		} catch (FileNotFoundException e1) {
			Log.e("FileNotFoundException",""+e1.toString());
			e1.printStackTrace();
		} catch (IOException e2) {
			Log.e("IOException",""+e2.toString());
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

			//onClick(this.tempView);
		
		
		if (requestCode == WORDLIST_SELECT_CODE) {
			//loading a txt file
			if (resultCode == RESULT_OK) {
				// Uri mUri = data.getData();
				// replacing selected Media by a an existing media
				String result = null;
				Uri uri = data.getData();
				Log.d("WORDLIST_SELECT_CODE", "File Uri: " + uri.toString());
				
			}
		}
		
		if (requestCode == TEXT_FILE_SELECT_CODE) {
			//loading a txt file
			if (resultCode == RESULT_OK) {
				// Uri mUri = data.getData();
				// replacing selected Media by a an existing media
				String result = null;
				Uri uri = data.getData();
				Log.d("WORDLIST_SELECT_CODE", "File Uri: " + uri.toString());
				loadList(uri.getPath());
				
			}
		}
		if (requestCode == VIDEO_FILE_SELECT_CODE) {
			// Make sure the request was successful
			if (debug>1)Toast.makeText(getApplicationContext(), "VIDEO_FILE_SELECT_CODE",
					Toast.LENGTH_SHORT); // Do something with the contact here
											// (bigger example below)

			if (resultCode == RESULT_OK) {
				// Uri mUri = data.getData();
				// replacing selected Media by a an existing media
				String result = null;
				Uri uri = data.getData();
				Log.d("VIDEO_FILE_SELECT_CODE", "File Uri: " + uri.toString());
				// Get the path
				// String path = FileUtils.getPath(this, uri);

				// URI2usableURI Content/File
				if ("content".equalsIgnoreCase(uri.getScheme())) {
					String[] projection = { "_data" };
					Cursor cursor = null;

					try {
						cursor = this.getContentResolver().query(uri,
								projection, null, null, null);
						int column_index = cursor
								.getColumnIndexOrThrow("_data");
						if (cursor.moveToFirst()) {
							result = cursor.getString(column_index);
							Log.d("VIDEO_FILE_SELECT_CODE", "File Path: " + result);

							// Tell the media scanner about the new file so that
							// it is //
							// immediately available to the user.
							MediaScannerConnection
									.scanFile(
											this,
											new String[] { result },
											null,
											new MediaScannerConnection.OnScanCompletedListener() {
												public void onScanCompleted(
														String path, Uri uri) {
													Log.i("ExternalStorage",
															"Scanned " + path
																	+ ":");
													Log.i("ExternalStorage",
															"-> uri=" + uri);
												}
											});

						}
					} catch (Exception e) {
						// Eat it
					}
				} else if ("file".equalsIgnoreCase(uri.getScheme())) {
					result = uri.getPath();
					Log.d("VIDEO_FILE_SELECT_CODE", "File Path: " + result);

					// Tell the media scanner about the new file so that it is
					// //
					// immediately available to the user.
					MediaScannerConnection
							.scanFile(
									this,
									new String[] { result },
									null,
									new MediaScannerConnection.OnScanCompletedListener() {
										public void onScanCompleted(
												String path, Uri uri) {
											Log.i("ExternalStorage", "Scanned "
													+ path + ":");
											Log.i("ExternalStorage", "-> uri="
													+ uri);
										}
									});

				}
				Log.d("","result"+result);
				
				if (result != null) {
					File file = new File(result);
					String path=""+lastOnVideoLongClick+"";
					/*= Environment.getExternalStorageDirectory()
							+ File.separator + "hexasense" + File.separator
							+ "hexasense" + File.separator
							+ lastOnVideoLongClick + ".mp4";
					*/
					// +
					// "userPhoto"
					// +
					// ".jpg";//"userPhoto"
					File fileOut = new File(path);
					// fileOut.delete();//don't delete this time to kepp media
					// on SD

					try {
						
							
						Log.d("","result not null"+result+"  "+"Hexasense/" + File.separator+"video/" + File.separator);
						//if resultCameFrom Public App Directory
						if (result.contains(
								  "Hexasense" + File.separator))	{
							Log.d("","result contain"+result+"     "+Environment.getExternalStorageDirectory()
									+ File.separator + "hexasense" + File.separator);
							
							String oldItemName;
							oldItemName=result.substring(result.lastIndexOf("/")+1,result.lastIndexOf(".mp4"));
							Log.d("","oldItemName="+oldItemName);
							
							replaceRefInFile(true,						
								Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +"hexasense/video/",
								"FileList.txt",lastOnVideoLongClick,
								oldItemName);
						}
						
						/*if (!fileOut.exists()){
							 path = Environment.getExternalStorageDirectory()
									+ File.separator + "hexasense" + File.separator
									+"video"+ File.separator
									 + File.separator
									+ lastOnMediaLongClick + ".mp4";
							 fileOut=new File(path);
							
						}*/
						copyFile2File(file, fileOut);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					/*
					 * File fileCopy=file;
					 * 
					 * 
					 * try { fileCopy.createTempFile("file", ".jpg"); } catch
					 * (IOException e) { // TODO Auto-generated catch block
					 * e.printStackTrace(); }
					 */
					// Boolean renameResult=file.renameTo(fileOut);

					// file.deleteOnExit();
					Log.d("", "result " + result + " result" + "/n" + "path"
							+ path + "");

					// File path =
					// Environment.getExternalStoragePublicDirectory(
					// Environment.DIRECTORY_PICTURES);
				}

				// Get the file instance
				// File file = new File(path);
				// Initiate the upload

				// intent.getDataString();
				// The Intent's data Uri identifies which contact was selected.
				if (debug>1)Toast.makeText(getApplicationContext(),
						"VIDEO_FILE_SELECT_CODE =File Selected Picked",
						Toast.LENGTH_SHORT); // Do something with the contact
												// here (bigger example below)
			} else
				Toast.makeText(getApplicationContext(),
						"VIDEO_FILE_SELECT_CODE not selected", Toast.LENGTH_SHORT);
			processRequest(lastRequest);
		}
		
		
		
		
		if (requestCode == FILE_SELECT_CODE) {
			// Make sure the request was successful
			if (debug>1)Toast.makeText(getApplicationContext(), "FILE_SELECT_CODE",
					Toast.LENGTH_SHORT); // Do something with the contact here
											// (bigger example below)

			if (resultCode == RESULT_OK) {
				// Uri mUri = data.getData();
				// replacing selected Media by a an existing media
				String result = null;
				Uri uri = data.getData();
				Log.d("FILE_SELECT_CODE", "File Uri: " + uri.toString());
				// Get the path
				// String path = FileUtils.getPath(this, uri);

				// URI2usableURI Content/File
				if ("content".equalsIgnoreCase(uri.getScheme())) {
					String[] projection = { "_data" };
					Cursor cursor = null;

					try {
						cursor = this.getContentResolver().query(uri,
								projection, null, null, null);
						int column_index = cursor
								.getColumnIndexOrThrow("_data");
						if (cursor.moveToFirst()) {
							result = cursor.getString(column_index);
							Log.d("FILE_SELECT_CODE", "File Path: " + result);

							// Tell the media scanner about the new file so that
							// it is //
							// immediately available to the user.
							MediaScannerConnection
									.scanFile(
											this,
											new String[] { result },
											null,
											new MediaScannerConnection.OnScanCompletedListener() {
												public void onScanCompleted(
														String path, Uri uri) {
													Log.i("ExternalStorage",
															"Scanned " + path
																	+ ":");
													Log.i("ExternalStorage",
															"-> uri=" + uri);
												}
											});

						}
					} catch (Exception e) {
						// Eat it
					}
				} else if ("file".equalsIgnoreCase(uri.getScheme())) {
					result = uri.getPath();
					Log.d("FILE_SELECT_CODE", "File Path: " + result);

					// Tell the media scanner about the new file so that it is
					// //
					// immediately available to the user.
					MediaScannerConnection
							.scanFile(
									this,
									new String[] { result },
									null,
									new MediaScannerConnection.OnScanCompletedListener() {
										public void onScanCompleted(
												String path, Uri uri) {
											Log.i("ExternalStorage", "Scanned "
													+ path + ":");
											Log.i("ExternalStorage", "-> uri="
													+ uri);
										}
									});

				}
				Log.d("","result"+result);
				
				if (result != null) {
					
					File file = new File(result);
					String path = Environment.getExternalStorageDirectory()
							+ File.separator + "hexasense" + File.separator
							+"fr" + File.separator+ lastOnMediaLongClick + ".jpg";// +
					// "userPhoto"
					// +
					// ".jpg";//"userPhoto"
					File fileOut = new File(path);
					// fileOut.delete();//don't delete this time to kepp media
					// on SD

					try {
						
							
						Log.d("","result not null"+result+"  "+"Hexasense/" + File.separator);
						//if resultCameFrom Public App Directory
						if (result.contains(
								  "Hexasense" + File.separator))	{
							Log.d("","result contain"+result+"     "+Environment.getExternalStorageDirectory()
									+ File.separator + "hexasense" + File.separator);
							
							String oldItemName;
							oldItemName=result.substring(result.lastIndexOf("/")+1,result.lastIndexOf(".jpg"));
							Log.d("","oldItemName="+oldItemName);
							
							replaceRefInFile(true,						
								Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +"hexasense/image/",
								"ImageList.txt",lastOnMediaLongClick,
								oldItemName);
							//path=result.
							
							
						}
						if (!fileOut.exists()){
							 path = Environment.getExternalStorageDirectory()
									+ File.separator + "hexasense" + File.separator
									+ lastOnMediaLongClick + ".jpg";
							 fileOut=new File(path);
							
						}
						
				//		fileOut=new File(lastOnMediaLongClick);
						
						copyFile2File(file, fileOut);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					/*
					 * File fileCopy=file;
					 * 
					 * 
					 * try { fileCopy.createTempFile("file", ".jpg"); } catch
					 * (IOException e) { // TODO Auto-generated catch block
					 * e.printStackTrace(); }
					 */
					// Boolean renameResult=file.renameTo(fileOut);

					// file.deleteOnExit();
					Log.d("", "result " + result + " result" + "/n" + "path"
							+ path + "");

					// File path =
					// Environment.getExternalStoragePublicDirectory(
					// Environment.DIRECTORY_PICTURES);
				}

				// Get the file instance
				// File file = new File(path);
				// Initiate the upload

				// intent.getDataString();
				// The Intent's data Uri identifies which contact was selected.
				if (debug>1)Toast.makeText(getApplicationContext(),
						"FILE_SELECT_CODE =File Selected Picked",
						Toast.LENGTH_SHORT); // Do something with the contact
												// here (bigger example below)
			} else
				Toast.makeText(getApplicationContext(),
						"FILE_SELECT_CODE not selected", Toast.LENGTH_SHORT);
			
			processRequest(lastRequest);
		}

		
		
		if (requestCode == PICK_CONTACT_REQUEST) {
			// Make sure the request was successful
			if (debug>1)Toast.makeText(getApplicationContext(), "PICK_CONTACT_REQUEST",
					Toast.LENGTH_SHORT); // Do something with the contact here
											// (bigger example below)
			if (resultCode == RESULT_OK) {
				// The user picked a contact.
				// The Intent's data Uri identifies which contact was selected.
				if (debug>1)Toast.makeText(getApplicationContext(),
						"PICK_CONTACT_REQUEST =contact Picked",
						Toast.LENGTH_SHORT); // Do something with the contact
												// here (bigger example below)
			}
			Toast.makeText(getApplicationContext(),
					"PICK_CONTACT_REQUESTnot picked", Toast.LENGTH_SHORT);
		}

		
		if (requestCode == REQUEST_VIDEO) {
			// Make sure the request was successful
			if (debug>1)Toast.makeText(getApplicationContext(), "REQUEST_VIDEO",
					Toast.LENGTH_SHORT).show(); 
			
			if (resultCode == RESULT_OK) {
				
				if (debug>1)Toast.makeText(this, "Image saved to:\n" +
	                     data.getData(), Toast.LENGTH_LONG).show();

				 Log.d("Video REQUEST_VIDEO OK",Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ "video"
							+ File.separator
							+ lastOnVideoLongClick
							+ ".mp4");
				/* 
				File	file = new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				
				 // Erase the old File and make a photo to replace it
				  if  (file.exists())file.delete();
				  
				  getPhoto(Environment
				  .getExternalStorageDirectory() +
				  File.separator + "hexasense" +
				  File.separator
				  +lastOnMediaLongClick+".jpg");
				 
				  Toast.makeText(getApplicationContext(),
				 "Long click on Image: "
				  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
				 Toast.LENGTH_SHORT).show();
				 */
					if (data!=null){
						 Uri phototUri = data.getData(); // We only need the NUMBERcolumn, because there will be only one row in the result //
						 // String[] projection = {Phone.NUMBER};
						
						 /* File fileOut= new FileFromUri;
						 File fileIn;
						copyFile2File(fileIn,fileOut);*/
						 
						 /*
						  Log.d("","photo:"+phototUri.getPath());
						  Log.d("","photo:"+phototUri
						  .getLastPathSegment()+" getEncodedPath:"+
						  phototUri.getEncodedPath());
						  Log.d("","photo:"+phototUri.getLastPathSegment
						  ()+" getEncodedPath:"+ phototUri.toString());
						  
						  // Files files; //Files.
						  File fileIn=new  File(phototUri.getPath());
						 Log.d(""," getAbsolutePath:"+fileIn.getAbsolutePath()); 
						 File path = Environment.getExternalStoragePublicDirectory(
						  Environment.DIRECTORY_MOVIES);
						 //Environment.
						  
						 String outPathString=(Environment.getExternalStorageDirectory().toString()
									+ File.separator
									+ "hexasense"
									+ File.separator
									+ "video"
									+ File.separator);
						 
						 File outPath = new File (Environment.getExternalStorageDirectory().toString()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ "video"
							+ File.separator);
						 
							//+ lastOnMediaLongClick
							//+ ".jpg"));
						  File fileOut;//=new  File(Environment.getExternalStoragePublicDirectory (Environment .DIRECTORY_PICTURES)));
						  //(this.getExternalFilesDir(type)));
						  //, this.getApplication().getExternalFilesDir(type) +"aaaphoto.jpg");
						  
						  
						  fileOut= new File(outPath, (lastOnVideoLongClick).replace(outPathString, ""));
						 
						 
						 try {
							 path.mkdirs();
							 outPath.mkdirs();
							 fileOut.delete();
						  
						  InputStream is = new  FileInputStream(fileIn);
						  //getResources().openRawResource(R.drawable.balloons); 
						  //InputStream is =					  getResources().openRawResource(R.drawable.balloons);
						 OutputStream os = new FileOutputStream(fileOut); byte[] data2
						 = new byte[is.available()]; is.read(data2); os.write(data2);
						  is.close(); os.close();
						  
						  
						  
						  
						  
						  fileIn.renameTo(fileOut); //copyFile2File(fileIn,fileOut);
						  fileIn.delete(); fileIn.delete();
						  
						  // Tell the media scanner about the new file so that it is 
						  //	  immediately available to the user.
						  MediaScannerConnection.scanFile(this, new String[] {
						  fileOut.toString() }, null, new
						  MediaScannerConnection.OnScanCompletedListener() { public
						  void onScanCompleted(String path, Uri uri) {
						  Log.i("ExternalStorage", "Scanned " + path + ":");
						  Log.i("ExternalStorage", "-> uri=" + uri); } });
						  
						  
						  jhj
						  
						  } catch (Exception e) { // TODO Auto-generated catch block
						  e.printStackTrace(); }
						 */

					// Perform the query on the contact to get the NUMBER column
					// We don't need a selection or sort order (there's only one
					// result for the given URI)
					// CAUTION: The query() method should be called from a separate
					// thread to avoid blocking
					// your app's UI thread. (For simplicity of the sample, this
					// code doesn't do that.)
					// Consider using CursorLoader to perform the query.
					/*
					 * Cursor cursor = getContentResolver() .query(contactUri,
					 * projection, null, null, null); cursor.moveToFirst();
					 */

					// The user picked a contact.
					// The Intent's data Uri identifies which contact was selected.
						 if (debug>1)Toast.makeText(getApplicationContext(),
							"REQUEST_VIDEO =video OK", Toast.LENGTH_SHORT).show();
	
						
					}
					else if (debug>1)Toast.makeText(getApplicationContext(),
							"REQUEST_VIDEO =video OK Data is null", Toast.LENGTH_SHORT).show();
					
				// Do something with the contact here (bigger example below)
			} else
				if (debug>1)Toast.makeText(getApplicationContext(),
						"REQUEST_VIDEO =video KO", Toast.LENGTH_SHORT).show();
			
			
			processRequest(lastRequest);
		}
		
		
		
		
		
		
		if (requestCode == REQUEST_PHOTO) {
			// Make sure the request was successful
			if (debug>1)Toast.makeText(getApplicationContext(), "REQUEST_PHOTO",
					Toast.LENGTH_SHORT).show(); // Do something with the contact
												// here (bigger example below)
			if (resultCode == RESULT_OK) {
				
				 Log.d("takingPicture REQUEST_PHOTO OK",Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				/* 
				File	file = new File(Environment
							.getExternalStorageDirectory()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ lastOnMediaLongClick
							+ ".jpg");
				
				 // Erase the old File and make a photo to replace it
				  if  (file.exists())file.delete();
				  
				  getPhoto(Environment
				  .getExternalStorageDirectory() +
				  File.separator + "hexasense" +
				  File.separator
				  +lastOnMediaLongClick+".jpg");
				 
				  Toast.makeText(getApplicationContext(),
				 "Long click on Image: "
				  +lastOnMediaLongClick+"    toString "+lastOnMediaLongClick,
				 Toast.LENGTH_SHORT).show();
				 */
					if (data!=null){
						 Uri phototUri = data.getData(); // We only need the NUMBERcolumn, because there will be only one row in the result //
						 // String[] projection = {Phone.NUMBER};
						 
						  Log.d("","photo:"+phototUri.getPath());
						  Log.d("","photo:"+phototUri
						  .getLastPathSegment()+" getEncodedPath:"+
						  phototUri.getEncodedPath());
						  Log.d("","photo:"+phototUri.getLastPathSegment
						  ()+" getEncodedPath:"+ phototUri.toString());
						  
						  // Files files; //Files.
						  File fileIn=new  File(phototUri.getPath());
						 Log.d(""," getAbsolutePath:"+fileIn.getAbsolutePath()); 
						 File path = Environment.getExternalStoragePublicDirectory(
						  Environment.DIRECTORY_PICTURES);
						  
						 File outPath = new File (Environment.getExternalStorageDirectory().toString()
							+ File.separator
							+ "hexasense"
							+ File.separator);
							//+ lastOnMediaLongClick
							//+ ".jpg"));
						  File fileOut;//=new  File(Environment.getExternalStoragePublicDirectory (Environment .DIRECTORY_PICTURES)));
						  //(this.getExternalFilesDir(type)));
						  //, this.getApplication().getExternalFilesDir(type) +"aaaphoto.jpg");
						  fileOut= new File(outPath, lastOnMediaLongClick+".jpg");
						 
						 
						 try {
							 path.mkdirs();
							 outPath.mkdirs();
							 fileOut.delete();
						  
						  InputStream is = new  FileInputStream(fileIn);
						  //getResources().openRawResource(R.drawable.balloons); 
						  //InputStream is =					  getResources().openRawResource(R.drawable.balloons);
						 OutputStream os = new FileOutputStream(fileOut); byte[] data2
						 = new byte[is.available()]; is.read(data2); os.write(data2);
						  is.close(); os.close();
						  
						  
						  
						  
						  
						  fileIn.renameTo(fileOut); //copyFile2File(fileIn,fileOut);
						  fileIn.delete(); fileIn.delete();
						  
						  // Tell the media scanner about the new file so that it is 
						  //	  immediately available to the user.
						  MediaScannerConnection.scanFile(this, new String[] {
						  fileOut.toString() }, null, new
						  MediaScannerConnection.OnScanCompletedListener() { public
						  void onScanCompleted(String path, Uri uri) {
						  Log.i("ExternalStorage", "Scanned " + path + ":");
						  Log.i("ExternalStorage", "-> uri=" + uri); } });
						  
						  
						  
						  
						  } catch (Exception e) { // TODO Auto-generated catch block
						  e.printStackTrace(); }
						 

					// Perform the query on the contact to get the NUMBER column
					// We don't need a selection or sort order (there's only one
					// result for the given URI)
					// CAUTION: The query() method should be called from a separate
					// thread to avoid blocking
					// your app's UI thread. (For simplicity of the sample, this
					// code doesn't do that.)
					// Consider using CursorLoader to perform the query.
					/*
					 * Cursor cursor = getContentResolver() .query(contactUri,
					 * projection, null, null, null); cursor.moveToFirst();
					 */

					// The user picked a contact.
					// The Intent's data Uri identifies which contact was selected.
						 if (debug>1)Toast.makeText(getApplicationContext(),
							"REQUEST_PHOTO =photo OK", Toast.LENGTH_SHORT).show();
	
						
					}
					else if (debug>1)Toast.makeText(getApplicationContext(),
							"REQUEST_PHOTO =photo OK Data is null", Toast.LENGTH_SHORT).show();
					
				// Do something with the contact here (bigger example below)
			} else
				if (debug>1)Toast.makeText(getApplicationContext(),
						"REQUEST_PHOTO =photo KO", Toast.LENGTH_SHORT).show();
			
			processRequest(lastRequest);
		}

		if (requestCode == REQUEST_OK && resultCode == RESULT_OK) {
			// needDownload = false;

			ArrayList<String> thingsYouSaid = data
					.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
			String thingYouSaid = thingsYouSaid.get(0);
			Log.d("input", "" + thingYouSaid);
			this.setProgressBarVisibility(true);

			// this.removeStickyBroadcast(intent)
			this.setProgress(5);
			this.setTitle(thingYouSaid);
			startLongRunningOperation();
			((TextView) findViewById(R.id.text1)).setText(
					Html.fromHtml(
							thingYouSaid+"   <br>   "+
					((TextView) findViewById(R.id.text1)).getText()
					
					)
					);
			processRequest(thingYouSaid);
			lastRequest = thingYouSaid;

			if (debug>1)Toast.makeText(getApplicationContext(), ">>> " + thingYouSaid,
					Toast.LENGTH_LONG).show();
		}// if request

		else {
			if (resultCode == RecognizerIntent.RESULT_AUDIO_ERROR) {
				Toast.makeText(getApplicationContext(), "RESULT_AUDIO_ERROR",
						Toast.LENGTH_SHORT).show();
			}
			if (resultCode == RecognizerIntent.RESULT_CLIENT_ERROR) {
				Toast.makeText(getApplicationContext(), "RESULT_CLIENT_ERROR",
						Toast.LENGTH_SHORT).show();
			}
			if (resultCode == RecognizerIntent.RESULT_NETWORK_ERROR) {
				Toast.makeText(getApplicationContext(), "RESULT_NETWORK_ERROR",
						Toast.LENGTH_SHORT).show();
			}
			if (resultCode == RecognizerIntent.RESULT_NO_MATCH) {
				Toast.makeText(getApplicationContext(), "No Match",
						Toast.LENGTH_SHORT).show();
			}
			if (resultCode == RecognizerIntent.RESULT_SERVER_ERROR) {
				Toast.makeText(getApplicationContext(),
						"No RESULT_SERVER_ERROR", Toast.LENGTH_SHORT).show();
			}
			// Toast.makeText(getApplicationContext(), "No RESULT_SERVER_ERROR",
			// Toast.LENGTH_SHORT).show();
		}

		// addVideoView();
		// getBitmapFromURL("http://www.lsf-bordeaux.fr/images/logo.png");
		//
		// ImageView btnImageView=new ImageView(this);

		// ImageView btnImageView4=new ImageView(this);
		// btnImageView4.setLayoutParams(lparams);

		// imageGet("http://www.lsf-bordeaux.fr/images/logo.png",btnImageView4.getDrawingCache(),btnImageView4);
		// btnImageView4.setBackgroundResource(imageId);

		// hscrollLayout2.addView(btnImageView4,0 );
		// File video = new
		// File(Environment.getExternalStorageDirectory().getAbsolutePath()
		// +"/"+"hexasense/hexasense.mp4");

		// addVideoViewFromPath(Environment.getExternalStorageDirectory().getAbsolutePath()
		// +"/"+"hexasense/video/arbre.mp4" );//ok
		// addVideoWebViewFromPath();//ok for OGG
		// Log.e("addingVideoWebView","lastLinkInside"
		// +lastLinkInside.toString());
		// addVideoWebViewFromPath(lastLinkInside);//"http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche=je");//"http://www.lsf-bordeaux.fr");//
		// /images/video/alphabet/a.mp4");//ok for OGG
		// addVideoWebViewFromPath(lastLinkInside);//"http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche=je");//"http://www.lsf-bordeaux.fr");//
		// /images/video/alphabet/a.mp4");//ok for OGG
		// WebView.VISIBLE=1;
		// addVideoWebViewFromPath(lastLinkInside);
		/*
		 * DownloadFile("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4",
		 * "dwnLd.mp4"); DownloadFile2 mydownloadFile= new DownloadFile2();
		 * 
		 * mydownloadFile.doInBackground(
		 * "http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4");
		 * textWrite("working");
		 */

		/*
		 * //create a directory and a file //File file = new
		 * File(context.getFilesDir(), filename); File file = new
		 * File(Environment.getExternalStoragePublicDirectory(
		 * Environment.DIRECTORY_PICTURES), "mydirectory"); if (!file.mkdirs())
		 * { Log.e("arg", "Directory not created"); }
		 * 
		 * file = new File(Environment.getExternalStoragePublicDirectory(
		 * Environment.DIRECTORY_PICTURES)+"/"+"mydirectory", "myfile.txt"); try
		 * { file.createNewFile(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		/*
		 * File sdCard = Environment.getExternalStorageDirectory(); File dir =
		 * new File (sdCard.getAbsolutePath()
		 * +"/Hexasense");//+"/"+directory);// "/Hexasense"); dir.mkdirs(); File
		 * file1 = new File(dir,"hexasense.txt");// "hexasense.txt"); File file2
		 * = new File(dir,"hexasense2.txt");// "hexasense.txt"); try {
		 * copy(file1,file2); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

		// file2ExtStorage("hexasense","myHexasense.txt","Hexasense log0" );

		// advancedDownload("papillon");
		// advancedDownload();

		/*
		 * new Thread(new Runnable(){ public void run(){
		 * 
		 * if(true){//!isNetworkAvailable()){ //
		 * Toast.makeText(getApplicationContext(), "no internet",
		 * Toast.LENGTH_LONG).show(); // return; } // mp4ToSd(); Downloader
		 * downloader =new Downloader(); // downloader.downloadFromUrl(
		 * "http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4",
		 * "hexasense2.mp4");//fileName // downloader.downloadFromUrl(
		 * "http://www.helloandroid.com/sites/all/themes/helloandroid/logo.png",
		 * "hexasense2.png");//fileName //downloader.downloadFromUrl(
		 * "http://commons.wikimedia.org/wiki/Maison?uselang=fr", "text.txt");
		 * // String text=(String) Object text=""; ByteArrayBuffer bab; text =
		 * downloader.downloadFromUrl(
		 * "https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=maison&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
		 * ,"text.txt");//"http://commons.wikimedia.org/wiki/Maison?uselang=fr",
		 * "text.txt"); bab=(ByteArrayBuffer) text; //String str = new
		 * String(bytes, "UTF-8"); // String
		 * str=getOnline("http://www.example.com/script.php"); if
		 * (text!=""){Log.
		 * e("reading","there is something in my text"+text.toString());}
		 * text=new String(bab.toByteArray()).trim();
		 * Log.e("reading","there is something in my text"+text.toString());
		 * Log.e("reading","there is something in my text"+text.toString());
		 * 
		 * String str =text.toString();
		 * 
		 * int index=0; index
		 * =str.indexOf("https://encrypted-tbn1.gstatic.com/")
		 * ;//http://upload.wikimedia.org/wikipedia/commons/thumb/");
		 * Log.e("reading","there is something in my text at index:"+index);
		 * //https://encrypted-tbn1.gstatic.com/images?q=tbn:
		 * ANd9GcS_LK1mKgWX6z17gZ8f_JLrBq_ed12mSDQ4M3mkJqk5rjprW1PTvw
		 * 
		 * //http://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/78colonialhome
		 * .jpg/120px-78colonialhome.jpg int index2=
		 * str.indexOf("width",index);/
		 * /.indexOf("http://upload.wikimedia.org/wikipedia/commons/thumb/"
		 * ,"hj"); // index2= str.indexOf(".jpg",index2);
		 * Log.e("reading","there is something in my text ending at index:"
		 * +index2); //str=(String) str.subSequence(index, index2);
		 * 
		 * String fStr=""; fStr=(String) str.subSequence(index, index2-2);
		 * Log.e("reading","there is something in my address"+fStr.toString());
		 * downloader.downloadFromUrl(fStr, "maison.jpg");
		 * 
		 * 
		 * // String adr= } }).start(); // DownloadFromUrl("","");
		 */

		// addHscrollVideoViewFromPath();

	}// onresult

	void processRequest(String thingYouSaid) {

		lastLinkInside = "";// http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche=tu";
		//((TextView) findViewById(R.id.text1)).setText(thingYouSaid);
		/*
		((TextView) findViewById(R.id.text1)).setText(
				Html.fromHtml(
				thingYouSaid+"   <br>   "+
				((TextView) findViewById(R.id.text1)).getText()
				
				)
				);*/
		
		
		//((TextView) findViewById(R.id.text1)).setTextSize( (float)1.1* ((TextView)findViewById(R.id.text1)).getTextSize());
		// Boolean needDownload = false;
		// imageList=new int[listCounter+1][];
		listCounter = 0;
		signLanguageVideoCounter = 0;
		imageList = new int[listCounter + 1][];
		// hscrollLayout1.removeAllViews();

		
		
		if (SWSpellingActivated){
			hscrollLayout1.removeAllViews();
			count=0;
			//if (AutoScrollActivated)startAutoScrolling(hscrollView1);
			}
			
		if (SecurityActivated){
			hscrollLayout2.removeAllViews();
			//if (AutoScrollActivated)startAutoScrolling(hscrollView2);
			}
		
		if (GoogleActivated){
			
			//if (AutoScrollActivated)startAutoScrolling(hscrollView5);
			/*
			 * runOnUiThread(new Runnable() { public void run() {
			 * Toast.makeText((Context)this, "Hello",
			 * Toast.LENGTH_SHORT).show(); } });
			 */
			hscrollLayout5.removeAllViews();
			}
		
		// hscrollLayout5.removeAllViews();

		// this.addViews(tempView);// findViewById(R.id.main));
		// this.addImageViews(tempView,R.drawable.glyphogramh);//
		// findViewById(R.id.main));

		signLanguageVideo = null;

		thingYouSaid = "_" + thingYouSaid + "_";

		String thingCleaned = thingYouSaid;

		// cleaning string to handle accentuation and space
		/*
		 * thingYouSaid.replace('à', 'a'); thingYouSaid.replace('é', 'e');
		 * thingYouSaid.replace('è', 'e'); thingYouSaid.replace(' ', '_');
		 * 
		 * log.v("input","thingCleaned "+thingCleaned);
		 */

		// N.B: parser(String[2] [n])

		// This part is very dependant on languages application Image and video
		// providers... For exemple french words like bâteau may cause prolems
		// For exemple if a name starts with uppercase it could depends on his
		// position in the answer (First word)or for countrys, first name
		// Words need to be tailored to be searched on all the providers.
		// exemple Google engine returns different answer for 3 words
		// "bâteau bâteau bâteau " (boat boat boat) & for one "bateau" (boat)
		// the same word with two differents but accepted spelling

		// Most case mappings are unaffected by the language of a Locale.
		// Exceptions include dotted and dotless I in Azeri and Turkish locales,
		// and dotted and dotless I and J in Lithuanian locales.
		// On the other hand, it isn't necessary to provide a Greek locale to
		// get correct case mapping of Greek characters: any locale will do.

		thingCleaned = thingCleaned.toLowerCase(new Locale("FRENCH"));
		Log.d("input", "thingCleaned " + thingCleaned);

		int wordsYouSaidCounter = 0;
		final String[] wordsYouSaid = { "", "", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
		int[] wordspostion = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		wordsYouSaid[0] = "";
		String word = "";
		char lastChar = '_';
		int inWord = 0;

		for (int i = 0; i < thingYouSaid.length(); i++) {
			/*
			 * if(thingYouSaid.charAt(i)==(char)'a'){
			 * this.addImageViews(tempView,R.drawable.a);//
			 * findViewById(R.id.main)); }
			 */
			// i= thingYouSaid.lenght();
			
			
			switch (thingYouSaid.charAt(i)) {
			case 'â':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.a);
				thingCleaned = thingCleaned.substring(0, i) + "a"
						+ thingCleaned.substring(i + 1);
				// thingCleaned=thinhYousaid
				break;

			case 'a':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.a);
				// this.addImageViews(scrollLayout2,R.drawable.a);
				break;
			case 'b':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.b);
				break;
			case 'c':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.c);
				break;
			case 'ç':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.c);
				thingCleaned = thingCleaned.substring(0, i) + "c"
						+ thingCleaned.substring(i + 1);
				break;
			case 'd':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.d);
				break;
			case 'e':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.e);
				break;
			case 'é':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.e);
				thingCleaned = thingCleaned.substring(0, i) + "e"
						+ thingCleaned.substring(i + 1);
				break;
			case 'è':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.e);
				thingCleaned = thingCleaned.substring(0, i) + "e"
						+ thingCleaned.substring(i + 1);
				break;
			case 'ê':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.e);
				thingCleaned = thingCleaned.substring(0, i) + "e"
						+ thingCleaned.substring(i + 1);
				break;

			case 'f':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.f);
				break;
			case 'g':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.g);
				break;
			case 'h':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.h);
				break;
			case 'i':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.i);
				break;
			case 'j':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.j);
				break;
			case 'k':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.k);
				break;

			case 'l':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.l);
				break;
			case 'm':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.m);
				break;
			case 'n':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.n);
				break;
			case 'o':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.o);
				break;
			case 'p':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.p);
				break;
			case 'q':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.q);
				break;
			case 'r':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.r);
				break;
			case 's':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.s);
				break;
			case 't':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.t);
				break;
			case 'u':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.u);
				break;
			case 'v':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.v);
				break;
			case 'w':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.w);
				break;
			case 'x':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.x);
				break;
			case 'y':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.y);
				break;
			case 'z':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.z);
				break;

			case ' ':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.space);
				thingCleaned = thingCleaned.substring(0, i) + "_"
						+ thingCleaned.substring(i + 1);
				break;
			case '!':
				if (SWSpellingActivated)
					this.addImageViews(scrollLayout, R.drawable.space);
				thingCleaned = thingCleaned.substring(0, i) + "_exclamation_"
						+ thingCleaned.substring(i + 1);
				break;
			default:

			}// switch

			// /////////////////////////////////////////
			Log.d("input-----------", "char " + thingCleaned.charAt(i)
					+ " word " + wordsYouSaidCounter + ":"
					+ wordsYouSaid[wordsYouSaidCounter]);
			if (thingCleaned.charAt(i) != '_') {
				if (lastChar == '_') {
					wordspostion[wordsYouSaidCounter] = i;

					// word.charAt(inWord);
					char actualChar = thingYouSaid.charAt(i);
					// actualChar.

					// word.concat(actualChar.);
				}

				word = word + thingYouSaid.charAt(i);

			} else {
				if (lastChar != '_') {
					wordsYouSaid[wordsYouSaidCounter] = word;
					Log.d("input-----------", "word " + wordsYouSaidCounter
							+ "" + wordsYouSaid[wordsYouSaidCounter]);
					wordsYouSaidCounter++;
					word = "";

				}

			}
			lastChar = thingYouSaid.charAt(i);
		}// for
			// ///////////////////////////////////////////////////////////////////////////////////

		thingYouSaid = thingCleaned;
		Log.d("input", "thingYouSaidCleaned " + thingYouSaid);

		// FirstCleaning Round is finshed

		/*
		 * if (thingYouSaid.matches(thingToFind)){ thingToFind="-OK"; }else{
		 * thingToFind="-KO"; }//else ImageView qImageView = (ImageView)
		 * findViewById(R.id.imageView1); if(thingToFind.matches("-OK")){//0 ==0
		 * || 5 == 5){ // qSV.setImageResource(0);
		 * qImageView.setImageResource(R.drawable.france); } else
		 * qImageView.setImageResource(R.drawable.ic_launcher);
		 * 
		 * ((TextView)findViewById(R.id.text1)).setText(thingsYouSaid.get(0)+
		 * thingToFind);
		 */

		if (SecurityActivated) {
			// Global Processing versus list Processing.
			// GLobal is better but harder with non homogeonous lists.
			// ----------------processing searching Security List from
			// resources//this part works well with little wordtoFindList
			// compare stringlist with thingYouSaid
			// String[] thingsToFind={"France","Italie"};

			final String[] thingsToFind = getResources().getStringArray(
					R.array.fi);
			Log.d("input", "thingsToFind " + thingsToFind);
			// int counter=thingsToFind.length-1;
			// ((TextView)findViewById(R.id.text1)).setText(thingsYouSaid.get(0)+"before While Counter"+counter);
			// Words2ImageResult[] actualWords2ImageResult=new
			// Words2ImageResult[0];
			/*
			 * Time before = new Time(); Time now = new Time(); now.setToNow();
			 * before.setToNow();
			 */
			int userFoundCounter=0;
			for (int counter = thingsToFind.length - 1; counter >= 0; counter--) {// while
																					// (counter>=1){
				// ((TextView)findViewById(R.id.text1)).setText(thingsYouSaid.get(0)+" NotFound"
				// +counter+thingsToFind[counter]);
				if (thingYouSaid.contains(thingsToFind[counter])) {// .matches(thingsToFind[counter])){
					// OK there is a string and we are looking for inside what
					// user
					// says
					userFoundCounter++;
					Log.d("input", "Find " + thingsToFind[counter]);
					String c = "";// "___________________________________________________________________________________";

					// thingsToFind[counter];
					// c.replace(, '_')
					// char replace='_';
					// char[] chars=new char[thingsToFind[counter].length()];
					// chars[]={'_'};
					for (int i = 0; i < thingsToFind[counter].length(); i++) {
						// chars[i]='_';
						c = c.concat("_");
					}

					// warning thingCleaned is a representation where words are
					// consumed //thingYouSaid was cleaned before
					thingCleaned = thingCleaned.replace(thingsToFind[counter],
							c);// thingsToFind[counter].length());
					Log.d("input",
							"Find " + thingsToFind[counter] + " in "
									+ c.toString() + " thingCleaned "
									+ thingCleaned);

					// searching the view to print in
					//((TextView) findViewById(R.id.text1)).setTextSize( (float)10* ((TextView)findViewById(R.id.text1)).getTextSize());
					//((TextView) findViewById(R.id.text1)).setText(thingYouSaid);
					ImageView qImageView = (ImageView) findViewById(R.id.imageView1);

					// qImageView.setImageResource(R.drawable.france);
					// qImageView.setImageResource(Drawable.createFromStream(null,
					// "R.drawable.france") );//R.drawable.);
					// String uri = "@drawable/france.png";
					// qImageView.geti
					// qImageView.setImageResource("@drawable/france.png");
					// String uri ="R.drawable.france";

					int res = getResources()
							.getIdentifier(thingsToFind[counter], "drawable",
									getPackageName());
					// now just take the fund string to create your resource
					// name
					// and get its Id in "res" to print after
					if (res != 0) {// if a picture with this name exist
						// push the picture
						qImageView.setImageResource(res);
						// this.addBigImageViews(hscrollLayout2,res);//ok basic
						// Words2ImageResult actualWords2ImageResult=new
						// Words2ImageResult();
						this.refreshList(hscrollLayout2, res,
								thingYouSaid.indexOf(thingsToFind[counter]),
								thingsToFind[counter].length(),thingsToFind[counter]);
						
						//userFoundList[userFoundCounter]=thingsToFind[counter];
						//userFoundCounter++;
						
						
						int lastfind = thingYouSaid
								.indexOf(thingsToFind[counter]);
						// userFoundCounter=0;
						while (thingYouSaid.lastIndexOf(thingsToFind[counter]) != thingYouSaid
								.indexOf(thingsToFind[counter], lastfind)) {
							if (thingYouSaid.substring(lastfind + 1).contains(
									thingsToFind[counter])) {
								lastfind = thingYouSaid.indexOf(
										thingsToFind[counter], lastfind + 1);// .indexOf(thingsToFind[counter]);
								this.refreshList(hscrollLayout2, res,
										thingYouSaid
												.indexOf(thingsToFind[counter],
														lastfind),
										thingsToFind[counter].length(),thingsToFind[counter]);
								//userFoundList[userFoundCounter]=thingsToFind[counter];
								//userFoundCounter++;
								//TODO
								//userFoundList[lastfind]=thingsToFind[counter];
							}
							
							
							/*
							 * else{
							 * lastfind=thingYouSaid.lastIndexOf(thingsToFind
							 * [counter ]);
							 * this.refreshList(hscrollLayout2,res,thingYouSaid
							 * .indexOf (
							 * thingsToFind[lastfind]),thingsToFind[counter
							 * ].length( ));
							 * 
							 * }
							 */

						}//while
						//userFoundList[userFoundCounter]=thingsToFind[counter];
						//userFoundCounter++;
						
						// this.refreshList(hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]),thingsToFind[counter].length());
						// this.refreshList(hscrollLayout2,res,thingYouSaid.lastIndexOf(thingsToFind[counter]),thingsToFind[counter].length());

						// actualWords2ImageResult.imageID=0;
						// actualWords2ImageResult.wordsPosition=0;
						// actualWords2ImageResult.wordLength=0;
						// this.addBigImageViews2(hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]));//ok
						// basic

						// thingYouSaid.indexOf(thingsToFind[counter]);
						// thingsToFind[counter].length());

						// this.addDelayedBigImageViews(hscrollLayout2,res);

						// this.addDelayedBigImageViews(hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]),thingsToFind[counter].length());
						// this.addAnotherNewOrganizedDelayedBigImageViews(hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]),thingsToFind[counter].length());
						// this.updateDelayedBigImageViews();
					}

					else {// not existing picture but an existing word in
							// wordsearchList
							// search=maison;
							// searchRequestStart="https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=";
							// //+search+
							// searchRequestEnd="&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
							// ;
							// linkStart="https://encrypted-tbn1.gstatic.com/" ;
							// linkEnd="width";
							// charBack=2 ;
						if (debug>1)	Toast.makeText(
								getApplicationContext(),
								"onResult"
										+ thingYouSaid
										+ "not existing picture but an existing word in wordsearchList ",
								Toast.LENGTH_SHORT).show();
						if (bWebActivated) {
							/*
							 * try { advancedDownload( true,
							 * thingsToFind[counter].toString(), "", ".jpg",
							 * "https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq="
							 * ,
							 * "&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
							 * , "https://encrypted-tbn1.gstatic.com/", "width",
							 * 2, ""); } catch (InterruptedException e) {
							 * 
							 * e.printStackTrace(); Log.e("OnActivity Result",
							 * e.toString() +
							 * "  while res=0  during thingsToFind[" + counter +
							 * "]" + thingsToFind[counter] .toString() +
							 * "!!!!!dangerous may load everytime a file in A directory but looking in B directory to decide"
							 * );
							 * 
							 * }// download pictures within wordlist //
							 * dangerous may load everytime a file in A //
							 * directory // but looking in B directory to decide
							 */
						}
					}

					// int imageResource = getResources().getIdentifier(uri,
					// null,
					// getPackageName());
					// Drawable res = getResources().getDrawable(imageResource);
					// // int tempId=getResources().getInteger(id);
					// qImageView.setImageResource(res);
					// qImageView.setImageDrawable(res);
					// hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]),thingsToFind[counter].length());

					/*
					 * if (counter==0) {
					 * qImageView.setImageResource(R.drawable.defense_fumer); }
					 */
				} else {
					// ImageView qImageView = (ImageView)
					// findViewById(R.id.imageView1);
					// qImageView.setImageResource(R.drawable.a);
				}// else

			}// for///////////////////////////////////////////////////////////////////////////////////////////

			// this.updateDelayedBigImageViews();//hscrollLayout2,res,thingYouSaid.indexOf(thingsToFind[counter]),thingsToFind[counter].length());
			/*
			 * String uri = "@drawable/myresource.png";
			 * 
			 * int imageResource = getResources().getIdentifier(uri, null,
			 * getPackageName());
			 * 
			 * imageview= (ImageView)findViewById(R.id.imageView); Drawable res
			 * = getResources().getDrawable(imageResource);
			 * imageView.setImageDrawable(res);
			 */
			// updateDelayedBigImageViews();
			
			if ( (userFoundCounter==0)){//actualWords2ImageResultList[0].word=="")){
				
				if(AutoHideActivated){
					(findViewById(R.id.horizontalScrollView2)).setVisibility(View.GONE);
				}
					
			}
			else{
				showListOnBigImageViews(actualWords2ImageResultList);
				if(SecurityActivated)(findViewById(R.id.horizontalScrollView2)).setVisibility(View.VISIBLE);
			}
				
				
				
			// /////////////////////////////////////////////////////////////////////////////////////////////

		}// Flag SecurityActivated

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Creating the layout parameter for Google Images

		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);

		for (int foundWord = 0; foundWord < wordsYouSaidCounter; foundWord++) {
			
			String fileFullPathString=Environment.getExternalStorageDirectory()
					+ File.separator + "hexasense" + File.separator
					+ "fr" + File.separator
					+ wordsYouSaid[foundWord] + ".jpg";
			
			File file = new File(fileFullPathString);
				/*Environment.getExternalStorageDirectory()
					+ File.separator + "hexasense" + File.separator
					+ "fr" + File.separator
					+ wordsYouSaid[foundWord] + ".jpg");*/
			
			
			if (!file.exists()) {
				fileFullPathString=Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense" + File.separator
						+ File.separator
						+ wordsYouSaid[foundWord] + ".jpg";
				file = new File(fileFullPathString);
				}
			
			
			if (GoogleActivated) {
				if (file.exists()) {
					// advancedDownload(wordsYouSaid[foundWord]);
					
					//lparams.height = LayoutParams.MATCH_PARENT;
					if ( imageSizePref>0)lparams.height=imageSizePref;
					
					
					//lparams.width = lparams.height + 200;
					lparams.width = lparams.height ;

					ImageView btnImageView4 = new ImageView(this);
					
					btnImageView4.setLayoutParams(lparams);
					// lparams.height=100;
					// lparams.width=100;//LayoutParams.MATCH_PARENT;//LayoutParams.WRAP_CONTENT*2;//
					// lparams.height=LayoutParams.MATCH_PARENT;
					// lparams.height=LayoutParams.MATCH_PARENT;
					// lparams.width=lparams.height*2;
					btnImageView4.setScaleType(ScaleType.FIT_XY);// FIT_CENTER);//.CENTER_CROP);//.CENTER_INSIDE);//.FIT_XY);
					// btnImageView4.setBackgroundResource(
					// words2ImageResult[i].imageID);
					
					rotateFromEXIF(btnImageView4,wordsYouSaid[foundWord]);
					
					/////////////////////////////////
					
					
					Log.v("setGoogleImageBitmap", "" + wordsYouSaid[foundWord]);
					btnImageView4.setImageBitmap(
					// Environment.getExternalStorageDirectory()+File.separator+"hexasense"
					// +File.separator + wordsYouSaid[foundWord]+".jpg"
							BitmapFactory.decodeFile(fileFullPathString));
							/*Environment
									.getExternalStorageDirectory()
									+ File.separator
									+ "hexasense"
									+ File.separator
									+ wordsYouSaid[foundWord]
									+ ".jpg"));*/
					Log.d("trying to print", Environment
							.getExternalStorageDirectory().getAbsolutePath()
							.toString()
							+ File.separator
							+ "hexasense"
							+ File.separator
							+ wordsYouSaid[foundWord] + ".jpg");

					btnImageView4
							.setContentDescription(wordsYouSaid[foundWord]);

					btnImageView4.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							// Toast.makeText(getApplicationContext(),
							// "clickon Image"+hscrollLayout5.getChildCount(),
							// Toast.LENGTH_SHORT).setView(v);

							Toast.makeText(
									getApplicationContext(),
									"clickon Image" + v.getContentDescription()
											+ " " + v.toString(),
									Toast.LENGTH_SHORT).show();

						}
					});
					
					registerForContextMenu(btnImageView4);
				
					
					//Works but interfer with context menu
					btnImageView4
							.setOnLongClickListener(new OnLongClickListener() {

								@Override
								public boolean onLongClick(View v) {
									/*File file;
									file = new File(Environment
											.getExternalStorageDirectory()
											+ File.separator
											+ "hexasense"
											+ File.separator
											+ v.getContentDescription()
											+ ".jpg");

									showFileChooser();
									*/
									lastOnMediaLongClick = v
											.getContentDescription().toString();// v.getContentDescription.;
									
									
									
									
									/*
									 * Erase the old File and make a photo to
									 * replace it if
									 * (file.exists())file.delete();
									 * getPhoto(Environment
									 * .getExternalStorageDirectory() +
									 * File.separator + "hexasense" +
									 * File.separator
									 * +v.getContentDescription()+".jpg");
									 * 
									 * Toast.makeText(getApplicationContext(),
									 * "Long click on Image: "
									 * +v.getContentDescription
									 * ()+"    toString "+v.toString(),
									 * Toast.LENGTH_SHORT).show();
									 */
					
					
								return false;
								}
							});

					// hScrollLayout5.addView(btnImageView4, 0);
					// hscrollLayout5.setVisibility(1);
					// hscrollView5.setVisibility(1);
					
					
					RelativeLayout imageRL =new RelativeLayout(this);
					//ImageView btnImageView4 = new ImageView(this);

					imageRL.setLayoutParams(lparams);
					//btnImageView4.setLayoutParams(lparams);
					TextView imageTV=new TextView(this);
					imageTV.setLayoutParams(lparams);
					imageTV.setText(" "+wordsYouSaid[foundWord]);
					
					TextView imageTV2=new TextView(this);
					imageTV2.setLayoutParams(lparams);
					imageTV2.setText(" "+wordsYouSaid[foundWord]);
					imageTV2.setHintTextColor(Color.WHITE);		
					imageTV2.setTextColor(Color.WHITE);	
					imageTV2.setScaleX((float)1.05);
					imageTV2.setScaleY((float)1.05);
			
					
					
					//BigText
					TextView imageTV3=new TextView(this);
					imageTV3.setLayoutParams(lparams);
					imageTV3.setText(" "+wordsYouSaid[foundWord]);
					imageTV3.setTextSize((float)(imageTV2.getTextSize()*2.0));
					imageTV3.setTextColor(Color.WHITE);
					imageTV3.setAlpha((float) 0.8);
					
					TextView imageTV4=new TextView(this);
					imageTV4.setLayoutParams(lparams);
					imageTV4.setText(" "+wordsYouSaid[foundWord]);
					imageTV4.setTextSize((float)(imageTV2.getTextSize()*1.9));
					//imageTV4.setTextColor(Color.WHITE);
					imageTV4.setAlpha((float) 0.2);
					
					imageRL.addView(btnImageView4);
					imageRL.addView(imageTV3);
					imageRL.addView(imageTV4);
						
					imageRL.addView(imageTV2);
					imageRL.addView(imageTV);
					
					//imageTV2.bringToFront();
					//imageTV.bringToFront();
					
					hscrollLayout5.addView(imageRL,hscrollLayout5.getChildCount());
					
					//original wihtout relative layout
					//hscrollLayout5.addView(btnImageView4,
					//hscrollLayout5.getChildCount());
					
					// hscrollLayout2.addView(btnImageView4, 0);
					// hscrollLayout0.addView(btnImageView4, 0);
					// download it

				}

				// Do somehting
				else {
					if (isOnline() && bWebActivated) {

						// search=maison;
						// searchRequestStart="https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=";
						// //+search+
						// searchRequestEnd="&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
						// ;
						// linkStart="https://encrypted-tbn1.gstatic.com/" ;
						// linkEnd="width";
						// charBack=2 ;
						try {
							if (debug>1)Toast.makeText(
									getApplicationContext(),
									"onResult"
											+thingYouSaid+" :   " +wordsYouSaid[foundWord]
											+ "not existing picture: downloading!",
									Toast.LENGTH_SHORT).show();
						
							//safeSearchOn
							//safe=active&
							//https://www.google.com/search?safe=active&site=&tbm=isch&source=hp&biw=1280&bih=737&q=le
							//https://www.google.com/setprefs?safeui=on&sig=0_EVIG9EwSjr0dzC9neeioTyjaIRk%3D&prev=https://www.google.com/search?biw%3D1280%26bih%3D737%26tbm%3Disch%26q%3Dle%26oq%3Dle%26gs_l%3Dimg.3...0.0.0.6778.0.0.0.0.0.0.0.0..0.0....0...1c..53.img..0.0.0.tCzG74xWTiY%26bav%3Don.2,or.r_cp.r_qf.%26bvm%3Dbv.75775273,d.d2s,pv.xjs.s.fr.75dLYdktc4I.O%26dpr%3D1
							
							//www.google.com/search?   parameters  as_st=y & tbm=isch & as_q= & as_epq=", 										"&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl
							//image Size izs
							//tbs=izs:l   large image
							//tbs=izs:m   medium image
							//tbs=izs:i   icon image
							//safe=active safesearch
							//image Type itp
							//face photo clipart lineart animated
							// image Color ic
							//color gray trans (transparent
							//image Time  qdr
							//d (day)  w(week)
							//Image Licence sur
							//fmc Labeled for reuse with modification
							//fc Labeled for reuse
							//fm Labeled for noncommercial reuse with modification
							//f Labeled for noncommercial reuse
							if (SafeSearchActivated){
							advancedDownload(
									true,
									wordsYouSaid[foundWord],
									"",
									".jpg",
									"https://www.google.com/search?safe=active&as_st=y&tbm=isch&as_q=&as_epq=",
									"&as_oq=&as_eq=&cr=&as_sitesearch=&tbs=isz:m&gws_rd=ssl",
									"https://encrypted-tbn1.gstatic.com/",
									"width", 2, "");
							
							}else{
								//no safeSearch.
								advancedDownload(
										true,
										wordsYouSaid[foundWord],
										"",
										".jpg",
										"https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=",
										"&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl",
										"https://encrypted-tbn1.gstatic.com/",
										"width", 2, "");
								
								
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}// download pictures within wordlist

						// advancedDownload(wordsYouSaid[foundWord]);

						final ImageView btnImageView4 = new ImageView(this);
						// lparams.height
						// lparams.height=500;
						lparams.height = LayoutParams.MATCH_PARENT;
						lparams.width = LayoutParams.MATCH_PARENT;
						btnImageView4.setScaleType(ScaleType.FIT_XY);
						btnImageView4.setLayoutParams(lparams);

						// btnImageView4.setBackgroundResource(
						// words2ImageResult[i].imageID);
						final String fullImageLink = Environment
								.getExternalStorageDirectory()
								.getAbsolutePath().toString()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+ wordsYouSaid[foundWord] + ".jpg";

						Log.d("trying to print", Environment
								.getExternalStorageDirectory()
								.getAbsolutePath().toString()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+ wordsYouSaid[foundWord] + ".jpg");

						btnImageView4.setImageBitmap(
						// Environment.getExternalStorageDirectory()+File.separator+"hexasense"
						// +File.separator + wordsYouSaid[foundWord]+".jpg"
								BitmapFactory.decodeFile(fullImageLink));// post
																			// or
																			// not
																			// post???
						/*
						 * btnImageView4.post(new Runnable() { public void run()
						 * {
						 * 
						 * btnImageView4.setImageBitmap(
						 * //Environment.getExternalStorageDirectory
						 * ()+File.separator+"hexasense" +File.separator +
						 * wordsYouSaid[foundWord]+".jpg"
						 * BitmapFactory.decodeFile( fullImageLink));
						 * 
						 * } });
						 */
						// hScrollLayout5.addView(btnImageView4, 0);
						// hscrollLayout5.setVisibility(1);
						// hscrollView5.setVisibility(1);

						// hscrollLayout2.addView(btnImageView4, 0);
						// hscrollLayout0.addView(btnImageView4, 0);
						RelativeLayout imageRL =new RelativeLayout(this);
						//ImageView btnImageView4 = new ImageView(this);

						imageRL.setLayoutParams(lparams);
						//btnImageView4.setLayoutParams(lparams);
						TextView imageTV=new TextView(this);
						imageTV.setLayoutParams(lparams);
						imageTV.setText(" "+wordsYouSaid[foundWord]);
						
						TextView imageTV2=new TextView(this);
						imageTV2.setLayoutParams(lparams);
						imageTV2.setText(" "+wordsYouSaid[foundWord]);
						imageTV2.setHintTextColor(Color.WHITE);		
						imageTV2.setTextColor(Color.WHITE);	
						imageTV2.setScaleX((float)1.05);
						imageTV2.setScaleY((float)1.05);
				
						
						
						//BigText
						TextView imageTV3=new TextView(this);
						imageTV3.setLayoutParams(lparams);
						imageTV3.setText(" "+wordsYouSaid[foundWord]);
						imageTV3.setTextSize((float)(imageTV2.getTextSize()*2.0));
						imageTV3.setTextColor(Color.WHITE);
						imageTV3.setAlpha((float) 0.8);
						
						TextView imageTV4=new TextView(this);
						imageTV4.setLayoutParams(lparams);
						imageTV4.setText(" "+wordsYouSaid[foundWord]);
						imageTV4.setTextSize((float)(imageTV2.getTextSize()*1.9));
						//imageTV4.setTextColor(Color.WHITE);
						imageTV4.setAlpha((float) 0.2);
						
						imageRL.addView(btnImageView4);
						imageRL.addView(imageTV3);
						imageRL.addView(imageTV4);
							
						imageRL.addView(imageTV2);
						imageRL.addView(imageTV);
						
						//imageTV2.bringToFront();
						//imageTV.bringToFront();
						
						hscrollLayout5.addView(imageRL,hscrollLayout5.getChildCount());
						
						//hscrollLayout5.addView(btnImageView4,	hscrollLayout5.getChildCount());// post or not
																// post???
						/*
						 * hscrollLayout5.post(new Runnable() { public void
						 * run() {
						 * 
						 * hscrollLayout5.addView(btnImageView4,hscrollLayout5.
						 * getChildCount());
						 * 
						 * } });
						 */

					}// online download it
				}// if File Exist
			}// If Google Activated

			if (SLVideoActivated) {
				// /////////////Video
				
				String videoFileFullPathString=Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense/video/fr";
				file = new File(videoFileFullPathString);//Environment.getExternalStorageDirectory()+ File.separator + "hexasense/video");
				if (!file.isDirectory())file.mkdir();
				

				videoFileFullPathString=Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense/video/fr"+ File.separator
						+ wordsYouSaid[foundWord] + ".mp4";
				file = new File(videoFileFullPathString);
				//Environment.getExternalStorageDirectory()
						//+ File.separator + "hexasense/video/" + File.separator
						//+ wordsYouSaid[foundWord] + ".mp4");
				
				if (!file.exists()){
					videoFileFullPathString=Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense/video"+ File.separator
						+ wordsYouSaid[foundWord] + ".mp4";
				file = new File(videoFileFullPathString);
				}
				
				if (file.exists()) {
					// addVideoViewFromPath(Environment.getExternalStorageDirectory().getAbsolutePath()
					// +"/"+"hexasense/video/"+wordsYouSaid[foundWord]+".mp4"
					// );//ok
					// mediaPlayer.star
					Log.d("trying to print video", Environment
							.getExternalStorageDirectory().getAbsolutePath()
							.toString()
							+ File.separator
							+ "hexasense/video"
							+ File.separator + wordsYouSaid[foundWord] + ".mp4");

					// signLanguageVideo[]=Environment.getExternalStorageDirectory().getAbsolutePath().toString()
					// +File.separator+"hexasense/video" +File.separator +
					// wordsYouSaid[foundWord]+".mp4"

					String[] tempSignLanguageVideo;

					if (signLanguageVideo == null) {
						// tempSignLanguageVideo= new
						// String[signLanguageVideo.length];
						// signLanguageVideoCounter
						// signVideosignLanguageVideoCounter
						// tempSignLanguageVideo=signLanguageVideo;
						signLanguageVideo = new String[1];
						signLanguageVideo[0] =videoFileFullPathString; 
								/*Environment
								.getExternalStorageDirectory()
								.getAbsolutePath()
								+ "/"
								+ "hexasense/video/"
								+ wordsYouSaid[foundWord] + ".mp4";// wordsYouSaid[foundWord];
						 */
						Uri video = Uri.parse("android.resource://" + getPackageName() + "/" 
								+ R.raw.ateraction); //do not add any extension
								//if your file is named xxx.mp4 and placed in /raw
								//use R.raw.xxx
						
						addVideoViewFromPath(video.toString());//Environment
						/*		.getExternalStorageDirectory()
								.getAbsolutePath()
								+ "/"
								+ "hexasense/video/"
								+ "ateraction"
								+ ".mp4");*/
						
						// ok);
						
						
						//Environment.getExternalStorageDirectory().getAbsolutePath()
											// +"/"+"hexasense/video/"+wordsYouSaid[foundWord]+".mp4"
											// );//ok
						
						
						
					} else {

						// signLanguageVideo=new String[1];
						// signLanguageVideo[0]=Environment.getExternalStorageDirectory().getAbsolutePath()
						// +"/"+"hexasense/video/"+wordsYouSaid[foundWord]+".mp4"
						// ;//ok
						tempSignLanguageVideo = new String[signLanguageVideo.length];
						tempSignLanguageVideo = signLanguageVideo;

						signLanguageVideo = new String[tempSignLanguageVideo.length + 1];
						for (int j = 0; j < tempSignLanguageVideo.length; j++) {
							signLanguageVideo[j] = tempSignLanguageVideo[j];

						}
						signLanguageVideo[tempSignLanguageVideo.length] =videoFileFullPathString;
						/*Environment
								.getExternalStorageDirectory()
								.getAbsolutePath()
								+ "/"
								+ "hexasense/video/"
								+ wordsYouSaid[foundWord] + ".mp4";*/
					}

				}// if File exist
					// else Do somehting file Download
				else {
					if (isOnline() && bWebActivated) {
						// search=maison;
						// searchRequestStart="https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=";
						// //+search+
						// searchRequestEnd="&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
						// ;
						// linkStart="https://encrypted-tbn1.gstatic.com/" ;
						// linkEnd="width";
						// charBack=2 ;

						// addVideoViewFromPath("http://www.elix-lsf.fr/IMG/mp4/parapluie_nm_1_1-encoded.mp4");
						// /
						// http://www.elix-lsf.fr/IMG/mp4/parapluie_nm_1_1-encoded.mp4?1361395574
						// addVideoViewFromPath("http://www.elix-lsf.fr/IMG/mp4/"+wordsYouSaid[foundWord]+"_nm_1_1-encoded.mp4");//Environment.getExternalStorageDirectory().getAbsolutePath()
						// +"/"+"hexasense/"+wordsYouSaid[foundWord]+".jpg"
						// );//ok);//Environment.getExternalStorageDirectory().getAbsolutePath()
						// +"/"+"hexasense/video/"+wordsYouSaid[foundWord]+".mp4"
						// );//ok

						/*
						 * File mp4; mp4=new
						 * File("http://www.elix-lsf.fr/IMG/mp4/" +wordsYouSaid
						 * [foundWord]+"_nm_1_1-encoded.mp4"); ///if
						 * (exists("http://www.elix-lsf.fr/IMG/mp4/"
						 * +wordsYouSaid[foundWord]+"_nm_1_1-encoded.mp4")){
						 * String addr
						 * ="http://www.elix-lsf.fr/IMG/mp4/"+wordsYouSaid
						 * [foundWord ]+"_nm_1_1-encoded.mp4";
						 */

						/*
						 * try{ addVideoViewFromPath(addr);} catch (Exception
						 * e1) { // TODO Auto-generated catch block
						 * addVideoViewFromPath(
						 * "http://www.elix-lsf.fr/IMG/mp4/"
						 * +wordsYouSaid[foundWord]+"_nm_1_1-encoded.mp4");
						 * e1.printStackTrace(); }
						 */

						/*
						 * try{ addVideoViewFromPath(
						 * "http://www.elix-lsf.fr/IMG/mp4/"
						 * +wordsYouSaid[foundWord ]+"_nm_1_1-encoded.mp4");;}
						 * catch (Exception e1) { // TODO Auto-generated catch
						 * block //addVideoViewFromPath
						 * ("http://www.elix-lsf.fr/IMG/mp4/"+wordsYouSaid
						 * [foundWord]+"_nm_1_1-encoded.mp4");
						 * e1.printStackTrace(); }
						 */

						// downloader.downloadFromUrl(fStr,
						// saveDir+search+saveType);

						/*
						 * Downloader downloader =new Downloader();
						 * downloader.downloadFromUrl(addr,
						 * Environment.getExternalStorageDirectory
						 * ().getAbsolutePath()
						 * +"/"+"hexasense/video/"+wordsYouSaid
						 * [foundWord]+".mp4"
						 * );//ok);//Environment.getExternalStorageDirectory ().
						 * getAbsolutePath()
						 * +"/"+"hexasense/video/"+wordsYouSaid
						 * [foundWord]+".mp4" );//ok
						 */

						/*
						 * if (mp4.exists()){
						 * 
						 * addVideoViewFromPath(
						 * "http://www.elix-lsf.fr/IMG/mp4/"+
						 * wordsYouSaid[foundWord]+"_nm_1_1-encoded.mp4");
						 * }//Environment
						 * .getExternalStorageDirectory().getAbsolutePath()
						 * +"/"+"hexasense/"+wordsYouSaid[foundWord]+".jpg"
						 * );//ok);/ /Environment.getExternalStorageDirectory
						 * ().getAbsolutePath ()
						 * +"/"+"hexasense/video/"+wordsYouSaid
						 * [foundWord]+".mp4" );//ok
						 * 
						 * else{ mp4=new File("http://www.elix-lsf.fr/IMG/mp4/"
						 * +wordsYouSaid [foundWord]+"_v_1_1-encoded.mp4"); if
						 * (exists(mp4.getPath(
						 * )))addVideoViewFromPath(mp4.getPath());
						 * 
						 * else{ mp4=new File("http://www.elix-lsf.fr/IMG/mp4/"
						 * +wordsYouSaid [foundWord]+"_nf_1_1-encoded.mp4"); if
						 * (exists(mp4.getPath
						 * ()))addVideoViewFromPath(mp4.getPath()); else{
						 * //http://www
						 * .elix-lsf.fr/IMG/mp4/beau_adj_1_1_-_copie
						 * -encoded.mp4 mp4=new
						 * File("http://www.elix-lsf.fr/IMG/mp4/" +wordsYouSaid
						 * [foundWord]+"_adj_1_1_-_copie-encoded.mp4"); if
						 * (exists(mp4
						 * .getPath()))addVideoViewFromPath(mp4.getPath());
						 * else{ //http ://www.lsf-bordeaux.fr/images/video/pays
						 * /afrique.mp4 mp4=new
						 * File("http://www.lsf-bordeaux.fr/images/video/pays/"
						 * +wordsYouSaid[foundWord]+".mp4"); if
						 * (exists(mp4.getPath()
						 * ))addVideoViewFromPath(mp4.getPath());
						 * else{//http://www.lsf
						 * -bordeaux.fr/images/video/pays/afrique.mp4 mp4=new
						 * File(
						 * "http://www.lsf-bordeaux.fr/images/video/villes/"
						 * +wordsYouSaid[foundWord]+".mp4"); if
						 * (exists(mp4.getPath()
						 * ))addVideoViewFromPath(mp4.getPath()); else{
						 * //http://www.lsf-bordeaux.fr/images/video/travail
						 * mp4=new File(
						 * "http://www.lsf-bordeaux.fr/images/video/travail/" +
						 * wordsYouSaid[foundWord]+".mp4"); if
						 * (exists(mp4.getPath())
						 * )addVideoViewFromPath(mp4.getPath()); else{
						 * //http://www.lsf
						 * -bordeaux.fr/images/video/villes/afrique.mp4 mp4=new
						 * File( "http://www.lsf-bordeaux.fr/images/video/mois/"
						 * +wordsYouSaid [foundWord]+".mp4"); if
						 * (exists(mp4.getPath()))addVideoViewFromPath
						 * (mp4.getPath()); else{ mp4=new
						 * File("http://www.lsf-bordeaux.fr/images/video/mois/"
						 * +wordsYouSaid[foundWord]+".mp4"); if
						 * (exists(mp4.getPath()
						 * ))addVideoViewFromPath(mp4.getPath()); else{
						 * 
						 * // addVideoViewFromPath(mp4.getPath());
						 * Toast.makeText(getApplicationContext
						 * (),"Video"+wordsYouSaid[foundWord]+
						 * "NotFound on provider direct list " +mp4.getPath(),
						 * Toast.LENGTH_LONG ).show(); } }
						 * 
						 * }
						 * 
						 * 
						 * 
						 * }
						 * 
						 * 
						 * } }
						 * 
						 * }
						 * 
						 * 
						 * } }
						 */

						/*
						 * Toast.makeText( getApplicationContext(),
						 * "Processing: Data not available: download    " +
						 * thingYouSaid + "downloading " +
						 * "http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche="
						 * + wordsYouSaid[foundWord] + " into file " + "video/"
						 * + wordsYouSaid[foundWord] + ".mp4 " +
						 * "searching start with " +
						 * "spip.php?page=signes&amp;id_article=" +
						 * "ending with " + "title" + "2" +
						 * "http://www.elix-lsf.fr/", Toast.LENGTH_LONG).show();
						 */

						Log.d("Before downloading VideoFile provider PageList",
								"http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche="
										+ wordsYouSaid[foundWord]
										+ " into file"
										+ "video/"
										+ wordsYouSaid[foundWord]
										+ ".mp4"
										+ "searching start with "
										+ "spip.php?page=signes&amp;id_article="
										+ "ending with " + "title" + "2"
										+ "http://www.elix-lsf.fr/");

						Boolean bDownloadStarted = true;
						try {
							// First video download getting the resultList page
							advancedDownload(
									false,
									wordsYouSaid[foundWord],
									"video/",
									".txt",
									"http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche=",
									"", "spip.php?page=signes&amp;id_article=",
									"title", 2, "http://www.elix-lsf.fr/");
						} catch (InterruptedException e1) {

							e1.printStackTrace();
							Log.e("advancedDownload Try Fail ",
									"error" + e1.toString());
							bDownloadStarted = false;
						}

						//writing to the resultListPageFile
						
						File sdCard = Environment.getExternalStorageDirectory();
						File dir = new File(sdCard.getAbsolutePath() + "/"
								+ "hexasense/video/");// "/Hexasense");
						dir.mkdirs();
						File resultListPageFile = new File(dir,
								wordsYouSaid[foundWord] + ".txt");// "hexasense.mp4");//

						// while
						// ((bDownloadStarted!=false)&&(resultListPageFile.length()<=0)){Log.v("Waiting File Download",""
						// );}

						try {
							
							this.getApplication().getMainLooper().getThread()
									.sleep(500);
							// Not Correct but for downloadTime
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							Log.e("error on proccess Request"," while trying to sleep(500) the MainLooper" +e1.hashCode());
							e1.printStackTrace();
						}

						Log.d("OK downloading VideoFile provider",
								"linkInside.toString()" + linkInside.toString()
										+ " " + linkInside + " lastLinkInside "
										+ lastLinkInside);
						// Toast.makeText(getBaseContext(), , duration)

						Boolean download = true;
						// Toast.makeText(getApplicationContext(),"downloading "+lastLinkInside,
						// Toast.LENGTH_SHORT ).show();
						if (lastLinkInside == "") {
							lastLinkInside = "http://www.elix-lsf.fr/spip.php?page=signes&id_article=137586";
							/*
							 * Toast.makeText( getApplicationContext(),
							 * "downloading lastLinkInside=null  replaced by" +
							 * lastLinkInside, Toast.LENGTH_SHORT).show();
							 */
						} else {
							try {
								/*
								 * Toast.makeText( getApplicationContext(),
								 * "onResult" + thingYouSaid + "downloading " +
								 * "http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche="
								 * + wordsYouSaid[foundWord] + " into file" +
								 * "video/" + wordsYouSaid[foundWord] + ".mp4" +
								 * "searching start with " +
								 * "spip.php?page=signes&amp;id_article=" +
								 * "ending with " + "title" + "2" +
								 * "http://www.elix-lsf.fr/",
								 * Toast.LENGTH_SHORT).show();
								 */

								advancedDownload(download,
										wordsYouSaid[foundWord], "video/",
										".mp4", lastLinkInside, "",
										"https://www.elix-lsf.fr/IMG/mp4/",
										".mp4", 0, "");
							} catch (InterruptedException e) {
								Log.e(e.toString(), wordsYouSaid[foundWord]);
								e.printStackTrace();
							}// download pictures within wordlist

							// if (needDownload)processRequest(lastRequest);

						}

						// exctract from bonjour
						/*
						 * advancedDownload(true,
						 * wordsYouSaid[foundWord],"video/",".mp4",
						 * "http://www.elix-lsf.fr/spip.php?page=signes&id_article=137586"
						 * , "","https://www.elix-lsf.fr/IMG/mp4/",".mp4",0,""
						 * );//download pictures within wordlist
						 */

						// https://www.elix-lsf.fr/IMG/mp4/00079-2-encoded.mp4"

						// advancedDownload(
						// wordsYouSaid[foundWord],"video/",".mp4",linkInside.toString(),"","https://encrypted-tbn1.gstatic.com/","width",2);//download
						// pictures within wordlistlinkInside
						// <a
						// href="spip.php?page=signes&amp;id_article=178849"
						// title="Aller au signe"><img
						// src="plugins/sds/css/img/bouton_signe.png"
						// alt="Signe"
						// height="30" width="30">
						// <span>Signe</span>
						// </a>

						// spip.php?page=signes&amp;id_article=178849" title="Aller
						// au signe">

						// advancedDownload(wordsYouSaid[foundWord]);

						// addVideoViewFromPath(Environment.getExternalStorageDirectory().getAbsolutePath()
						// +"/"+"hexasense/video/"+wordsYouSaid[foundWord]+".mp4"
						// );//ok

						Log.d("trying to print video", Environment
								.getExternalStorageDirectory()
								.getAbsolutePath().toString()
								+ File.separator
								+ "hexasense/video"
								+ File.separator
								+ wordsYouSaid[foundWord]
								+ ".mp4");

					}// online so download it
				}// file exist or not

			}// SLVideoActivated
		}// for all Words
		if (GoogleActivated){if (AutoScrollActivated)startAutoScrolling(hscrollView5);}
	}// process Request

	@Override
	 public void onCreateContextMenu(ContextMenu menu, View v,
	   ContextMenuInfo menuInfo) {
	  super.onCreateContextMenu(menu, v, menuInfo);
	  menu.setHeaderTitle("Medias Options");
	  //menu.menu.FLAG_ALWAYS_PERFORM_CLOSE
	  menu.setHeaderIcon(android.R.drawable.ic_menu_report_image);//s.setFinishOnTouchOutside(true);
	  setFinishOnTouchOutside(true);
	  if (v.getId()==videoLayout.getId()){
		  menu.add(0, v.getId(), 20, "ChangeVideo").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		  //menu.add("loadList").setIcon(android.R.drawable.btn_dialog).setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
	  }else menu.add(0, v.getId(), 20, "Change").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
	  
	  if (v.getId()==videoLayout.getId()){
		 
		  menu.add(0, v.getId(), 22, "MakeVideo");
	  }
	  else menu.add(0, v.getId(), 21, "TakePhoto");
	 
	  if (v.getId()==videoLayout.getId()){
			 
		  menu.add(0, v.getId(), 22, "ValidateVideo");
	  }
	  else  menu.add("Validate");// menu.add(0, v.getId(), 21, "TakePhoto");
	 
	  
	  if (v.getId()==videoLayout.getId()){
		  menu.add(0, v.getId(), 24, "HideVideo");
	  }else menu.add(0, v.getId(), 23, "Hide");
	  
	 
	  //if (v.getId()!=videoLayout.getId())menu.add(0, v.getId(), 25, "AutoScroll");
	  
	  if (v.getId()==videoLayout.getId())menu.add(0, v.getId(), 26, "ReloadVideo");
	  else menu.add(0, v.getId(), 26, "ReloadImage");
	  
	  if (v.getId()==videoLayout.getId());
	  else{//menu.add(0, v.getId(), 26, "ReloadVideo");
	  menu.add(0, v.getId(), 27, "NormalSize").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);;
	  menu.add(0, v.getId(), 27, "MicroSize").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);;
	  menu.add(0, v.getId(), 27, "FullSize").setIcon(android.R.drawable.btn_dialog);//.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);;
		 	 
	  
	  }
	 }
	
	
	//This part is never used
	 @Override
	 public boolean onContextItemSelected(MenuItem item) {
	  if (item.getTitle() == "Action 1") {
	   
	   Toast.makeText(this, "Action 1 invoked", Toast.LENGTH_SHORT).show();
	  
	  } else if (item.getTitle() == "Action 2") {
	   Toast.makeText(this, "Action 2 invoked", Toast.LENGTH_SHORT).show();
	  } else if (item.getTitle() == "Action 3") {
	   Toast.makeText(this, "Action 3 invoked", Toast.LENGTH_SHORT).show();
	  } else {
	   return false;
	  }
	  return true;
	 }
	
	
	public static boolean exists(String URLName) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			// HttpURLConnection.setInstanceFollowRedirects(false);
			// note : you may also need
			// HttpURLConnection.setInstanceFollowRedirects(false)
			HttpURLConnection con = (HttpURLConnection) new URL(URLName)
					.openConnection();

			// con.connect();

			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isOnline() {
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnectedOrConnecting()) {
			return true;
		}
		return false;
	}

	String linkInside = "";
	String searchString = "";

	public void advancedDownload(final Boolean download, final String search,
			final String saveDir, final String saveType,
			final String searchRequestStart, final String searchRequestEnd,
			final String linkStart, final String linkEnd, final int charBack,
			final String linkBounce) throws InterruptedException {
		// search=maison;
		// searchRequestStart="https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=";
		// //+search+
		// searchRequestEnd="&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl"
		// ;
		// linkStart="https://encrypted-tbn1.gstatic.com/" ;
		// linkEnd="width";
		// charBack=2 ;

		// "http://commons.wikimedia.org/wiki/Maison?uselang=fr", "text.txt");

		// this.notifyAll();
		// this

		new Thread(new Runnable() {

			public void run() {
				try {
					if ((search != null) && (search != ""))
						run(search);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					Log.e("Exception " + e1.toString(),
							"while advanced download thread with search"
									+ search);
				}
				// return (1);
			}

			public void run(String search) {

				if (true) {// !isNetworkAvailable()){
					// Toast.makeText(getApplicationContext(), "no internet",
					// Toast.LENGTH_LONG).show();
					// return;
				}
				Log.v("l:"
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber(),
						"called from  "
								+ Thread.currentThread().getStackTrace()[1]
										.getLineNumber());
				Log.d("downloader thread run search" + search, "search"
						+ search);
				// mp4ToSd();
				File sdCard = Environment.getExternalStorageDirectory();
				File dir = new File(sdCard.getAbsolutePath() + "/"
						+ "hexasense/video/");// "/Hexasense");
				dir.mkdirs();
				File file = new File(dir, search + ".txt");// "hexasense.mp4");//
															// "hexasense.txt");
															// ;

				Downloader downloader = new Downloader();
				Log.d("downloader thread run search" + search, "");
				Object text = "";
				ByteArrayBuffer bab;
				Log.d("l:"
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber(),
						"called from  "
								+ Thread.currentThread().getStackTrace()[1]
										.getLineNumber());

				
				//TODO delete file ...text.txt ...text2.txt and  after search 
				if (lastLinkInside != "") {
					text = downloader.downloadFromUrl(lastLinkInside, search
							+ "text2.txt");
					Log.v("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(), "Last Link inside exist "
							+ lastLinkInside);
				} else {

					text = downloader.downloadFromUrl(searchRequestStart
							+ search + searchRequestEnd, search + "text.txt");// "http://commons.wikimedia.org/wiki/Maison?uselang=fr",
																				// "text.txt");
					Log.v("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(), "Last Link inside=null");
				}

				/*
				 * if (file.exists()&&file.canRead()){
				 * lastLinkInside=sdCard.getAbsolutePath()
				 * +"/"+"hexasense/video/"+search+".txt";
				 * linkInside=sdCard.getAbsolutePath()
				 * +"/"+"hexasense/video/"+search+".txt";
				 * 
				 * text =
				 * downloader.downloadFromUrl(linkInside,search+"text.txt");
				 * 
				 * 
				 * }else{
				 */

				// Downloader downloader =new Downloader();

				// downloader.downloadFromUrl("http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4",
				// "hexasense2.mp4");//fileName
				// downloader.downloadFromUrl("http://www.helloandroid.com/sites/all/themes/helloandroid/logo.png",
				// "hexasense2.png");//fileName
				// downloader.downloadFromUrl("http://commons.wikimedia.org/wiki/Maison?uselang=fr",
				// "text.txt");
				// String text=(String)

				// text =
				// downloader.downloadFromUrl(searchRequestStart+search+searchRequestEnd,search+"text.txt");//"http://commons.wikimedia.org/wiki/Maison?uselang=fr",
				// "text.txt");

				// }

				Log.d("downloader thread run search" + search, " text" + text);
				// text =
				// downloader.downloadFromUrl("https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq="+search+"&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl","text.txt");//"http://commons.wikimedia.org/wiki/Maison?uselang=fr",
				// "text.txt");
				bab = (ByteArrayBuffer) text;

				// String str = new String(bytes, "UTF-8");
				// String str=getOnline("http://www.example.com/script.php");
				// if
				// (text!=""){Log.v("reading","there is something in my text"+text.toString());}

				if (bab.length() >= 1)
					text = new String(bab.toByteArray()).trim();
				// Log.v("reading","there is something in my text"+text.toString());
				Log.d("l:"
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber() + "AdvancedDownload",
						"Last Link inside exist " + lastLinkInside);

				// <a href="spip.php?page=signes&amp;id_article=135544"
				// title="Aller au signe">
				String str = text.toString();
				Boolean searchProgressing = true;
				int index = -1;
				if (str != "") {
					Log.v("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"called from  "
									+ Thread.currentThread().getStackTrace()[1]
											.getLineNumber());
					index = str.indexOf(linkStart);// http://upload.wikimedia.org/wikipedia/commons/thumb/");

					Log.e("downloader thread run search " + search + " reading",
							"there is linkstart" + linkStart
									+ "in my text at index:" + index);

					// notaBene:
					// Elix Implements the open search protocol
					// http://www.opensearch.org/Community/OpenSearch_enabled_search_clients
					// http://www.elix-lsf.fr/spip.php?page=recherche&recherche=bonjour
					// TODO handle incoorect words (exemple jeux olympiques
					// saved for jeux
					if (str.contains("www.elix-lsf.fr")) {
						if (str.contains("Les signes de")) {
							Log.v("l:"
									+ Thread.currentThread().getStackTrace()[2]
											.getLineNumber(),
									"called from  "
											+ Thread.currentThread()
													.getStackTrace()[1]
													.getLineNumber());
							Log.d("Processing", "app is on the videopage");

						} else {
							Log.v("l:"
									+ Thread.currentThread().getStackTrace()[2]
											.getLineNumber(),
									"called from  "
											+ Thread.currentThread()
													.getStackTrace()[1]
													.getLineNumber());
							Log.d("Processing", "app is on the ListResult");

							// if(str.contains("page-recherche_definitions")) {
							if (str.contains("Aller au signe")) {
								Log.v("l:"
										+ Thread.currentThread()
												.getStackTrace()[2]
												.getLineNumber(),
										"called from  "
												+ Thread.currentThread()
														.getStackTrace()[1]
														.getLineNumber());
								Log.d("advancedDowload", "Aller au signe");
								index = str.indexOf("Aller au signe");
								index = str.indexOf(linkStart,
										str.indexOf("Aller au signe") - 75);
								str = str.substring(index);
								Log.d("Searching on Elix Found Video Item :",
										search + " in " + str.substring(0, 75));
								// lastLinkInside=str.substring(0,75)
								index = str.indexOf(linkStart);// http://upload.wikimedia.org/wikipedia/commons/thumb/");

							}
						}

					}

					// https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcS_LK1mKgWX6z17gZ8f_JLrBq_ed12mSDQ4M3mkJqk5rjprW1PTvw

				} else
					searchProgressing = false;

				int index2 = -1;
				int index3 = -1;
				if ((searchProgressing = true) && (index != -1)) {
					Log.v("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(), " linkEnd: " + linkEnd);
					// http://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/78colonialhome.jpg/120px-78colonialhome.jpg
					index2 = str.indexOf(linkEnd, index);// .indexOf("http://upload.wikimedia.org/wikipedia/commons/thumb/","hj");
					// index2= str.indexOf(".jpg",index2);

					Log.d("downloader thread run search " + search + "reading",
							"there is linkEnd" + linkEnd
									+ " in my text at index:" + index2
									+ "  length" + (index2 - index));

					// <a href="spip.php?page=signes&amp;id_article=135544"
					// title="Aller au signe">

				} else {
					Log.d("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"called from  "
									+ Thread.currentThread().getStackTrace()[1]
											.getLineNumber());
					searchProgressing = false;
					Log.e("downloader thread run search " + search + "reading",
							" error " + linkEnd + " in my text at index:"
									+ index2 + "  length" + (index2 - index));
				}

				// str=(String) str.subSequence(index, index2);
				// if (index2==-1){searchProgressing=false;}
				String fStr = "";

				/*
				 * <a href="spip.php?page=signes&amp;id_article=135544"
				 * title="Aller au signe"> <img
				 * src="plugins/sds/css/img/bouton_signe.png" alt="Signe"
				 * height="30" width="30"> <span>Signe</span> </a>
				 */

				Log.d("l:"
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber(),
						"called from  "
								+ Thread.currentThread().getStackTrace()[1]
										.getLineNumber());
				if ((searchProgressing = true) && (index2 != -1)) {
					Log.d("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"called from  "
									+ Thread.currentThread().getStackTrace()[1]
											.getLineNumber());
					fStr = (String) str.subSequence(index, index2 - charBack);
					Log.d("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"fStr=(String) str.subSequence(index, index2-charBack)"
									+ fStr + "=(String) str.subSequence( "
									+ index + " , " + index2 + " - " + charBack
									+ " )");

					if (fStr.length() <= 0)
						searchProgressing = false;
					Log.e("downloader thread run search" + search + "reading",
							"error in my link:" + fStr.toString());
					Log.d("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"called from  "
									+ Thread.currentThread().getStackTrace()[1]
											.getLineNumber());
					Log.e("downloader thread run search" + search + "reading",
							"there is something in my link" + fStr.toString());
					// downloader.downloadFromUrl(fStr, search+".jpg");

					Log.e("downloader thread run search" + search + "reading",
							"there is something in my link"
									+ fStr.toString()
									+ " adding the linkbBounce before to obtain"
									+ linkBounce + fStr);
					fStr = linkBounce + fStr;

				} else
					searchProgressing = false;
				Log.e("downloader thread run search" + search + "reading",
						"error in my link" + fStr.toString());

				/*
				 * bateau <a href="spip.php?page=signes&amp;id_article=135544"
				 * title="Aller au signe"> <img
				 * src="plugins/sds/css/img/bouton_signe.png" alt="Signe"
				 * height="30" width="30"> <span>Signe</span> </a>
				 */
				// post corrections
				// seach id_article

				if ((searchProgressing = true)
						&& fStr.contains("spip.php?page=signes&amp;id_article=")) {
					Log.d("l:"
							+ Thread.currentThread().getStackTrace()[2]
									.getLineNumber(),
							"called from  "
									+ Thread.currentThread().getStackTrace()[1]
											.getLineNumber());
					Log.v("reading", "post corrections: correcting my link"
							+ fStr.toString());
					fStr = "http://www.elix-lsf.fr/spip.php?page=signes&id_article="
							+ fStr.substring(fStr.lastIndexOf("article=") + 8,
									fStr.length());

					Log.e("downloader thread run search" + search + "reading",
							"corrected URL" + fStr.toString());

				} else
					Log.v("downloader thread run search" + search + "reading",
							"error in my link" + fStr.toString());

				// downloader.downloadFromUrl(fStr, saveDir+search+saveType);
				if (searchProgressing = true) {

					if (download) {
						linkInside = fStr;
						lastLinkInside = fStr;// jhsgfcjhsgc Need to be changed
						Log.d("l:"
								+ Thread.currentThread().getStackTrace()[2]
										.getLineNumber(), "reading"
								+ "downloading activated");
						// Thread.currentThread().getStackTrace()[1].getLineNumber();
						if (fStr.contains("mp4")) {
							Log.d("l:"
									+ Thread.currentThread().getStackTrace()[2]
											.getLineNumber(),
									"called from  "
											+ Thread.currentThread()
													.getStackTrace()[1]
													.getLineNumber());
							Log.e("downloader thread run search" + search
									+ "reading",
									"PostProcessing: corrected URL now contains .mp4"
											+ fStr.toString());
							fStr = fStr + ".mp4";
							// http://www.elix-lsf.fr/spip.php?page=signes&id_article="+fStr.substring(fStr.lastIndexOf("article=")+8,
							// fStr.length());
						}

						if (fStr.length() < 1) {
							// needDownload = false
							;
							Log.v("No video here", "Stop the search");
							
							
							file2ExtStorage(
									true,
									"hexasense/video",
									"FileList.txt",
									search
											+ "  "
											+ "NotFound"
											+ System.getProperty("line.separator"));
						} else {
							// needDownload = true;
							mHandler.post(mUpdateResults);
							if (saveType == ".mp4")
								file2ExtStorage(
										true,
										"hexasense/video",
										"FileList.txt",
										search
												+ "  "
												+ fStr
												+ "here"
												+ System.getProperty("line.separator"));
							// this.().prepare();
							addVideoViewFromPath(fStr);

							/*
							 * this.runOnUiThread(new Runnable() { public void
							 * run() { Toast.makeText(activity, "Hello",
							 * Toast.LENGTH_SHORT).show(); } });
							 */

							if (saveType == ".jpg")
								file2ExtStorage(
										true,
										"hexasense/image",
										"ImageList.txt",
										search
												+ "  "
												+ fStr
												+ System.getProperty("line.separator"));

						}
						downloader.downloadFromUrl(fStr, saveDir + search
								+ saveType);
						Log.d("l:"
								+ Thread.currentThread().getStackTrace()[2]
										.getLineNumber(),
								"called from  "
										+ Thread.currentThread()
												.getStackTrace()[1]
												.getLineNumber());
						Log.e("downloader thread run search" + search
								+ "reading", "corrected lastLinkInside"
								+ lastLinkInside);
						linkInside = "";
						lastLinkInside = "";
						// Log.e("reading","callingaddVideoWebViewFromPath(fStr)"+fStr);
						// addVideoWebViewFromPath(fStr);

					}// ".jpg");
					else {
						Log.d("l:"
								+ Thread.currentThread().getStackTrace()[2]
										.getLineNumber(),
								"  "
										+ Thread.currentThread()
												.getStackTrace()[2]
												.getLineNumber()
										+ " = 2341 called from"
										+ Thread.currentThread()
												.getStackTrace()[1]
												.getLineNumber());
						Log.e("downloader thread run search" + search
								+ "reading", "downloading not activated");
						linkInside = fStr;
						lastLinkInside = fStr;

					}

				}// progressOK
					// else searchProgressing=false;

				// this.notifyAll();
				// linkInside=fStr+saveDir+search+saveType;

				Log.e("downloader thread run search" + search + "reading",
						"Thread run end loop" + lastLinkInside);

				// return;
				Log.d("l:"
						+ Thread.currentThread().getStackTrace()[2]
								.getLineNumber(),
						"  "
								+ Thread.currentThread().getStackTrace()[2]
										.getLineNumber()
								+ " = 1739 called from"
								+ Thread.currentThread().getStackTrace()[1]
										.getLineNumber());

				// return (fStr+ search+".jpg");
				// String adr=

				mHandler.post(mDownloadFinish);

			}// run()

		}).start();

		// DownloadFromUrl("","");
	}

	public void advancedDownload() {
		new Thread(new Runnable() {
			public void run() {

				if (true) {// !isNetworkAvailable()){
					// Toast.makeText(getApplicationContext(), "no internet",
					// Toast.LENGTH_LONG).show();
					// return;
				}
				// mp4ToSd();
				Downloader downloader = new Downloader();
				// downloader.downloadFromUrl("http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4",
				// "hexasense2.mp4");//fileName
				// downloader.downloadFromUrl("http://www.helloandroid.com/sites/all/themes/helloandroid/logo.png",
				// "hexasense2.png");//fileName
				// downloader.downloadFromUrl("http://commons.wikimedia.org/wiki/Maison?uselang=fr",
				// "text.txt");
				// String text=(String)
				Object text = "";
				ByteArrayBuffer bab;
				text = downloader
						.downloadFromUrl(
								"https://www.google.com/search?as_st=y&tbm=isch&as_q=&as_epq=maison&as_oq=&as_eq=&cr=&as_sitesearch=&safe=images&tbs=isz:m&gws_rd=ssl",
								"text.txt");// "http://commons.wikimedia.org/wiki/Maison?uselang=fr",
											// "text.txt");
				bab = (ByteArrayBuffer) text;
				// String str = new String(bytes, "UTF-8");
				// String str=getOnline("http://www.example.com/script.php");
				if (text != "") {
					Log.e("reading",
							"there is something in my text" + text.toString());
				}
				text = new String(bab.toByteArray()).trim();
				Log.e("reading",
						"there is something in my text" + text.toString());

				String str = text.toString();

				int index = 0;
				index = str.indexOf("https://encrypted-tbn1.gstatic.com/");// http://upload.wikimedia.org/wikipedia/commons/thumb/");
				Log.e("reading", "there is something in my text at index:"
						+ index);
				// https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcS_LK1mKgWX6z17gZ8f_JLrBq_ed12mSDQ4M3mkJqk5rjprW1PTvw

				// http://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/78colonialhome.jpg/120px-78colonialhome.jpg
				int index2 = str.indexOf("width", index);// .indexOf("http://upload.wikimedia.org/wikipedia/commons/thumb/","hj");
				// index2= str.indexOf(".jpg",index2);
				Log.e("reading",
						"there is something in my text ending at index:"
								+ index2);
				// str=(String) str.subSequence(index, index2);

				String fStr = "";
				fStr = (String) str.subSequence(index, index2 - 2);
				Log.e("reading",
						"there is something in my address" + fStr.toString());
				// file2ExtStorage(true,"hexasense",
				// "FileList.txt",thingYouSaid+"  "+fStr
				// +System.getProperty("line.separator") );
				downloader.downloadFromUrl(fStr, "maison.jpg");
				//TODO remove downloader
				
				// String adr=
			}
		}).start();
		// DownloadFromUrl("","");
	}

	
	
	
	
	public void file2ExtStorage(Boolean append, String directory,
			String fileName, String text2Write) {

		// simplycreating a directory and a file inSDcar
		// String filename
		// =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+"/"+"mydirectory"+"/"+
		// "myfile2.txt";//
		File sdCard = Environment.getExternalStorageDirectory();
		File dir = new File(sdCard.getAbsolutePath() + "/" + directory);// "/Hexasense");
		dir.mkdirs();
		File file1 = new File(dir, fileName);// "hexasense.txt");

		try {
			FileOutputStream f = new FileOutputStream(file1, append);

			f.write(text2Write.getBytes());
			// f.write((InputStream)new
			// URL("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4").);
			f.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	public void file2ExtStorage(String directory, String fileName,
			String text2Write) {

		// simplycreating a directory and a file inSDcar
		// String filename
		// =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+"/"+"mydirectory"+"/"+
		// "myfile2.txt";//
		File sdCard = Environment.getExternalStorageDirectory();
		File dir = new File(sdCard.getAbsolutePath() + "/" + directory);// "/Hexasense");
		dir.mkdirs();
		File file1 = new File(dir, fileName);// "hexasense.txt");

		try {
			FileOutputStream f = new FileOutputStream(file1);

			f.write(text2Write.getBytes());
			// f.write((InputStream)new
			// URL("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4").);
			f.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	public void file2ExtStorage(String directory, String fileName, Byte[] bytes) {
		String mUrl = "http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4?1361382411";// /storage/extSdCard/video/demander.mp4";//a-original.mp4";//OK

		// simplycreating a directory and a file inSDcar
		// String filename
		// =Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+"/"+"mydirectory"+"/"+
		// "myfile2.txt";//
		File sdCard = Environment.getExternalStorageDirectory();
		File dir = new File(sdCard.getAbsolutePath() + "/" + directory);// "/Hexasense");
		dir.mkdirs();
		File file1 = new File(dir, fileName);// "hexasense.txt");

		try {
			FileOutputStream f = new FileOutputStream(file1);
			f.write(bytes.toString().getBytes());
			// text2Write.getBytes());

			f.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

	// private final String PATH =
	// "/data/data/com.helloandroid.imagedownloader/"; //put the downloaded file
	// here
	// private final String PATH = (sdCard.getAbsolutePath() +"/"+"hexasense");
	// //put the downloaded file here

	public void addViews(View view) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		Button btn = new Button(this);
		btn.setLayoutParams(lparams);
		count++;
		btn.setText("Hello World : " + count);
		main.addView(btn, count);
	}

	public void addImageViews(View view, int imageId) {
		Log.d("addingImageView",
				" imageId " + imageId + " to view " + view.toString());

		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		ImageView btnImageView = new ImageView(this);
		btnImageView.setLayoutParams(lparams);

		// btnImageView.setBackgroundResource(R.drawable.a);
		btnImageView.setBackgroundResource(imageId);
		// scrollLayout.addView(btnImageView, count);

		// btn.setText("Hello World : " + count);
		// main.addView(btn, count);

		// scrollLayout2.addView(btnImageView, count);

		/*
		 * ImageView btnImageView2=new ImageView(this);
		 * btnImageView2.setLayoutParams(lparams);
		 * btnImageView2.setBackgroundResource(imageId);
		 * scrollLayout2.addView(btnImageView2, count);
		 */

		ImageView btnImageView3 = new ImageView(this);
		btnImageView3.setLayoutParams(lparams);
		btnImageView3.setBackgroundResource(imageId);
		hscrollLayout1.addView(btnImageView3, count);

		/*
		 * ImageView btnImageView4=new ImageView(this);
		 * btnImageView4.setLayoutParams(lparams);
		 * btnImageView4.setBackgroundResource(R.drawable.france124);
		 * hscrollLayout2.addView(btnImageView4, count);
		 */

		count++;
		// scrollView.layout(0, 40, 400, 400);
	}

	Words2ImageResult actualWords2ImageResultList[];

	public void addBigImageViews2(View view, int imageId, int pos, int length) {
		actualWords2ImageResultList = new Words2ImageResult[0];

		Words2ImageResult actualWords2ImageResult = new Words2ImageResult();
		actualWords2ImageResult.imageID = 0;
		actualWords2ImageResult.wordsPosition = 0;
		actualWords2ImageResult.wordLength = 0;

		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		ImageView btnImageView = new ImageView(this);
		ImageView btnImageView4 = new ImageView(this);
		btnImageView4.setLayoutParams(lparams);
		btnImageView4.setBackgroundResource(imageId);
		
		hscrollLayout2.addView(btnImageView4, pos);

		// count++;
		// scrollView.layout(0, 40, 400, 400);
	}

	//The only one Used for userList(securityList)
	public void refreshList(View view, int imageId, int pos, int lenght,String word) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);
		Log.v("adding", "adding word " + listCounter + "   with word position"
				+ pos);
		boolean changed = false;
		int[][] tempList;
		// [listCounter] ;
		tempList = new int[3][listCounter + 1];
		Words2ImageResult[] tempWords2ImageResultList = new Words2ImageResult[listCounter + 1];

		int actualPos = 0;

		// if first element
		if (listCounter == 0) {
			Log.v("adding", "1-adding word " + listCounter
					+ "   with word position" + pos + "  at firstplace");
			// tempList[0][actualPos]=pos;
			// tempList[2][actualPos]=imageId;
			// tempList[1][actualPos]=lenght;
			tempWords2ImageResultList = new Words2ImageResult[1];
			tempWords2ImageResultList[0] = new Words2ImageResult();
			tempWords2ImageResultList[0].word = word;
			tempWords2ImageResultList[0].wordsPosition = pos;
			tempWords2ImageResultList[0].imageID = imageId;
			tempWords2ImageResultList[0].wordLength = lenght;

			// imageList=tempList;
			actualWords2ImageResultList = tempWords2ImageResultList;
			// changed=true;
			listCounter++;
			// Log.v("adding",
			// "adding word "+listCounter+" imageList "+imageList[0][0]+" tempList"+
			// tempList[0][0]);
		}
		// not the first element
		else {
			// tempList=imageList
			tempWords2ImageResultList = new Words2ImageResult[listCounter + 1];
			for (int i = 0; i < listCounter; i++) {

				tempWords2ImageResultList[i] = new Words2ImageResult();
				tempWords2ImageResultList[i].word = actualWords2ImageResultList[i].word;
				tempWords2ImageResultList[i].wordsPosition = actualWords2ImageResultList[i].wordsPosition;
				
				tempWords2ImageResultList[i].imageID = actualWords2ImageResultList[i].imageID;
				tempWords2ImageResultList[i].wordLength = actualWords2ImageResultList[i].wordLength;
			}

			// tempWords2ImageResultList=new Words2ImageResult[listCounter+2];
			tempWords2ImageResultList[listCounter] = new Words2ImageResult();
			tempWords2ImageResultList[listCounter].word = word;
			tempWords2ImageResultList[listCounter].wordsPosition = pos;
			tempWords2ImageResultList[listCounter].imageID = imageId;
			tempWords2ImageResultList[listCounter].wordLength = lenght;
			actualWords2ImageResultList = tempWords2ImageResultList;
			listCounter++;
			Arrays.sort(actualWords2ImageResultList);
		}

		/*
		 * //not the first element else{ //tempList=imageList for (int
		 * i=0;i<listCounter;i++){ Log.v("adding",
		 * "2-adding word "+listCounter+"at pos"+pos +" copying ImageList["+i+
		 * "]"+ imageList[0][i]+"into TempList["+i+ "]:"+tempList[0][i]);
		 * tempList[0][i]=imageList[0][i]; tempList[2][i]=imageList[2][i];
		 * tempList[1][i]=imageList[1][i]; imageList=tempList; Log.v("adding",
		 * "tempList "
		 * +listCounter+"at pos"+tempList[0][i]+" "+tempList[1][i]+" "
		 * +tempList[2][i]); }
		 * 
		 * //if new element pos < image listPos for (int i=0;i<listCounter;i++){
		 * Log.v("adding", "2-adding word "+listCounter+"at pos"+pos
		 * +" seraching ImageList["+i+ "]"+ imageList[0][i]+"into TempList["+i+
		 * "]:"+tempList[0][i]); if (pos<imageList[0][i]){ Log.v("adding",
		 * "Searching"+pos +"imageList["+i+ "]"); actualPos= i; changed=true;
		 * 
		 * } }
		 * 
		 * if (changed){ for (int i=actualPos;i<listCounter;i++){
		 * Log.v("adding", ""+pos +" copying ImageList["+i+"]"+
		 * imageList[0][i]+"into TempList["+i+1 +"]:"+tempList[0][i+1]);
		 * tempList[0][i+1]=imageList[0][i]; tempList[2][i+1]=imageList[2][i];
		 * tempList[1][i+1]=imageList[1][i]; }
		 * 
		 * tempList[0][actualPos]=pos; tempList[2][actualPos]=imageId;
		 * tempList[1][actualPos]=lenght; imageList=tempList; listCounter++; }
		 * else{ Log.v("adding", ""+pos +" copying into TempList["+listCounter+
		 * "]:"+tempList[0][listCounter]); tempList[0][listCounter]=pos;
		 * tempList[2][listCounter]=imageId; tempList[1][listCounter]=lenght;
		 * imageList=tempList; listCounter++; }//eslse
		 * 
		 * 
		 * 
		 * } for (int i=0;i<listCounter;i++){ Log.v("adding",
		 * "----result "+"listCounter"+ listCounter+ " pos:"+pos
		 * +" ImageList["+i+"]"+
		 * imageList[0][i]+" TempList["+i+"]:"+tempList[0][i]);
		 * 
		 * }
		 */

	}// organize

	public void addBigImageViews(View view, int imageId) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		ImageView btnImageView = new ImageView(this);
		ImageView btnImageView4 = new ImageView(this);
		btnImageView4.setLayoutParams(lparams);
		btnImageView4.setBackgroundResource(imageId);
		hscrollLayout2.addView(btnImageView4, 0);

		// count++;
		// scrollView.layout(0, 40, 400, 400);
	}

	int[][] list;
	int listCounter = 0;
	int posMax = 0;
	int posMin = 0;

	// int [] pos={1,1,2,

	public void addAnotherNewOrganizedDelayedBigImageViews(View view,
			int imageId, int pos, int lenght) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);
		Log.v("adding", "adding word " + listCounter + "   with word position"
				+ pos);
		boolean changed = false;
		int[][] tempList;
		// [listCounter] ;
		tempList = new int[3][listCounter + 1];
		int actualPos = 0;

		// if first element
		if (listCounter == 0) {
			Log.v("adding", "1-adding word " + listCounter
					+ "   with word position" + pos + "  at firstplace");
			tempList[0][actualPos] = pos;
			tempList[2][actualPos] = imageId;
			tempList[1][actualPos] = lenght;
			imageList = tempList;
			changed = true;
			listCounter++;
			Log.v("adding", "adding word " + listCounter + " imageList "
					+ imageList[0][0] + " tempList" + tempList[0][0]);

		}
		// not the first element
		else {
			// tempList=imageList
			for (int i = 0; i < listCounter; i++) {
				Log.v("adding", "2-adding word " + listCounter + "at pos" + pos
						+ " copying ImageList[" + i + "]" + imageList[0][i]
						+ "into TempList[" + i + "]:" + tempList[0][i]);
				tempList[0][i] = imageList[0][i];
				tempList[2][i] = imageList[2][i];
				tempList[1][i] = imageList[1][i];
				imageList = tempList;
				Log.v("adding", "tempList " + listCounter + "at pos"
						+ tempList[0][i] + " " + tempList[1][i] + " "
						+ tempList[2][i]);
			}

			// if new element pos < image listPos
			for (int i = 0; i < listCounter; i++) {
				Log.v("adding", "2-adding word " + listCounter + "at pos" + pos
						+ " seraching ImageList[" + i + "]" + imageList[0][i]
						+ "into TempList[" + i + "]:" + tempList[0][i]);
				if (pos < imageList[0][i]) {
					Log.v("adding", "Searching" + pos + "imageList[" + i + "]");
					actualPos = i;
					changed = true;

				}
			}

			if (changed) {
				for (int i = actualPos; i < listCounter; i++) {
					Log.v("adding", "" + pos + " copying ImageList[" + i + "]"
							+ imageList[0][i] + "into TempList[" + i + 1 + "]:"
							+ tempList[0][i + 1]);
					tempList[0][i + 1] = imageList[0][i];
					tempList[2][i + 1] = imageList[2][i];
					tempList[1][i + 1] = imageList[1][i];
				}

				tempList[0][actualPos] = pos;
				tempList[2][actualPos] = imageId;
				tempList[1][actualPos] = lenght;
				imageList = tempList;
				listCounter++;
			} else {
				Log.v("adding", "" + pos + " copying into TempList["
						+ listCounter + "]:" + tempList[0][listCounter]);
				tempList[0][listCounter] = pos;
				tempList[2][listCounter] = imageId;
				tempList[1][listCounter] = lenght;
				imageList = tempList;
				listCounter++;
			}// eslse

		}
		for (int i = 0; i < listCounter; i++) {
			Log.v("adding", "----result " + "listCounter" + listCounter
					+ " pos:" + pos + " ImageList[" + i + "]" + imageList[0][i]
					+ " TempList[" + i + "]:" + tempList[0][i]);

		}

	}// organize

	public void addNewOrganizedDelayedBigImageViews(View view, int imageId,
			int pos, int lenght) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);
		boolean changed = false;
		int[][] tempList;
		// [listCounter] ;
		tempList = new int[3][listCounter + 1];
		int actualPos = 0;

		// if first element
		if (listCounter == 0) {

			tempList[0][actualPos] = pos;
			tempList[2][actualPos] = imageId;
			tempList[1][actualPos] = lenght;
			imageList = tempList;
			changed = true;
			listCounter++;
		}
		// not the first element
		else {
			// tempList=imageList
			for (int i = 0; i < listCounter; i++) {
				tempList[0][i] = imageList[0][i];
				tempList[2][i] = imageList[2][i];
				tempList[1][i] = imageList[1][i];
			}

			// if new element pos < image listPos
			for (int i = 0; i < listCounter; i++) {

				if (pos < imageList[0][i]) {
					actualPos = i;
					changed = true;

				}
			}

			if (changed) {
				for (int i = actualPos; i < listCounter; i++) {

					tempList[0][i + 1] = imageList[0][i];
					tempList[2][i + 1] = imageList[2][i];
					tempList[1][i + 1] = imageList[1][i];
				}
				tempList[0][actualPos] = pos;
				tempList[2][actualPos] = imageId;
				tempList[1][actualPos] = lenght;
				imageList = tempList;
				listCounter++;
			} else {
				tempList[0][listCounter] = pos;
				tempList[2][listCounter] = imageId;
				tempList[1][listCounter] = lenght;
				imageList = tempList;
				listCounter++;
			}// eslse

		}
	}// organize

	public void addOrganizedDelayedBigImageViews(View view, int imageId,
			int pos, int lenght) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);
		boolean changed = false;
		int[][] tempList;
		// [listCounter] ;
		tempList = new int[3][listCounter + 1];
		int actualPos = 0;

		// if first element
		if (listCounter == 0) {

			tempList[0][actualPos] = pos;
			tempList[2][actualPos] = imageId;
			tempList[1][actualPos] = lenght;
			imageList = tempList;
			changed = true;
			listCounter++;
		}
		// not the first element
		else {
			// tempList=imageList
			for (int i = 0; i < listCounter; i++) {
				tempList[0][i] = imageList[0][i];
				tempList[2][i] = imageList[2][i];
				tempList[1][i] = imageList[1][i];
			}

			// if new element pos < image listPos
			for (int i = 0; i < listCounter; i++) {

				if (pos < imageList[0][i]) {
					actualPos = i;
					changed = true;

				}
			}
			if (changed) {

				for (int i = actualPos; i < listCounter; i++) {

					tempList[0][i + 1] = imageList[0][i];
					tempList[2][i + 1] = imageList[2][i];
					tempList[1][i + 1] = imageList[1][i];
				}
				/*
				 * if (pos<imageList[0][i]){ //actualPos= i; tempList[0][i]=pos;
				 * tempList[2][i]=imageId; tempList[1][i]=lenght;
				 * 
				 * tempList[0][i+1]=imageList[0][i];
				 * tempList[2][i+1]=imageList[2][i];
				 * tempList[1][i+1]=imageList[1][i];
				 */
				/*
				 * for (int j=actualPos;j<listCounter;j++){
				 * 
				 * tempList[0][j]=imageList[0][j];
				 * tempList[2][j]=imageList[2][j];
				 * tempList[1][j]=imageList[1][j]; }//rof
				 */
				pos++;
				imageList = tempList;

			}// if
			else {
				// tempList[0][i+1]=pos;
				// tempList[2][i+1]=imageId;
				// tempList[1][i+1]=lenght;
				// imageList=tempList;

			}// eslse

			// } //else
			listCounter++;
		}// else

		/*
		 * tempList[0][actualPos]=pos; tempList[2][actualPos]=imageId;
		 * tempList[1][actualPos]=lenght;
		 * 
		 * 
		 * for (int i=actualPos;i<listCounter;i++){
		 * 
		 * tempList[0][i]=imageList[0][i]; tempList[2][i]=imageList[2][i];
		 * tempList[1][i]=imageList[1][i];
		 * 
		 * 
		 * } /* for (int i=0;i<listCounter;i++){ if (pos<=imageList[0][i]){
		 * tempList[0][i]=imageList[0][i]; tempList[2][i]=imageList[2][i];
		 * tempList[1][i]=imageList[1][i];
		 * 
		 * } else{ if(pos>imageList[0][i] ){ tempList[0][listCounter]=pos;
		 * tempList[2][listCounter]=imageId; tempList[1][listCounter]=lenght; }
		 * 
		 * if(pos>imageList[0][i]){ tempList[0][listCounter]=pos;
		 * tempList[2][listCounter]=imageId; tempList[1][listCounter]=lenght; }
		 * }
		 * 
		 * }//for
		 * 
		 * 
		 * 
		 * for (int i=0;i<listCounter;i++){ tempList[0][i]=imageList[0][i];
		 * tempList[2][i]=imageList[2][i]; tempList[1][i]=imageList[1][i];
		 * 
		 * } tempList[0][listCounter]=pos; tempList[2][listCounter]=imageId;
		 * tempList[1][listCounter]=lenght;
		 */

		// Arrays.sort(list);
		// imageList=tempList;

		/*
		 * if (listCounter==0){ list[0][listCounter]=pos;
		 * list[2][listCounter]=imageId; list[1][listCounter]=lenght;
		 * posMax=pos; posMin=pos; } else{ if (pos>=posMax){
		 * list[0][listCounter]=pos; list[2][listCounter]=imageId;
		 * list[1][listCounter]=lenght; posMax=pos; posMin=pos; } }
		 */
		// listCounter++;

		/*
		 * ImageView btnImageView=new ImageView(this); ImageView
		 * btnImageView4=new ImageView(this);
		 * btnImageView4.setLayoutParams(lparams);
		 * btnImageView4.setBackgroundResource(imageId);
		 * hscrollLayout2.addView(btnImageView4, 0);
		 */

		// count++;
		// scrollView.layout(0, 40, 400, 400);

		// updateDelayedBigImageViews();
	}

	private int[][] transpose(int[][] data) {
		int[][] transposed = new int[data[0].length][data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				transposed[j][i] = data[i][j];
			}
		}
		return transposed;
	}

	public void addDelayedBigImageViews(View view, int imageId, int pos,
			int lenght) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		int[][] tempList;
		// [listCounter] ;
		tempList = new int[3][listCounter + 1];
		for (int i = 0; i < listCounter; i++) {
			tempList[0][i] = imageList[0][i];
			tempList[2][i] = imageList[2][i];
			tempList[1][i] = imageList[1][i];

		}

		tempList[0][listCounter] = pos;
		tempList[2][listCounter] = imageId;
		tempList[1][listCounter] = lenght;

		this.transpose(tempList);
		// for each each val in tempList{

		// }

		Arrays.sort(tempList);

		this.transpose(tempList);
		imageList = tempList;

		/*
		 * if (listCounter==0){ list[0][listCounter]=pos;
		 * list[2][listCounter]=imageId; list[1][listCounter]=lenght;
		 * posMax=pos; posMin=pos; } else{ if (pos>=posMax){
		 * list[0][listCounter]=pos; list[2][listCounter]=imageId;
		 * list[1][listCounter]=lenght; posMax=pos; posMin=pos; } }
		 */
		listCounter++;

		/*
		 * ImageView btnImageView=new ImageView(this); ImageView
		 * btnImageView4=new ImageView(this);
		 * btnImageView4.setLayoutParams(lparams);
		 * btnImageView4.setBackgroundResource(imageId);
		 * hscrollLayout2.addView(btnImageView4, 0);
		 */

		// count++;
		// scrollView.layout(0, 40, 400, 400);

		// updateDelayedBigImageViews();
	}

	public void updateDelayedBigImageViews() {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		/*
		 * list[0][listCounter]=pos; list[2][listCounter]=imageId;
		 * list[1][listCounter]=lenght;
		 */

		// Arrays.sort(imageList);
		// trier(imageList);

		for (int i = 0; i < listCounter; i++) {

			ImageView btnImageView4 = new ImageView(this);
			btnImageView4.setLayoutParams(lparams);
			btnImageView4.setBackgroundResource(imageList[2][i]);

			hscrollLayout2.addView(btnImageView4, 0);

		}

		// ImageView btnImageView=new ImageView(this);

		// count++;
		// scrollView.layout(0, 40, 400, 400);
	}
	
	//The only one used to show list
	public void showListOnBigImageViews(Words2ImageResult[] words2ImageResult) {
		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		// Button btn = new Button(this);
		// btn.setLayoutParams(lparams);

		/*
		 * list[0][listCounter]=pos; list[2][listCounter]=imageId;
		 * list[1][listCounter]=lenght;
		 */

		// Arrays.sort(imageList);
		// trier(imageList);
		
		for (int i = 0; i < listCounter; i++) {

			ImageView btnImageView4 = new ImageView(this);
			btnImageView4.setLayoutParams(lparams);
			btnImageView4.setBackgroundResource(words2ImageResult[i].imageID);
			RelativeLayout imageRL =new RelativeLayout(this);
			//ImageView btnImageView4 = new ImageView(this);

			
			
			imageRL.setLayoutParams(lparams);
			//btnImageView4.setLayoutParams(lparams);
			TextView imageTV=new TextView(this);
			imageTV.setLayoutParams(lparams);
			imageTV.setText(" "+i+"/"+listCounter +" "+userFoundList[i]+""+words2ImageResult[i].word+"  ");//wordsYouSaid[foundWord]);
			//imageTV.setText(" "+i+"/"+listCounter +" "+userFoundList[i]+"     "+userFoundList[0]+userFoundList[1]+userFoundList[2]+"test azerty");//wordsYouSaid[foundWord]);
			//imageTV.setText(" "+userFoundList[listCounter]+"test azerty");//wordsYouSaid[foundWord]);
			
			/*TextView imageTV2=new TextView(this);
			imageTV2.setLayoutParams(lparams);
			imageTV2.setText(" "+wordsYouSaid[foundWord]);
			imageTV2.setHintTextColor(Color.WHITE);		
			imageTV2.setTextColor(Color.WHITE);	
			imageTV2.setScaleX((float)1.05);
			imageTV2.setScaleY((float)1.05);
	
			
			
			//BigText
			TextView imageTV3=new TextView(this);
			imageTV3.setLayoutParams(lparams);
			imageTV3.setText(" "+wordsYouSaid[foundWord]);
			imageTV3.setTextSize((float)(imageTV2.getTextSize()*2.0));
			imageTV3.setTextColor(Color.WHITE);
			imageTV3.setAlpha((float) 0.8);
			
			TextView imageTV4=new TextView(this);
			imageTV4.setLayoutParams(lparams);
			imageTV4.setText(" "+wordsYouSaid[foundWord]);
			imageTV4.setTextSize((float)(imageTV2.getTextSize()*1.9));
			//imageTV4.setTextColor(Color.WHITE);
			imageTV4.setAlpha((float) 0.2);
			*/
			imageRL.addView(btnImageView4);
			//imageRL.addView(imageTV3);
			//imageRL.addView(imageTV4);
				
			//imageRL.addView(imageTV2);
			imageRL.addView(imageTV);
			
			//imageTV2.bringToFront();
			//imageTV.bringToFront();
			
			hscrollLayout2.addView(imageRL,hscrollLayout2.getChildCount());
			
			
			
			
			
			//hscrollLayout2.addView(btnImageView4, i);

		}

		// ImageView btnImageView=new ImageView(this);

		// count++;
		// scrollView.layout(0, 40, 400, 400);
	}

	public static int[] trier(int tab[]) {
		int taille = tab.length;
		int tmp[] = new int[taille];

		for (int i = 0; i < taille; i++) {
			tmp[i] = tab[i];
			tab[i] = 0;
		}

		return tmp;
	}

	public int[][] trier(int tab[][]) {
		int taille = listCounter;// tab.length/3;

		int tmp[][] = new int[3][taille];

		// Arrays.sort(tab);
		tmp = tab;
		for (int j = 0; j < taille; j++) {

			for (int i = 1; i < taille; i++) {
				if (tab[0][i] < tab[0][i - 1]) {
					tmp[0][i - 1] = tab[0][i];
					tmp[1][i - 1] = tab[0][i];
					tmp[2][i - 1] = tab[0][i];

					tmp[0][i] = tab[0][i];
					tmp[1][i] = tab[0][i];
					tmp[2][i] = tab[0][i];
					tab = tmp;

				}

			}

		}
		/*
		 * for(int i=0; i<taille; i++) {
		 * 
		 * 
		 * tmp[i]=tab[i]; tab[i][1]=0; }
		 */

		return tmp;
	}

	public void addVideoView() {
		Uri uri = Uri
				.parse("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4"); // Declare
																					// your
																					// url
																					// here.
		Uri vidUri = Uri.parse("/sdcard/Clips vidéo/a-original.mp4");// "http://s1133.photobucket.com/user/Anniebabycupcakez/media/1489553974996_37622.mp4.html");
		VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);
		mVideoView.setMediaController(new MediaController(this));
		try {
			mVideoView.setVideoURI(vidUri);
			wait(1000);
		} catch (Exception e) {
			e.printStackTrace();
			Log.e("video from URL error: ", e.getMessage().toString());

		}

		// mVideoView.requestFocus();
		mVideoView.start();

	}

	public void addVideoWebViewFromPath(String path) {

		WebView webView;
		WebSettings websettings;
		webView = (WebView) findViewById(R.id.webView1);// new WebView(this);
		Video video = new Video();

		// webView.loadUrl("file:///android_asset/index.html"); // load html
		// file

		// video.src="file:///android_res/raw/test.mp4"; // load video file from
		// raw folder

		// video.src ="android.resource://ProjectPackageAame/raw/test";
		// video.type = "video/mp4";
		// video.load();
		// video.play();

		// webView.setBackgroundColor(android.R.color.transparent);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setPluginsEnabled(true);
		webView.getSettings().setAllowFileAccess(true);
		webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
		webView.getSettings().setLayoutAlgorithm(
				WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
		webView.getSettings().setAllowContentAccess(true);
		webView.getSettings().setAllowContentAccess(true);
		// webView.getSettings().setUserAgentString(MEDIA_ROUTER_SERVICE);
		webView.setWebViewClient((new WebViewClient()));// force correct
														// handling of wikipedia
		webView.setWebChromeClient((new WebChromeClient()));// nedded for Video
															// playing
		// webView.loadUrl("https://www.youtube.com/watch?v=GbR8qhkFsvg&list=PLoW8sG5JRWlUehnC6wiMB1TMcPj9PGW5R");//http://www.lsfplus.fr/video.php?theFile=aimer.flv&wW=430&wH=335");//
		webView.getSettings().setPluginsEnabled(true);
		// webSettings= WebSettings..PluginState.ON;
		// webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
		// webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
		// webView.loadUrl("file:///android_asset/index.html");
		// webView.loadUrl("/storage/extSdCard/video/LSF_Vocab_automatique.ogg");
		// webView.loadUrl("file:///storage/extSdCard/video/a-original.mp4");
		// webView.loadUrl("http://douves.org");//http://commons.wikimedia.org/wiki/Ogg");
		// webView.loadUrl("http://douves.org");//http://commons.wikimedia.org/wiki/Ogg");
		// webView.loadUrl("http://commons.m.wikimedia.org/wiki/Category:Videos_Langue_des_signes_fran%C3%A7aise");
		// webView.loadUrl("http://commons.wikimedia.org/wiki/File:2010-10-03-Budapest-U-Bahn.ogg");
		// webView.loadUrl("http://broken-links.com/tests/video/");//file:///storage/extSdCard/video/a-original.mp4");//http://upload.wikimedia.org/wikipedia/commons/c/cc/LSF_Vocab_aider.ogg");//http://upload.wikimedia.org/wikipedia/commons/transcoded/6/69/2010-10-03-Budapest-U-Bahn.ogg/2010-10-03-Budapest-U-Bahn.ogg.480p.webm");
		// webView.loadUrl("http://www.broken-links.com/tests/media");//ok
		// webView.loadUrl("http://www.youtube.com/embed/pVYskLEW-Aw?list=PLoW8sG5JRWlUehnC6wiMB1TMcPj9PGW5R");//KO
		// http://www.broken-links.com/tests/media/BBB_720_Android.mp4");//KO
		// //http://www.broken-links.com/tests/media/ //OK
		// http://commons.wikimedia.org/wiki/Category:Videos_Langue_des_signes_fran%C3%A7aise
		// webView.loadUrl("file:///storage/extSdCard/video/a-original.mp4");//http://upload.wikimedia.org/wikipedia/commons/2/2c/LSF_Vocab_demander.ogg");
		webView.loadUrl(path);// "http://upload.wikimedia.org/wikipedia/commons/2/2c/LSF_Vocab_demander.ogg");
		webView.setWebChromeClient(new WebChromeClient() {
			public boolean onConsoleMessage(ConsoleMessage cm) {
				Log.d("MyApplication",
						cm.message() + " -- From line " + cm.lineNumber()
								+ " of " + cm.sourceId());
				return true;
			}
		});

		// webView.getDrawingCache(true);
		webView.addJavascriptInterface(new WebAppInterface(this), "Android");
		// webView.documentHasImages("response");
		// FindListener findListener;//= new FindListener();
		// findListener.onFindResultReceived(activeMatchOrdinal,
		// numberOfMatches, isDoneCounting)

		// Log.d("webview",WebView.findAddress(path).toString());

		/*
		 * WebView.WebViewTransport webViewTransport;
		 * 
		 * WebAppInterface webAppInterface; webAppInterface=new
		 * WebAppInterface(this.getApplicationContext());
		 * webAppInterface.showToast("webAppInterface");
		 * 
		 * Log.d("webviewgetUrl", webView.getUrl());
		 * 
		 * // WebViewTransport webViewTransport;//=new WebViewTransport(); //
		 * webViewTransport.getWebView(); //webView
		 * 
		 * WebViewClient webClient=new WebViewClient(); WebChromeClient
		 * webChromeClient=new WebChromeClient();
		 * webView.setWebViewClient(webClient);
		 * webView.setWebChromeClient(webChromeClient);
		 */

		// http://commons.wikimedia.org/wiki/File:2010-10-03-Budapest-U-Bahn.ogg");//OKwork youtube ok to//https://www.youtube.com/watch?v=GbR8qhkFsvg&list=PLoW8sG5JRWlUehnC6wiMB1TMcPj9PGW5R");
		// http://www.lsfplus.fr/video.php?theFile=aimer.flv&wW=430&wH=335");//Not
		// working need flash plugin
		// a simple
		// image//http://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Ayuntamiento_de_Oporto%2C_Portugal%2C_2012-05-09%2C_DD_03.JPG/500px-Ayuntamiento_de_Oporto%2C_Portugal%2C_2012-05-09%2C_DD_03.JPG");
		// http://upload.wikimedia.org/wikipedia/commons/transcoded/6/69/2010-10-03-Budapest-U-Bahn.ogg/2010-10-03-Budapest-U-Bahn.ogg.160p.ogv");

		// webView.loadUrl("http://upload.wikimedia.org/wikipedia/commons/transcoded/6/69/2010-10-03-Budapest-U-Bahn.ogg/2010-10-03-Budapest-U-Bahn.ogg.480p.webm");
		// webView.loadUrl("http://upload.wikimedia.org/wikipedia/commons/6/69/2010-10-03-Budapest-U-Bahn.ogg");
		// webView.loadUrl("android.resource://com.authorwjf.talk2me/res/raw/index.html");//http://upload.wikimedia.org/wikipedia/commons/2/2c/LSF_Vocab_demander.ogg");
		// webView.loadUrl(
		// "http://www.elix-lsf.fr/spip.php?page=recherche_definitions&recherche=je");
		// webView.loadUrl("file:///storage/extSdCard/video/index.html");

	}

	/*
	 * private String getDownloadButtonOnly(String url) throws IOException{
	 * HttpGet pageGet = new HttpGet(url);
	 * 
	 * ResponseHandler<String> handler = new ResponseHandler<String>() { public
	 * String handleResponse(HttpResponse response) throws
	 * ClientProtocolException, IOException { HttpEntity entity =
	 * response.getEntity(); String html;
	 * 
	 * if (entity != null) { html = EntityUtils.toString(entity); return html; }
	 * else { return null; } } };
	 * 
	 * String pageHTML = null; while (pageHTML==null){ pageHTML
	 * =pageGet.toString(); // client.execute(pageGet, handler);
	 * 
	 * }
	 * 
	 * Pattern pattern =
	 * Pattern.compile("<h2>Direct Down.+?</h2>(</div>)*(.+?)<.+?>",
	 * Pattern.DOTALL); Matcher matcher = pattern.matcher(pageHTML); String
	 * displayHTML = null; while(matcher.find()){ displayHTML = matcher.group();
	 * }
	 * 
	 * return displayHTML; }
	 * 
	 * @Override public void customizeWebView(final ServiceCommunicableActivity
	 * activity, final WebView webview, final SearchResult mRom) {
	 * mRom.setFileSize(getFileSize(mRom.getURLSuffix()));
	 * webview.getSettings().setJavaScriptEnabled(true); WebViewClient
	 * anchorWebViewClient = new WebViewClient() {
	 * 
	 * @Override public void onPageStarted(WebView view, String url, Bitmap
	 * favicon) { super.onPageStarted(view, url, favicon); String
	 * downloadButtonHTML = getDownloadButtonOnly(url);
	 * if(downloadButtonHTML!=null && !url.equals(lastLoadedURL)){ lastLoadedURL
	 * = url; webview.loadDataWithBaseURL(url, downloadButtonHTML, null,
	 * "utf-8", url); } } } }
	 */

	public class WebAppInterface {
		Context mContext;

		/** Instantiate the interface and set the context */
		WebAppInterface(Context c) {
			mContext = c;
			Log.d("WebAppInterface", c.toString());
		}

		/** Show a toast from the web page */
		@JavascriptInterface
		public void showToast(String toast) {
			Log.d("WebAppInterface", "trying to toast " + toast);
			Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
		}
	}
	public int debug=0;
	public void addVideoViewFromPath(String path) {
		 
		
		if (SLVideoActivated){
		// addTextOnVideo("addVideoViewFromPath"+path);
		 videoLayout.setVisibility(View.VISIBLE);
		 registerForContextMenu(videoLayout);
		
		 /*
		 videoLayout.setOnLongClickListener(new OnLongClickListener() {

				@Override
				public boolean onLongClick(View v) {
					Log.d("-------VideoLongClick","-------VideoLongClick");
					
					return true;
				}
		});
		
		 //lastOnMediaLongClick = videoLayout.getContentDescription().toString();
		 
		 videoLayout.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Log.d("-------Video Click","-------Video Click");
					lastOnMediaLongClick= findViewById(R.id.textViewOnVideo).toString();
					//return true;
				}
		});*/
		 
		 
		 
		Log.d("VideoView", "adding Video ViewFromPath");
		// String mUrl =
		// "http://www.itriangletechnolabs.com/projects/cyberPt/video/1361439400.mp4";
		// String mUrl =
		// Environment.getExternalStorageDirectory().getAbsolutePath()
		// +"/"+"hexasense/hexasense.mp4"
		// ;//"/sdcard/Clips vidéo/a-original.mp4";
		String mUrl = path;

		Log.d("VideoView", "adding Video ViewFromPath" + mUrl.toString());
		// String mUrl = Environment.getExternalStorageDirectory().getPath()
		// +"/video/a.wmv";
		// String mUrl = "/storage/extSdCard/video/a.wmv";
		// String mUrl
		// ="http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4?1361382411";///storage/extSdCard/video/demander.mp4";//a-original.mp4";//OK
		// String mUrl
		// ="http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4?1361382411";///storage/extSdCard/video/demander.mp4";//a-original.mp4";//OK//
		// String mUrl =
		// ("http://www.lsf-bordeaux.fr/images/video/alphabet/b.mp4");//not KO
		// working but need async
		// String mUrl
		// ="http://upload.wikimedia.org/wikipedia/commons/c/cc/LSF_Vocab_aider.ogg";
		// String mUrl =("/storage/extSdCard/video/LSF_Vocab_automatique.ogg");
		// String SrcPath = "/sdcard/Video/Android in Spaaaaaace!_low.mp4";
		VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);
		
		//addTextOnVideo(mUrl);
		
		// VideoView mVideoView0 = (VideoView)findViewById(R.id.videoView0);
		try {
			MediaController videoMediaController = new MediaController(this);

			mVideoView.setVideoPath(mUrl);
			videoMediaController.setMediaPlayer(mVideoView);
			// videoMediaController.setMediaPlayer(mVideoView);
			// videoMediaController.setMediaPlayer(mVideoView);
			// videoMediaController.setMediaPlayer(mVideoView);
			// mVideoView.setMediaController(videoMediaController);//only for
			// user media control
			// if mVideoView.get
			mVideoView.setOnCompletionListener((OnCompletionListener) this);// setMediaController(videoMediaController);//only
																			// for
																			// user
																			// media
																			// control
			 mVideoView.setOnPreparedListener((OnPreparedListener)this);
			// mVideoView.setOnInfoListener((OnInfoListener)this);//app17
			// mVideoView.requestFocus();
			mVideoView.start();

		} catch (Exception e) {
			Log.d("MEDIA_PLAYER", e.getMessage());
			if ( e.getMessage()=="(Error (1,-2147483648))")Log.d("MEDIA_PLAYER", e.getMessage());
		} /*
		 * catch (IllegalArgumentException e) { Log.d("MEDIA_PLAYER",
		 * e.getMessage()); } catch (IllegalStateException e) {
		 * Log.d("MEDIA_PLAYER", e.getMessage()); }
		 */
		// mVideoView.
		/*
		 * mVideoView0.setVideoPath(mUrl);
		 * videoMediaController.setMediaPlayer(mVideoView0);
		 * mVideoView0.setMediaController(videoMediaController);
		 * mVideoView0.requestFocus(); mVideoView0.start();
		 */

	}else  findViewById(R.id.videoView1).setVisibility(View.GONE);

	}	
	int videoCounter = 0;
	
	@Override
	public void onPrepared(MediaPlayer mp) {
		
		Log.d("player", "videoReady" + mp.toString() + " ms:" + mp.getDuration()
				+ "");
		//mp.setAuxEffectSendLevel(0);// noSound
		mp.setVolume(0, 0);// noSound from mediaPlayer
		//addTextOnVideo("lol");
		if (debug==1)addTextOnVideo("onPrepared"+ mp.getCurrentPosition()+ " ms:" +mp.getDuration() +" Vid"+videoCounter);
		
		//addTextOnVideo("oncompletion"+signLanguageVideo[signLanguageVideoCounter-1]);
		if(signLanguageVideoCounter>1) lastOnVideoLongClick=signLanguageVideo[signLanguageVideoCounter-1];
		else if (signLanguageVideo[0]!=null)lastOnVideoLongClick=signLanguageVideo[0];
		// mp.setVideoScalingMode(mp.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
	}
	
    /*onInfoListener need API 17  
     @Override
	public boolean onInfo(MediaPlayer mp,int what,int extra) {
		Log.d("player", "onInfoListener" + "videoReady" + mp.toString() + ""
				+ mp.getDuration() + "");

		// +mp.MEDIA_INFO_BUFFERING_START +mp.MEDIA_INFO_BUFFERING_END+
		// mp.MEDIA_INFO_VIDEO_RENDERING_START);
		mp.setAuxEffectSendLevel(0);// noSound
		addTextOnVideo("on infolistener");
		return true;
	}*/

	@Override
	public void onCompletion(MediaPlayer mp) {
		Log.d("player",
				"playback complete" + mp.toString() + "" + mp.getDuration()
						+ "");
		Log.d("player", "playback complete");
		
		
		//addTextOnVideo("on Completion"+mp.getCurrentPosition()+"/"+mp.getDuration()+"ms "+mp.getVideoWidth()+"x"+mp.getVideoHeight());
				//+mp.setNextMediaPlayer (next)toString());
		// mp.setNextMediaPlayer(next)
//
		
		/*
		 * currentVideo++; if (currentVideo > videoList.size() - 1) {
		 * currentVideo = 0; } mediaPlayer.release();
		 * playVideo(videoList.get(currentVideo));
		 */
		// Boolean playLoop =false;
		// mp.addTimedTextSource(fd, mimeType)
		// mp.isPlaying()
		// mp.addTimedTextSource(path, mimeType)
		Boolean playLoop = true;
		if ((signLanguageVideo != null)) {
			// if (videoCounter>=9){videoCounter=0;}else{videoCounter++;}
			// for (int i=0;i< signLanguageVideo.length;i++){
			if (signLanguageVideoCounter >= signLanguageVideo.length)
				if (playLoop)
					signLanguageVideoCounter = 0;

			if (signLanguageVideoCounter < signLanguageVideo.length) {
				try {
					VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);
					// VideoView mVideoView0 =
					// (VideoView)findViewById(R.id.videoView0);
					MediaController videoMediaController = new MediaController(
							this);
					// http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4

					// mVideoView.setVideoPath("/storage/extSdCard/video/a-original.mp4");
					//mVideoView.setVideoPath(signLanguageVideo[signLanguageVideoCounter]);
					
					if (signLanguageVideo[signLanguageVideoCounter] != "")
						{
						
						try {
							File file;
							file= new File(signLanguageVideo[signLanguageVideoCounter]);
							boolean fileOK=false;
							if (file.isFile()&&file.length()>10000)fileOK=true;
							file=null;
							//if (file.isFile()&&file.length()>10000)mVideoView.setVideoPath(signLanguageVideo[signLanguageVideoCounter]);
							if (fileOK)mVideoView.setVideoPath(signLanguageVideo[signLanguageVideoCounter]);
							else { mVideoView.setVideoPath("/storage/extSdCard/video/a-original.mp4");
							mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" 
									+ R.raw.ateraction));
							}
							file=null;
						} catch (Exception e) {
							Log.d("MEDIA_PLAYER", e.getMessage());
							e.printStackTrace();
							mVideoView
							.setVideoPath("/storage/extSdCard/video/a-original.mp4");
						}
					//addTextOnVideo("onCompletion"+ signLanguageVideo[signLanguageVideoCounter]);
						}
					else
						mVideoView
								.setVideoPath("/storage/extSdCard/video/a-original.mp4");

					// mVideoView.setVideoPath("http://www.lsf-bordeaux.fr/images/video/alphabet/0"+videoCounter+".mp4");
					// mVideoView.setVideoPath("http://commons.wikimedia.org/wiki/File:LSF_Vocab_automatique.ogg");
					// mVideoView.setVideoPath("/storage/extSdCard/video/LSF_Vocab_automatique.ogg");
					// mVideoView.setVideoPath("/storage/extSdCard/video/a-original.mp4");
					videoMediaController.setMediaPlayer(mVideoView);
					// videoMediaController.setMediaPlayer(mVideoView);
					// mVideoView.setMediaController(videoMediaController);//only
					// for user media control
					// mVideoView.setOnCompletionListener((OnCompletionListener)
					// this);//setMediaController(videoMediaController);//only
					// for user media control

					// mVideoView.requestFocus();//don't use with a scroll
					// interface =autoscroll
					
					mVideoView.start();
				} catch (IllegalArgumentException e) {
					Log.d("MEDIA_PLAYER", e.getMessage());
					
				} catch (IllegalStateException e) {
					Log.d("MEDIA_PLAYER", e.getMessage());
				}
				catch (Exception e) {
					Log.d("MEDIA_PLAYER", e.getMessage());
					
				}
				
				signLanguageVideoCounter++;
				//addTextOnVideo("on Completion"+"signLanguageVideoCounter"+signLanguageVideoCounter);
				Log.d("OnVideoCompletion", " ending signLanguageVideoCounter"
						+ signLanguageVideoCounter);
				//valueTV.setText(valueTV.getText()+"-------Completion "+signLanguageVideo.toString());
				if (debug==1)valueTV.setText(valueTV.getText()+"-------Completion "+signLanguageVideo.toString() +" "+signLanguageVideoCounter+" "+signLanguageVideo[signLanguageVideoCounter-1]+ "--");
			addTextOnVideo("oncompletion"+signLanguageVideo[signLanguageVideoCounter-1]);
				// playVideo("/storage/extSdCard/video/a-original.mp4");
			}// fi

		}
	}

	public void addHscrollVideoViewFromPath() {
		// String mUrl =
		// "http://www.itriangletechnolabs.com/projects/cyberPt/video/1361439400.mp4";
		// String mUrl = "/sdcard/Clips vidéo/a-original.mp4";
		// String mUrl = Environment.getExternalStorageDirectory().getPath()
		// +"/video/a.wmv";
		// String mUrl = "/storage/extSdCard/video/a.wmv";
		// String mUrl = "/storage/extSdCard/video/a-original.mp4";//OK

		LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);

		/*
		 * for (int i=0;i<listCounter;i++){
		 * 
		 * ImageView btnImageView4=new ImageView(this);
		 * btnImageView4.setLayoutParams(lparams);
		 * btnImageView4.setBackgroundResource( words2ImageResult[i].imageID);
		 * 
		 * hscrollLayout2.addView(btnImageView4, i);
		 * 
		 * 
		 * }
		 */
		String mUrl = "/storage/extSdCard/video/a-original.mp4";// OK
		// String mUrl =
		// ("http://www.lsf-bordeaux.fr/images/video/alphabet/a.mp4");//KO????Need
		// assync or preload

		// String SrcPath = "/sdcard/Video/Android in Spaaaaaace!_low.mp4";
		// VideoView mVideoView = (VideoView)findViewById(R.id.videoView1);

		// VideoView mVideoView0 = (VideoView)findViewById(R.id.videoView0);
		VideoView mVideoView0 = new VideoView(this);
		mVideoView0.setLayoutParams(lparams);

		MediaController videoMediaController = new MediaController(this);
		mVideoView0.setVideoPath(mUrl);
		hscrollLayout0.addView(mVideoView0, 0);

		videoMediaController.setMediaPlayer(mVideoView0);
		mVideoView0.setMediaController(videoMediaController);
		mVideoView0.requestFocus();
		mVideoView0.start();

	}

	public void imageGet(String link, Bitmap bitmap, ImageView imageView) {
		URL newurl;
		try {
			newurl = new URL(link);
			try {
				bitmap = BitmapFactory.decodeStream(newurl.openConnection()
						.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		imageView.setImageBitmap(bitmap);
	}

	public static void mp4ToSd() {

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		// Object bmp=myBitmap;

		Object bmp = new Object();
		bmp = getBitmapFromURL("https://www.gravatar.com/avatar/32cacab3fbb7588eb35653f4005d4c2f?s=32&d=identicon&r=PG");
		/*--- you can select your preferred CompressFormat and quality. 
		 * I'm going to use JPEG and 100% quality ---*/
		((Bitmap) bmp).compress(Bitmap.CompressFormat.JPEG, 100, bytes);

		/*--- create a new file on SD card ---*/
		File file = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "hexasense" + File.separator
				+ "myhexaDownloadedImage.jpg");// +File.separator+"hexasense" +

		try {
			file.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos;
		/*--- create a new FileOutputStream and write bytes to file ---*/
		boolean fosCreated = false;
		try {
			fos = new FileOutputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (fosCreated) {
			try {

				fos = new FileOutputStream(file);
				fos.write(bytes.toByteArray());
				fos.close();
				// Toast.makeText(this, "Image saved",
				// Toast.LENGTH_SHORT).show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// return (Bitmap) bmp;
	}

	public void DownloadFile(String fileURL, String fileName) {
		try {
			File root = Environment.getExternalStorageDirectory();
			URL u = new URL(fileURL);
			HttpURLConnection c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("GET");
			c.setDoOutput(true);
			c.connect();
			FileOutputStream f = new FileOutputStream(new File(root, fileName));

			InputStream in = c.getInputStream();

			byte[] buffer = new byte[1024];
			int len1 = 0;
			while ((len1 = in.read(buffer)) > 0) {
				f.write(buffer, 0, len1);
			}
			f.close();
		} catch (Exception e) {
			// Log.d("Downloader", e.getMessage());
		}

	}

	public void textWrite(String string) {
		// Writing a file...

		try {
			// catches IOException below
			final String TESTSTRING = string;// new String("Hello Android");

			/*
			 * We have to use the openFileOutput()-method the ActivityContext
			 * provides, to protect your file from others and This is done for
			 * security-reasons. We chose MODE_WORLD_READABLE, because we have
			 * nothing to hide in our file
			 */
			FileOutputStream fOut = openFileOutput("samplefile.txt",
					MODE_WORLD_READABLE);
			OutputStreamWriter osw = new OutputStreamWriter(fOut);

			// Write the string to the file
			osw.write(string);

			/*
			 * ensure that everything is really written out and close
			 */
			osw.flush();
			osw.close();

			// Reading the file back...

			/*
			 * We have to use the openFileInput()-method the ActivityContext
			 * provides. Again for security reasons with openFileInput(...)
			 */

			FileInputStream fIn = openFileInput("samplefile.txt");
			InputStreamReader isr = new InputStreamReader(fIn);

			/*
			 * Prepare a char-Array that will hold the chars we read back in.
			 */
			char[] inputBuffer = new char[TESTSTRING.length()];

			// Fill the Buffer with data from the file
			isr.read(inputBuffer);

			// Transform the chars to a String
			String readString = new String(inputBuffer);

			// Check if we read back the same chars that we had written out
			boolean isTheSame = TESTSTRING.equals(readString);

			Log.i("File Reading stuff", "success = " + isTheSame);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	
	
	
	
	public  String textReadWrite(String fileInput,String item, String copyFromRef) {
		// read a file...

		try {
			// catches IOException below
			//final String TESTSTRING = string;// new String("Hello Android");

			/*
			 * We have to use the openFileOutput()-method the ActivityContext
			 * provides, to protect your file from others and This is done for
			 * security-reasons. We chose MODE_WORLD_READABLE, because we have
			 * nothing to hide in our file
			 */
			
			//FileOutputStream fOut = openFileOutput("samplefile.txt",	MODE_WORLD_READABLE);
			//OutputStreamWriter osw = new OutputStreamWriter(fOut);
			
			// Write the string to the file
			//osw.write(string);

			/*
			 * ensure that everything is really written out and close
			 */
			//osw.flush();
			//osw.close();
			 
			// Reading the file back...

			/*
			 *usinng openFileInput()-method the ActivityContext
			 * provides. Again for security reasons with openFileInput(...)
			 */
			//Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" ");
			String ret = "";
			//this.getApplicationContext()
			File file= this.getApplicationContext().getFilesDir();
			file.mkdir();
			String filePath=file.getPath();
			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			
			String[] array=filePath.split("/");
			for(int t=0; t< array.length -1 ;t++)
			{
				Log.d("TextRead-create directory","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			    file=new File(file,array[t]);
			    file.mkdir();
			}
			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			File f=new File(file,array[array.length-1]);

			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath + f.getAbsolutePath().toString());
			
		//	RandomAccessFileOutputStream rvalue = new RandomAccessFileOutputStream(f,append);
			
			
			
	

        	//File file = new File ("/ data / data / com.alex.datasave / files / user.txt");
        	//fis = new FileInputStream (file); 
        
			//FileInputStream fis = new FileInputStream (new File(fileInput));

			//FileInputStream fIn = openFileInput(fileInput);//"samplefile.txt");
			FileInputStream fIn = new FileInputStream (new File(fileInput));
			
			InputStreamReader isr = new InputStreamReader(fIn);
			
			//using a bufferedReader to handle line acces
			BufferedReader bufferedReader = new BufferedReader(isr);
			 bufferedReader.mark(99999999);
            String receiveString = "";
            StringBuilder stringBuilder = new StringBuilder();
			String oldItem="";
            int	line=0;
            int lineIndex=-1;
            int lineIndex2=-1;
           
            File fileOut = new File (Environment.getExternalStorageDirectory()+"/Hexasense/image","ImageList2.txt" );//fileInput);
            //fileOut.mkdir();
            //fileOut.createTempFile("prefix", "suffix");//
           fileOut.createNewFile();	
            
            Log.d("TextRead","OutputStreamWriter "+"out  ="+"   OutputStreamWriter(openFileOutput(fileOut.toURI().getPath() "+ fileOut.toURI().getPath());
            //OutputStreamWriter out = new OutputStreamWriter(openFileOutput(fileOut.getAbsolutePath(),Context.MODE_WORLD_READABLE));
            OutputStreamWriter out = new OutputStreamWriter(openFileOutput("cache.txt",0));
            BufferedWriter bwriter = new BufferedWriter(out);
            // write the contents to the file
            bwriter.write("Input String"); //Enter the string here
            bwriter.newLine();
          
           
            Log.d("TextRead-Searching B replaceA by B "+item +"line"+line,"search in  "+receiveString+ " to find  "+copyFromRef+"  inRefReplace for item "+item+ "at "+ lineIndex+" "+line);
            while ( ((receiveString = bufferedReader.readLine()) != null )&&(lineIndex2==-1)) {//&&lineIndex==0
            	 //Log.d("TextRead-Searching B replaceA by B "+copyFromRef +"line"+line,"search in  "+receiveString+ " to find  "+copyFromRef+"  inRefReplace for item "+item+ "at "+ lineIndex+" "+line);
				if (receiveString.contains(copyFromRef)){
					oldItem=receiveString.substring(receiveString.indexOf(" ")+1)+"azerty";
					//stringBuilder.append(item +" "+ oldItem);
					//stringBuilder.append(item +" "+ writeIn);
					Log.d("TextRead-Searching replaceA by B foundB "+copyFromRef +"line"+line," Found originalRef:"+ "line"+line+ " receiveString contain copyFromRef"+copyFromRef+"     "+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
					lineIndex2=line;
				}
            line++;
            }
            
            if (lineIndex2==-1){
            	Log.e("TextRead for B finished without result","receiveString"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
                 
            }
            
            Log.d("TextRead for B finished","receiveString"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
            Log.d("TextRead-Searching A replaceA by B "+item +"line"+line,"search in  "+receiveString+ " to find  "+copyFromRef+"  inRefReplace for item "+item+ "at "+ lineIndex+" "+line);
           
            bufferedReader.reset();
          //  bufferedReader.read(buffer, offset, length);
            while ( ((receiveString = bufferedReader.readLine()) != null )&&((lineIndex==-1))) {//&&lineIndex==0
            	// Log.d("TextRead-Searching A replaceA by B "+item +"line"+line,"search in  "+receiveString+ " to find  " +item+" inRefReplace by "+copyFromRef+ "at "+ lineIndex+" "+line);
            	if (receiveString.contains(item)){
					
					  bwriter.write(item +" "+ oldItem+"azerty"); 
			          bwriter.newLine();
			          
					stringBuilder.append(item +" "+ oldItem+"azerttyt");
					//stringBuilder.append(item +" "+ oldItem);
					Log.d("TextRead-Searching replaceA>B foundA "+item ," receiveString contain item"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
					lineIndex=line;
					}
				else {
					
					Log.d("TextRead","write receiveString "+receiveString);
					 bwriter.write(receiveString+"azertytyty"); //just copy
			          bwriter.newLine();
									
				}
				
				
			//Log.d("TextRead","receiveString"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
				//stringBuilder.append(receiveString);//OK this is working
			    //stringBuilder.append(receiveString +"TextRead-Searching replaceA>B foundA "+item +" receiveString contain item"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);//OK this is working
				//stringBuilder.insert(0, "stringBuilder.insert");
				//stringBuilder.insert(0, "stringBuilder.insert");
				line++;
            }
            
            bwriter.flush();
            bwriter.close();
            //out.flush();//Dont flush may crash
            out.close();
           // Scanner scanner = new Scanner(aLine);
           // bwriter.close();//if closed make an error
           
            fIn.close();
            bufferedReader.close();
			   isr.close();
			   File fileIn = new File (Environment.getExternalStorageDirectory()+"Hexasense/image","ImageListRenamed.txt" );//fileInput);
			   fileOut.renameTo(fileIn);
			  // fileOut.
	          //  ret = stringBuilder.toString();
	           /* The following error:

	            	java.lang.RuntimeException: java.lang.IllegalArgumentException: File / data / data / com.alex.datasave / files / user.txt contains a path separator


	            	Original code:

	            	fis = this.context.openFileInput ("/ data / data / com.alex.datasave / files / user.txt");


	            	Correct code:

	            	File file = new File ("/ data / data / com.alex.datasave / files / user.txt");
	            	fis = new FileInputStream (file); 
	            
	            */         
	         // Get the directory for the user's public pictures directory. 
	           // File file15 = new File(Environment.getExternalStorageDirectory()+"Hexasense/image","ImageList.txt" );
            
	      
	            
	            
	           /* 
	            
	            File fileOut = new File (Environment.getExternalStorageDirectory()+"Hexasense/image","ImageList2.txt" );//fileInput);
	            fileOut.mkdir();
	           
	            Log.d("after find", "  fileInput "+fileInput+" FilelOut"+fileOut);
	        	FileOutputStream fOut = openFileOutput("ImageList2.txt",Context.MODE_WORLD_READABLE);//fileOut.toString(),Context.MODE_WORLD_READABLE);//	MODE_WORLD_READABLE);
				OutputStreamWriter osw = new OutputStreamWriter(fOut);
				
				Log.d("Write ret to the file",ret);
				//Write the string to the file
				osw.write(ret);

				
				//  ensure that everything is really written out and close
				 
				osw.flush();
				osw.close();    
	            */
	            
			
			
			//Prepare a char-Array that will hold the chars we read back in.
			//char[] inputBuffer = new char[TESTSTRING.length()];
			// Fill the Buffer with data from the file
			//isr.read(inputBuffer);
			// Transform the chars to a String
			//String readString = new String(inputBuffer);
			// Check if we read back the same chars that we had written out
			//boolean isTheSame = TESTSTRING.equals(readString);

			Log.i("File Reading stuff", "success = " );
			return ("ret");
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
			Log.e("error while reading",""+ioe.toString());
			return ("");
		}
	}
	public  String textRead(String fileInput,String item, String copyFromRef) {
		// read a file...

		try {
			// catches IOException below
			//final String TESTSTRING = string;// new String("Hello Android");

			/*
			 * We have to use the openFileOutput()-method the ActivityContext
			 * provides, to protect your file from others and This is done for
			 * security-reasons. We chose MODE_WORLD_READABLE, because we have
			 * nothing to hide in our file
			 */
			
			//FileOutputStream fOut = openFileOutput("samplefile.txt",	MODE_WORLD_READABLE);
			//OutputStreamWriter osw = new OutputStreamWriter(fOut);
			
			// Write the string to the file
			//osw.write(string);

			/*
			 * ensure that everything is really written out and close
			 */
			//osw.flush();
			//osw.close();
			 
			// Reading the file back...

			/*
			 * We have to use the openFileInput()-method the ActivityContext
			 * provides. Again for security reasons with openFileInput(...)
			 */
			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" ");
			String ret = "";
			//this.getApplicationContext()
			File file= this.getApplicationContext().getFilesDir();
			file.mkdir();
			String filePath=file.getPath();
			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			
			String[] array=filePath.split("/");
			for(int t=0; t< array.length -1 ;t++)
			{
				Log.d("TextRead-create directory","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			    file=new File(file,array[t]);
			    file.mkdir();
			}
			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath);
			File f=new File(file,array[array.length-1]);

			Log.d("TextRead","file"+fileInput+ "item "+item+ "copyFromRef "+ copyFromRef+" "+"filePath"+filePath + f.getAbsolutePath().toString());
			
		//	RandomAccessFileOutputStream rvalue = new RandomAccessFileOutputStream(f,append);
			
			
			
	

        	//File file = new File ("/ data / data / com.alex.datasave / files / user.txt");
        	//fis = new FileInputStream (file); 
        
			//FileInputStream fis = new FileInputStream (new File(fileInput));

			//FileInputStream fIn = openFileInput(fileInput);//"samplefile.txt");
			FileInputStream fIn = new FileInputStream (new File(fileInput));
			
			InputStreamReader isr = new InputStreamReader(fIn);
			
			//using a bufferedReader to handle line acces
			BufferedReader bufferedReader = new BufferedReader(isr);
            String receiveString = "";
            StringBuilder stringBuilder = new StringBuilder();
			String oldItem="";
            int	line=0;
            int lineIndex=0;
            int lineIndex2=0;
			while ( ((receiveString = bufferedReader.readLine()) != null )&&((lineIndex==0)||(lineIndex2==0))) {//&&lineIndex==0
				if (receiveString.contains(item)){
					
					stringBuilder.append(item +" "+ oldItem);
					Log.d("TextRead","receiveString contain item"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
					lineIndex=line;
				}
				if (receiveString.contains(copyFromRef)){
					oldItem=receiveString.substring(receiveString.indexOf(" ")+1);
					stringBuilder.append(item +" "+ oldItem);
					//stringBuilder.append(item +" "+ writeIn);
					Log.d("TextRead","receiveString contain copyFromRef"+copyFromRef+"     "+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
					lineIndex2=line;
				}
				
			Log.d("TextRead","receiveString"+receiveString+ "item "+item+ "at "+ lineIndex+" "+line);
				stringBuilder.append(receiveString);
				line++;
            }
		
			   isr.close();
	            ret = stringBuilder.toString();
	           /* The following error:

	            	java.lang.RuntimeException: java.lang.IllegalArgumentException: File / data / data / com.alex.datasave / files / user.txt contains a path separator


	            	Original code:

	            	fis = this.context.openFileInput ("/ data / data / com.alex.datasave / files / user.txt");


	            	Correct code:

	            	File file = new File ("/ data / data / com.alex.datasave / files / user.txt");
	            	fis = new FileInputStream (file); 
	            
	            */         
	         // Get the directory for the user's public pictures directory. 
	           // File file15 = new File(Environment.getExternalStorageDirectory()+"Hexasense/image","ImageList.txt" );
            
	            
	            
	            
	            
	            File fileOut = new File (Environment.getExternalStorageDirectory()+"Hexasense/image","ImageList2.txt" );//fileInput);
	            fileOut.mkdir();
	           
	            Log.d("after find", "  fileInput "+fileInput+" FilelOut"+fileOut);
	        	FileOutputStream fOut = openFileOutput("ImageList2.txt",Context.MODE_WORLD_READABLE);//fileOut.toString(),Context.MODE_WORLD_READABLE);//	MODE_WORLD_READABLE);
				OutputStreamWriter osw = new OutputStreamWriter(fOut);
				
				Log.d("Write ret to the file",ret);
				//Write the string to the file
				osw.write(ret);

				/*
				 * ensure that everything is really written out and close
				 */
				osw.flush();
				osw.close();    
	            
	            
			
			
			//Prepare a char-Array that will hold the chars we read back in.
			//char[] inputBuffer = new char[TESTSTRING.length()];
			// Fill the Buffer with data from the file
			//isr.read(inputBuffer);
			// Transform the chars to a String
			//String readString = new String(inputBuffer);
			// Check if we read back the same chars that we had written out
			//boolean isTheSame = TESTSTRING.equals(readString);

			Log.i("File Reading stuff", "success = " );
			return ("ret");
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
			Log.e("error while reading",""+ioe.toString());
			return ("");
		}
	}

	
	
	public static Bitmap getBitmapFromURL(String link) {

		Object bmp;
		/*--- this method downloads an Image from the given URL, 
		 *  then decodes and returns a Bitmap object
		    ---*/
		try {
			URL url = new URL(link);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setDoInput(true);
			connection.connect();
			InputStream input = connection.getInputStream();
			Bitmap myBitmap = BitmapFactory.decodeStream(input);
			bmp = myBitmap;
			// return myBitmap;

		} catch (IOException e) {
			e.printStackTrace();
			Log.e("getBmpFromUrl error: ", e.getMessage().toString());
			return null;
		}

		/*--- this method will save your downloaded image to SD card ---*/

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		// Object bmp=myBitmap;
		// bmp = getBitmapFromURL(url);
		// bmp=new Object();
		/*--- you can select your preferred CompressFormat and quality. 
		 * I'm going to use JPEG and 100% quality ---*/
		((Bitmap) bmp).compress(Bitmap.CompressFormat.JPEG, 100, bytes);
		/*--- create a new file on SD card ---*/
		File file = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "myDownloadedImage.jpg");
		try {
			file.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos;
		/*--- create a new FileOutputStream and write bytes to file ---*/
		boolean fosCreated = false;
		try {
			fos = new FileOutputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (fosCreated) {
			try {

				fos = new FileOutputStream(file);
				fos.write(bytes.toByteArray());
				fos.close();
				// Toast.makeText(this, "Image saved",
				// Toast.LENGTH_SHORT).show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return (Bitmap) bmp;
	}
	
	
	void rotateFromEXIF(ImageView imageView,String fileName){
	
	ExifInterface exif;
	// btnImageView4.setRotation(90);

	try {
		exif = new ExifInterface(
				Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense"
						+ File.separator
						+ fileName + ".jpg");

		Log.v("Searching EXIF",
				""
						+ fileName
						+ " orientation "
						+ exif.getAttribute(ExifInterface.TAG_ORIENTATION)
						+ " EXIF    " + exif.toString()
						+ " EndOfExif");
		/*
		 * public static final int ORIENTATION_FLIP_HORIZONTAL
		 * Added in API level 5 * Constant Value: 2 (0x00000002)
		 * 
		 * 
		 * 
		 * public static final int ORIENTATION_FLIP_VERTICAL
		 * Added in API level 5 * Constant Value: 4 (0x00000004)
		 * 
		 * public static final int ORIENTATION_NORMAL Added in
		 * API level 5 Constant Value: 1 (0x00000001)
		 * 
		 * public static final int ORIENTATION_ROTATE_180 Added
		 * in API level 5 Constant Value: 3 (0x00000003)
		 * 
		 * public static final int ORIENTATION_ROTATE_270 Added
		 * in API level 5 Constant Value: 8 (0x00000008)
		 * 
		 * public static final int ORIENTATION_ROTATE_90 Added
		 * in API level 5 Constant Value: 6 (0x00000006)
		 * 
		 * public static final int ORIENTATION_TRANSPOSE Added
		 * in API level 5 Constant Value: 5 (0x00000005)
		 * 
		 * public static final int ORIENTATION_TRANSVERSE Added
		 * in API level 5 Constant Value: 7 (0x00000007)
		 * 
		 * public static final int ORIENTATION_UNDEFINED Added
		 * in API level 5 * Constant Value: 0 (0x00000000)
		 */
		Log.v("EXIF ",exif.getAttribute(ExifInterface.TAG_ORIENTATION));
		if ((0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("0") ))
				|| (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("1") ))) {
			Log.v("EXIF ",exif.getAttribute(ExifInterface.TAG_ORIENTATION)+" is  normal or undefined");
		} else {
			Log.v("EXIF ",exif.getAttribute(ExifInterface.TAG_ORIENTATION)+" is not normal or undefined");
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("6") )) {
				imageView.setRotation(90);
				Log.v("image rotation", "90");

			}
			else Log.v("EXIF ",exif.getAttribute(ExifInterface.TAG_ORIENTATION)+" is not 90");
				
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("3") )) {
			imageView.setRotation(180);
				Log.v("image rotation", "180");

			}
			if ((0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("8") ))) {
			imageView.setRotation(270);
				Log.v("image rotation", "270");

			}
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("7") )) {
				// btnImageView4.setRotation(0);
				Log.v("image rotation",
						"ORIENTATION_TRANSVERSE??");

			}
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("5") )) {
				// btnImageView4.setRotation(0);
				Log.v("image rotation",
						"ORIENTATION_TRANSPOSE??");
			}
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("4") )) {
			imageView.setRotation(180);
				Log.v("image rotation",
						"ORIENTATION_TRANSVERSE??");

			}
			if (0==(exif.getAttribute(ExifInterface.TAG_ORIENTATION).compareTo("6") )) {
				// btnImageView4.setRotation(0);
				Log.v("image rotation",
						"ORIENTATION_TRANSPOSE??");
			}

			Log.v("End of of EXIF file", ""
					+fileName);

		}

	} catch (IOException e) {
		e.printStackTrace();
		Log.v("Exception whith EXIF data", ""
				+ fileName);
		Log.e("Exception whith EXIF data",
				"" + fileName + "error"
						+ e.toString());
	}
	}
	/////////////////////////////////

	public class HttpExampleActivity extends Activity {
		private static final String DEBUG_TAG = "HttpExample";
		private EditText urlText;
		private TextView textView;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			// setContentView(R.layout.main);
			// urlText = (EditText) findViewById(R.id.myUrl);
			// textView = (TextView) findViewById(R.id.myText);
		}

		// When user clicks button, calls AsyncTask.
		// Before attempting to fetch the URL, makes sure that there is a
		// network connection.
		public void myClickHandler(View view) {
			// Gets the URL from the UI's text field.
			String stringUrl = urlText.getText().toString();
			ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
			if (networkInfo != null && networkInfo.isConnected()) {
				new DownloadWebpageTask().execute(stringUrl);
			} else {
				textView.setText("No network connection available.");
			}
		}

		// Uses AsyncTask to create a task away from the main UI thread. This
		// task takes a
		// URL string and uses it to create an HttpUrlConnection. Once the
		// connection
		// has been established, the AsyncTask downloads the contents of the
		// webpage as
		// an InputStream. Finally, the InputStream is converted into a string,
		// which is
		// displayed in the UI by the AsyncTask's onPostExecute method.
		private class DownloadWebpageTask extends
				AsyncTask<String, Void, String> {
			@Override
			protected String doInBackground(String... urls) {

				// params comes from the execute() call: params[0] is the url.
				try {
					return downloadUrl(urls[0]);
				} catch (IOException e) {
					return "Unable to retrieve web page. URL may be invalid.";
				}
			}

			// onPostExecute displays the results of the AsyncTask.
			@Override
			protected void onPostExecute(String result) {
				textView.setText(result);
			}
		}

		// ...

		// Given a URL, establishes an HttpUrlConnection and retrieves
		// the web page content as a InputStream, which it returns as
		// a string.
		private String downloadUrl(String myurl) throws IOException {
			InputStream is = null;
			// Only display the first 500 characters of the retrieved
			// web page content.
			int len = 500;

			try {
				URL url = new URL(myurl);
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				conn.setReadTimeout(10000 /* milliseconds */);
				conn.setConnectTimeout(15000 /* milliseconds */);
				conn.setRequestMethod("GET");
				conn.setDoInput(true);
				// Starts the query
				conn.connect();
				int response = conn.getResponseCode();
				Log.d(DEBUG_TAG, "The response is: " + response);
				is = conn.getInputStream();

				// Convert the InputStream into a string
				String contentAsString = readIt(is, len);
				return contentAsString;

				// Makes sure that the InputStream is closed after the app is
				// finished using it.
			} finally {
				if (is != null) {
					is.close();
				}
			}
		}

		// Reads an InputStream and converts it to a String.
		public String readIt(InputStream stream, int len) throws IOException,
				UnsupportedEncodingException {
			Reader reader = null;
			reader = new InputStreamReader(stream, "UTF-8");
			char[] buffer = new char[len];
			reader.read(buffer);
			return new String(buffer);
		}

	}

	class DownloadFile2 extends AsyncTask<String, Integer, String> {
		@Override
		protected String doInBackground(String... sUrl) {
			try {
				URL url = new URL(sUrl[0]);
				URLConnection connection = url.openConnection();
				connection.connect();
				// this will be useful so that you can show a typical 0-100%
				// progress bar
				int fileLength = connection.getContentLength();
				// download the file

				File file = new File(Environment.getExternalStorageDirectory()
						+ File.separator + "myDownloadedImage.jpg");
				try {
					file.createNewFile();

				} catch (IOException e) {
					e.printStackTrace();
				}

				InputStream input = new BufferedInputStream(url.openStream());
				OutputStream output = new FileOutputStream(
						Environment.getExternalStorageDirectory()
								+ "/file_name.extension");
				byte data[] = new byte[1024];
				long total = 0;
				int count;

				while ((count = input.read(data)) != -1) {
					total += count;
					// publishing the progress....
					publishProgress((int) (total * 100 / fileLength));
					output.write(data, 0, count);
				}
				output.flush();
				output.close();
				input.close();
			} catch (Exception e) {
			}
			return null;
		}
	}

	public class ImageAdapter extends BaseAdapter {
		private Context mContext;

		public ImageAdapter(Context c) {
			mContext = c;
		}

		public int getCount() {
			return mThumbIds.length;
		}

		public Object getItem(int position) {
			return null;
		}

		public long getItemId(int position) {
			return 0;
		}

		// create a new ImageView for each item referenced by the Adapter
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) { // if it's not recycled, initialize some
										// attributes
				imageView = new ImageView(mContext);
				imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(8, 8, 8, 8);
			} else {
				imageView = (ImageView) convertView;
			}

			imageView.setImageResource(mThumbIds[position]);
			return imageView;
		}

		// references to our images
		private Integer[] mThumbIds = { R.drawable.a, R.drawable.b,
				R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
				R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j,
				R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n,
				R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r,
				R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v,
				R.drawable.w, R.drawable.x, R.drawable.y, R.drawable.z,
				R.drawable.space, R.drawable.ic_launcher, R.drawable.france_,
				R.drawable.t, R.drawable.france, R.drawable.v, R.drawable.w };
	}

	public void copy(File src, File dst) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	public class Downloader extends Intent {
		public Object downloadFromUrl(String imageURL, String fileName) { // this
																			// is
																			// the
																			// downloader
																			// method

			File sdCard = Environment.getExternalStorageDirectory();
			File dir = new File(sdCard.getAbsolutePath() + "/" + "hexasense");// "/Hexasense");
			dir.mkdirs();
			File file = new File(dir, fileName);// "hexasense.mp4");//
												// "hexasense.txt");

			try {
				// URL url = new
				// URL("http://www.elix-lsf.fr/IMG/mp4/dhb91s4e9mpymrvijeev-encoded.mp4");
				// //+ imageURL); //you can write here any link
				URL url = new URL(imageURL.toString());
				// File file = new File(fileName);
				// File file=new File("test.mp4");
				long startTime = System.currentTimeMillis();
				Log.d("ImageManager", "download begining" + dir + " "
						+ fileName);
				Log.d("ImageManager", "download url:" + url);
				Log.d("ImageManager", "downloaded file name:" + fileName);
				/* Open a connection to that URL. */
				URLConnection ucon = url.openConnection();

				/*
				 * String companyData; final WebChromeClient webClient = new
				 * WebChromeClient(); HtmlPage page =
				 * webClient.getPage("http://www.delisted.com.au/listed.aspx");
				 * page = (page.getElementById("btnShowAll").click());
				 * companyData = page.asText(); System.out.println("RESULTS: "+
				 * companyData);
				 */

				/*
				 * Define InputStreams to read from the URLConnection.
				 */
				InputStream is = ucon.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);

				/*
				 * Read bytes to the Buffer until there is nothing more to
				 * read(-1).
				 */
				ByteArrayBuffer baf = new ByteArrayBuffer(50);
				int current = 0;
				while ((current = bis.read()) != -1) {
					baf.append((byte) current);
				}

				/* Convert the Bytes read to a String. */
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(baf.toByteArray());
				// String
				// downloaded.=(String)baf.toByteArray();//.toByteArray();
				fos.close();
				Log.d("ImageManager",
						"download ready in"
								+ ((System.currentTimeMillis() - startTime) / 1000)
								+ " sec");
				return baf;
			} catch (Exception e) {
				//Error: java.io.FileNotFoundException: https://ipv4.google.com/sorry/IndexRedirect?continue=https://www.google.com/search%3Fsafe%3Dactive%26as_st%3Dy%26tbm%3Disch%26as_q%3D%26as_epq%3Dle%26as_oq%3D%26as_eq%3D%26cr%3D%26as_sitesearch%3D%26tbs%3Disz:m%26gws_rd%3Dsslurlhttps://www.google.com/search?safe=active&as_st=y&tbm=isch&as_q=&as_epq=le&as_oq=&as_eq=&cr=&as_sitesearch=&tbs=isz:m&gws_rd=ssl file letext.txt
				Log.d("ImageManager", "Error: " + e + "url" + imageURL
						+ " file " + fileName);
				
				String path=e.getMessage();
			if (debug>0){
				path=path.substring( path.indexOf("http"));
				//findViewById(R.id.webView1).setVisibility(View.VISIBLE);
				//((WebView)findViewById(R.id.webView1)).loadUrl("http://slashdot.org/");//.loadUrl("http://www.aecom.org/");
				//.loadUrl("http://slashdot.org/");
				runBrowser(path);
				//addVideoWebViewFromPath("http://www.aecom.org");// path);
			}
				
				
				return null;
			}

		}

	}
//int lastVideo;
	public void addTextOnVideo(String text){
		 // View linearLayout =  (LinearLayout) findViewById(R.id.hscrollVerticalLayout);
	
		    //LinearLayout layout = (LinearLayout) findViewById(R.id.info);
		if (SLVideoActivated){
			//valueTV.setVisibility();
		    //TextView 
		 // valueTV = new TextView(this);
		    //valueTV.setText(text);
		//signLanguageVideo[signLanguageVideoCounter]
		if (debug==1){valueTV.setText(valueTV.getText()+" "+text);}
		
		((TextView) findViewById(R.id.textViewOnVideo)).setText("Ateraction: Loading...");
		((TextView) findViewById(R.id.textViewOnVideo)).setVisibility( View.VISIBLE);
		
		try {
			//debug infos
			if(debug==1){
				if (signLanguageVideoCounter>=signLanguageVideo.length){
					valueTV.setText(valueTV.getText()+" "+signLanguageVideo[0]);
				}
				else valueTV.setText(valueTV.getText()+" "+signLanguageVideo[signLanguageVideoCounter]);
			}
			
			//getting videoNameFrom VideofullPath
			String videoName=signLanguageVideo[signLanguageVideoCounter-1];
			
			Log.d("addTextOnVideo",videoName+" " +videoName.lastIndexOf("/", videoName.length())+" " +videoName.lastIndexOf(".mp4", videoName.length()));
				videoName=videoName.substring(
						videoName.lastIndexOf("/", videoName.length())+1,
						videoName.lastIndexOf(".", videoName.length()));
			Log.d("addTextOnVideo","ExtractedVideoName:" +videoName );
			((TextView) findViewById(R.id.textViewOnVideo)).setText(" "+videoName);
			
			//Updating the app title while videos are playing  
			String actualTitle=(String)this.getTitle();
			//actualTitle.substring(actualTitle.indexOf(videoName),actualTitle.indexOf(videoName)+videoName.length());
			actualTitle=actualTitle.toLowerCase();
			actualTitle=actualTitle.replace(videoName, videoName.toUpperCase());
			this.setTitle(actualTitle);
			//this.setTitle(this.getTitle().subSequence(0, this.getTitle().length()) );
			;
			//((TextView) findViewById(R.id.textViewOnVideo)).setText(signLanguageVideo[signLanguageVideoCounter-1]);
		}
		catch (Exception e) {
			Log.e("addTextOnVideo", e.toString());
			
			if (debug==1)valueTV.setText(valueTV.getText()+" "+ "signLanguageVideo["+signLanguageVideoCounter+"]");
			//findViewById(R.id.editText1);
			//findViewById(R.id.textViewOnVideo);
		}
		    //valueTV.setId(5);
		    //valueTV.setLayoutParams(new LayoutParams(
		       //     LayoutParams.FILL_PARENT,
		         //   LayoutParams.WRAP_CONTENT));
		}
		else findViewById(R.id.textViewOnVideo).setVisibility( View.GONE);
			//((TextView) 
		
	}
	
	
	
	
	
	class MyRecognitionListener implements RecognitionListener{
		@Override
	    public void onBeginningOfSpeech() {
	        Log.d("leapkh", "onBeginningOfSpeech");
	    }
		@Override
	    public void onBufferReceived(byte[] buffer) {
	        Log.d("leapkh", "onBufferReceived");
	    }
		@Override
	    public void onEndOfSpeech() {
	        Log.d("leapkh", "onEndOfSpeech");
	    }

		@Override
		public void onError(int error) {
			((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.RED);
	        Log.d("leapkh", "onError"+error);
	        switch (error) {
			 case SpeechRecognizer.ERROR_AUDIO:
			// setErrorMessage(R.string.errorResultAudioError);
				// speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
				 Log.d("SpeechRecognizer", "ERROR_AUDIO");
			 break;
			 case SpeechRecognizer.ERROR_CLIENT:
			// setErrorMessage(R.string.errorResultClientError);
				// speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
				 Log.d("SpeechRecognizer", "ERROR_CLIENT");
			 break;
			 case SpeechRecognizer.ERROR_NETWORK:
				 Log.d("SpeechRecognizer", "ERROR_NETWORK");
				// speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
			// setErrorMessage(R.string.errorResultNetworkError);
			 break;
			 case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
				 Log.d("SpeechRecognizer", "ERROR_NETWORK_TIMEOUT");
			// setErrorMessage(R.string.errorResultNetworkError);
			 break;
			 case SpeechRecognizer.ERROR_SERVER:
				 Log.d("SpeechRecognizer", "ERROR_SERVER");
			 //setErrorMessage(R.string.errorResultServerError);
			 break;
			 case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
				 Log.d("SpeechRecognizer", "ERROR_RECOGNIZER_BUSY");
				// recognizer.startListening(recognizerIntent);
				//MainActivity. speechRecognizer.createSpeechRecognizer();
				//MainActivity mainActivity;
				speechRecognizer.cancel();
				speechRecognizer.stopListening();
				//mainActivity.speechRecognizer.cancel();
			 //setErrorMessage(R.string.errorResultServerError);
			 break;
			 
			 case SpeechRecognizer.ERROR_NO_MATCH:
				 speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
				 Log.d("SpeechRecognizer", "ERROR_NO_MATCH");
				 //setErrorMessage(R.string.errorResultNoMatch);
			 break;
			 
			 case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
				 Log.d("SpeechRecognizer", "ERROR_SPEECH_TIMEOUT");
				 speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
				 //setErrorMessage(R.string.errorResultNoMatch);
			 break;
			 case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
				 Log.d("SpeechRecognizer", "ERROR_INSUFFICIENT_PERMISSIONS");// This is programmer error.
			 break;
			 default:
			 break;
			 }
	        
	    }

		@Override
		public void onEvent(int eventType, Bundle params) {
	        Log.d("leapkh", "onEvent");
	    }

		@Override
	    public void onPartialResults(Bundle partialResults) {
			 // This is supported (only?) by Google Voice Search.
			 // The following is Google-specific.
			 Log.i("SpeechRecognizer","onPartialResults: keySet: " + partialResults.keySet());
			 String[] results = partialResults.getStringArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS");
			 //double[] resultsConfidence = partialResults.getDoubleArray("com.google.android.voicesearch.UNSUPPORTED_PARTIAL_RESULTS_CONFIDENCE");
			 ((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.CYAN);
			 if (partialResults != null) {
			 //setPartialResult(results);
				 Log.e("VoiceSearch", "PartialResults"+partialResults );
				 //processRequest(partialResults.keySet().toArray()[0].toString());
				 ArrayList<String> matches = partialResults.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
				 //mState = State.INIT;
				// mButtonMicrophone.setState(mState);
				 if (matches!=null){
				 if (matches.isEmpty()) {
				 //toast("ERROR: No results"); // TODO
				 } else {
				 // TODO: we just take the first result for the time being
				 // TODO: confidence scores support is in API 14
				 String result = matches.iterator().next();
				// if (lastPartialResult==null)lastPartialResult="";
				// result=result.replace(lastPartialResult, "");
				// lastPartialResult=result;
				if (!SLVideoActivated){
				 if ((result!="")&&(result!=null)&& (lastPartialResult!=result)){
					 Log.d("partialResults", "---------------onpartialResults"+result);
					 if (result.isEmpty()) Log.d("partialResults", "---------------onpartialResults=null"+(result=="")+" result "+result.length());
					 else processRequest (result);
					 lastPartialResult=result;
				 }
				 //startAutoScrolling(hscrollView5);
				// stopAutoScrolling(hscrollView5);
				 
				 
				 //this.hscrollView5.
				
				 
				 //hscrollView5.getChildAt(hscrollView5.getChildCount()-1).computeScroll();
				// hscrollView5.scrollTo(hscrollView5.getChildCount()*350,0);//*hscrollView5.getChildAt(hscrollView5.getChildCount()), 0);
				// hscrollView5.getChildAt(hscrollView5.getChildCount()-1).getKeepScreenOn();
				// hscrollView5.getChildAt(hscrollView5.getChildCount()-1).animate().;
				
				 //hscrollView5.scrollTo(hscrollView5.getChildAt(hscrollView5.getChildCount()-1).getScrollX(),hscrollView5.getChildAt(hscrollView5.getChildCount()-1).getScrollY());
				 Log.d(" partial results",""+hscrollView5.getChildCount()+ "  "+hscrollView5.getChildAt(hscrollView5.getChildCount()-1).getScrollX()  );
				 hscrollView5.fullScroll(hscrollView5.FOCUS_RIGHT);
				 hscrollView5.setKeepScreenOn(true);
				}
				 //scro
				 }
				 }
				 
			 }
			 }
		@Override
	    public void onReadyForSpeech(Bundle params) {
	        Log.d("vEsperanto", "onReadyForSpeech");
	        ((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.GREEN);
	        vibrateReady();
	    }


	    
		@Override
	    public void onResults(Bundle results) {
	        Log.d("leapkh", "onResults");
	        startAutoScrolling(hscrollView5);
	        hscrollView5.fullScroll(hscrollView5.FOCUS_RIGHT);
	       
	        vibrate(400);
	        ((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.RED);
	        
	       // handler.removeCallbacks(stopListening);
			 ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
			 //mState = State.INIT;
			// mButtonMicrophone.setState(mState);
			 if (matches!=null){
			 if (matches.isEmpty()) {
			 //toast("ERROR: No results"); // TODO
			 } else {
			 // TODO: we just take the first result for the time being
			 // TODO: confidence scores support is in API 14
			 String result = matches.iterator().next();
			 Log.d("leapkh", "---------------onResults"+result);
			 if (result!=null){
				 
				 
				 
				     // mainActivity.setTitle;
					startLongRunningOperation();
					
					((TextView) findViewById(R.id.text1)).setText(
							Html.fromHtml(
							result+"   <br>   "+
							((TextView) findViewById(R.id.text1)).getText()
							
							)
							);
					if (lastPartialResult!=result)processRequest(result);hscrollView5.fullScroll(hscrollView5.FOCUS_RIGHT);
					
					lastRequest = result;
					 setTitle(result,"");
			 //processRequest(result);
			 }
			 speechRecognizer.startListening(createRecognizerIntent("fr", "fr"));
			 ((ImageButton)findViewById(R.id.button2)).setBackgroundColor(Color.BLUE);
			 hscrollView5.fullScroll(View.FOCUS_RIGHT);
		//	 startAutoScrolling(hscrollView5);
			 }
			 }
			 
	    }
	    float oldRmsdB=0;
	    @Override
	    public void onRmsChanged(float rmsdB) {
	      if (rmsdB!=oldRmsdB) Log.d("leapkh", "onRmsChanged"+rmsdB);oldRmsdB=rmsdB;
	    }
	}
	
	
	private static final int WORDLIST_SELECT_CODE =9;
	void selectWordList (){
		Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("*/*");
		intent.addCategory(Intent.CATEGORY_OPENABLE);
		// intent.putExtra("", Uri.fromFile(new File(string)));//+
		// wordsYouSaid[foundWord] + ".jpg")));

		try {
			startActivityForResult(Intent.createChooser(intent,
					"Select a file to process"),
					WORDLIST_SELECT_CODE);

		} catch (android.content.ActivityNotFoundException ex) {
			// Potentially direct the user to the Market with a Dialog
			Toast.makeText(this, "Please install a File Manager.",
					Toast.LENGTH_SHORT).show();
		}
	}
	
	void chooseList(){
		
		showTextFileChooser();
		
		
	}
	void loadList(String fileName){
		
	//showFileChooser();

		getWindow().requestFeature(Window.FEATURE_PROGRESS);

		//this.showFileChooser();
		File file;
		if (fileName==""){
			file=new File(Environment.getExternalStorageDirectory()+"/" + "hexasense/"+"wordList","EtienneBrunetWordList.txt");
		//*Don't* hardcode "/sdcard"
		/*File sdcard = Environment.getExternalStorageDirectory();
		
		//Get the text file
		
		 file = new File(sdcard+ "/" + "hexasense","wordList");
		if (!file.isDirectory()){
			file.mkdirs();
		}
		
		file = new File(sdcard+ "/" + "hexasense"+"/wordList","EtienneBrunetWordList.txt");
		
		
		if (!file.isFile()){
			raw2SD(R.raw.fr,sdcard+ "/" + "hexasense"+"/wordList"+"/"+"EtienneBrunetWordList.txt");
			
			
			//getResources().openRawResource();
			//  InputStream fis = getResources().openRawResource(this.getBaseContext().getResources().getIdentifier(sonidoActual,"raw", this.getApplicationContext().getPackageName() ));
		}*/
		
		}else file=new File(fileName);
		//showAlertDialog();
		//launchRingDialog(this.hscrollView5);
		
		Toast.makeText(
				getApplicationContext(),
				" Loading and processing text file",
				Toast.LENGTH_SHORT).show();
		/*runOnUiThread(new Runnable(){
		    @Override
		    public void run(){
		        // change UI elements here
		    	Toast.makeText(
						getApplicationContext(),
						" Loading and processing text file",
						Toast.LENGTH_SHORT).show();
		    }
		});*/
		//Read text from file
		//StringBuilder text = new StringBuilder();
		
		
		try {
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    String line;
		    
		   int lineCount=0;
		    while ((line = br.readLine()) != null) {
		    	final String fLine;
		    	fLine=line;
		       // text.append(line);
		        //text.append('\n');
		        if (line.indexOf(" ")!=-1){
		        	/*Handler handler = new Handler(); 
		    	    handler.postDelayed(new Runnable() { 
				         public void run() { 
				        	 processRequest(fLine.substring(0,fLine.indexOf(" ")));
				        	 try {
								this.wait(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        	 showAbout();
				         
				         }// processRequest("liste");// my_button.setBackgroundResource(R.drawable.defaultcard);
				        	 
				         //loadList();
				        // } 
				    }, 2000);
				    */
		        	
		        //	showAbout();	
		        	
		        	
		        	
		        	/*runOnUiThread(new Runnable(){
		    		    @Override
		    		    public void run(){
		    		        // change UI elements here
		    		    	Toast.makeText(
		    						getApplicationContext(),
		    						" Loading and processing word:" +fLine,
		    						Toast.LENGTH_SHORT).show();
		    		    	processRequest(fLine.substring(0,fLine.indexOf(" ")));
		    		    	try {
								this.wait(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		    		    }
		    		});	*/
		        	
		       // this.getApplicationContext().get
		        hscrollView5.invalidate();
		        hscrollView5.postInvalidate();
		        ((TextView) findViewById(R.id.text1)).setText(
						Html.fromHtml(
								line+"   <br>   "+
						((TextView) findViewById(R.id.text1)).getText()
						
						)
						);
                processRequest(line.substring(0,line.indexOf(" ")));
                }
		       // Toast.makeText(this,line.substring(0,line.indexOf(" ")) ,Toast.LENGTH_SHORT).show();
		        Log.i("processingTextFile",lineCount +": "+ line);
		        lineCount++;
		       // getWindow().requestFeature(Window.FEATURE_PROGRESS);
		        //this.setProgress(lineCount);
		    }
		    Log.i("processingTextFile","Text file is fully loaded");
		   // processRequest("chargement liste correcte");
		    Toast.makeText(this,"processingTextFile done",Toast.LENGTH_SHORT).show();
		}
		catch (IOException e) {
			Log.e( e.toString(),"error while importing Text File");
		    //You'll need to add proper error handling here
		}

	/*	
	 try
    {
        InputStream instream = openFileInput(Environment.getExternalStorageDirectory() + "/" + "hexasense"+"/image/ImageList.txt"); 
        if (instream != null)
        {
            InputStreamReader inputreader = new InputStreamReader(instream); 
            BufferedReader buffreader = new BufferedReader(inputreader); 
            String line,line1 = "";
            try
            {
                while ((line = buffreader.readLine()) != null){
                    line1+=line;
                    if (line.indexOf(" ")!=-1){
                    	processRequest(line.substring(0,line.indexOf(" ")));}
                }
                	
               
            }catch (Exception e) 
            {
                e.printStackTrace();
            }
            buffreader.close();
            inputreader.close();
         }
        
    }
    catch (Exception e) 
    {
        String error="";
        error=e.getMessage();
    }
    */
}
	
	
	
	
	/*
	public void showMenu(View v) {
	    PopupMenu popup = new PopupMenu(this, v);

	    // This activity implements OnMenuItemClickListener
	    popup.setOnMenuItemClickListener(this);.hscrollView5.getContext().);
	    popup.inflate(R.menu.actions);
	    popup.show();
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.item1:
	           // archive(item);
	            return true;
	        case R.id.item2:
	           // delete(item);
	            return true;
	        default:
	            return false;
	    }
	}
	*/
	
	/*if your activity includes background threads that you created during
	 *  onCreate() or other long-running resources that could potentially
	 *   leak memory if not properly closed, you should kill them during 
	 *   onDestroy().
	 * 
	 * 
	 * Note: The system calls onDestroy() after it has already called 
	 * onPause() and onStop() in all situations except one:
	 *  when you call finish() from within the onCreate() method.
	 *   In some cases, such as when your activity operates as 
	 *   a temporary decision maker to launch another activity,
	 *    you might call finish() from within onCreate() to
	 *     destroy the activity.
	 *      In this case, the system immediately calls onDestroy()
	 *       without calling any of the other lifecycle methods.
	 */
	@Override
	protected void onStop() {
	    super.onStop();  // Always call the superclass method first

	    // Save the note's current draft, because the activity is stopping
	    // and we want to be sure the current note progress isn't lost.
	    ContentValues values = new ContentValues();
	    //values.put(NotePad.Notes.COLUMN_NAME_NOTE, getCurrentNoteText());
	    //values.put(NotePad.Notes.COLUMN_NAME_TITLE, getCurrentNoteTitle());
	    
	    
	    /*getContentResolver().update(
	            mUri,    // The URI for the note to update.
	            values,  // The map of column names and new values to apply to them.
	            null,    // No SELECT criteria are used.
	            null     // No WHERE columns are used.
	            );
	     */
	}
	
	
	
	
	@Override
	public void onDestroy() {
	    super.onDestroy();  // Alwayscall the superclass
	    
	    // Stop method tracing that the activity started during onCreate()
	   // android.os.Debug.stopMethodTracing();
	    
	    
	    //TODO remove autoscrollTimer_Tick.
	    if (scrollTimer!=null){ scrollTimer.purge(); scrollTimer.cancel();}
	    if (speechRecognizer  !=null){ 	    speechRecognizer.cancel(); speechRecognizer.destroy();}}

	
	   protected void showAbout() {
	        // Inflate the about message contents
	        View messageView = getLayoutInflater().inflate(R.layout.about, null, false);
	 
	        // When linking text, force to always use default color. This works
	        // around a pressed color state bug.
	        TextView textView = (TextView) messageView.findViewById(R.id.about_credits);
	        int defaultColor = textView.getTextColors().getDefaultColor();
	        textView.setTextColor(defaultColor);
	 
	        AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        builder.setIcon(R.drawable.ic_launcher);
	        builder.setTitle(R.string.app_name);
	        builder.setView(messageView);
	        builder.create();
	        builder.show();
	    }
	   
	   protected void showValidation() {//show and cleanTxtFile related to images
	        // Inflate the about message contents
	        View messageView = getLayoutInflater().inflate(R.layout.validation, null, false);
	 
	        // When linking text, force to always use default color. This works
	        // around a pressed color state bug.
	        TextView textView = (TextView) messageView.findViewById(R.id.about_credits);
	        int defaultColor = textView.getTextColors().getDefaultColor();
	        textView.setTextColor(defaultColor);
	       
	  	  //ImageView image = new ImageView(this);
		  LinearLayout linearLayout=new LinearLayout(this);		
		  
		  View view=new View(this);
		  ScrollView scrollView=new ScrollView(this);
	        
	        
	        
	        AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        builder.setIcon(R.drawable.ic_launcher);
	        builder.setTitle(R.string.app_name);
	   
	    	linearLayout.setOrientation(1);
	        scrollView.addView(linearLayout);
	        builder.setView(scrollView);
	        //builder.setView(messageView);
	       builder.create();
	        builder.show();
	        
	    	LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT);

	    	File path =new File(Environment.getExternalStorageDirectory()
					+ File.separator + "hexasense");
	    	//FileFilter fFilter;
	    	//fFilter.accept(path);
	    	
	    	File [] files= path.listFiles(); //	path.list(fFilter);
	    	
			for (int foundWord = 0; foundWord <  500; foundWord++) {//files.length; foundWord++) {//
				//wordsYouSaidCounter; foundWord++) {
				File file=files[foundWord];
				//String fileName=
				/*File file = new File(Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense" + File.separator
						+ wordsYouSaid[foundWord] + ".jpg");
				*/
				//at com.google.android.speech.embedded.Greco3RecognitionEngine.startRecognition(Greco3RecognitionEngine.java:118)
				//android.speech.embedded.Greeco3RecognitionEngine
				 //android.speech.RecognitionService   speechembedded;
				 //speechembedded.
				String filename=file.getName().substring(0, file.getName().length()-4);
				if (file.getName().toLowerCase().endsWith(".txt")) {
					if (file.exists()) {
						// advancedDownload(wordsYouSaid[foundWord]);
						file.delete();
					}}
				
				if (file.getName().toLowerCase().endsWith(".jpg")) {
					if (file.exists()) {
						// advancedDownload(wordsYouSaid[foundWord]);
						
						//lparams.height = LayoutParams.MATCH_PARENT;
						if ( imageSizePref>0)lparams.height=imageSizePref;
						
						
						//lparams.width = lparams.height + 200;
						lparams.width = lparams.height ;

						//ImageView btnImageView4 = new ImageView(this);
						
						//btnImageView4.setLayoutParams(lparams);
						// lparams.height=100;
						// lparams.width=100;//LayoutParams.MATCH_PARENT;//LayoutParams.WRAP_CONTENT*2;//
						// lparams.height=LayoutParams.MATCH_PARENT;
						// lparams.height=LayoutParams.MATCH_PARENT;
						// lparams.width=lparams.height*2;
						ImageView image = new ImageView(this);
						image.setScaleType(ScaleType.FIT_CENTER);//FIT_XY);// FIT_CENTER);//.CENTER_CROP);//.CENTER_INSIDE);//.FIT_XY);
						// btnImageView4.setBackgroundResource(
						// words2ImageResult[i].imageID);
						
						//rotateFromEXIF(btnImageView4,file.getName().toLowerCase());//wordsYouSaid[foundWord]);
						
						/////////////////////////////////
						//hscrollLayout2.addView(btnImageView4,0 );
						
						
						//btnImageView4.
						Log.v("setGoogleImageBitmap", "" +file.getName().toLowerCase());//wordsYouSaid[foundWord]);
						/*	btnImageView4.setImageBitmap(
						// Environment.getExternalStorageDirectory()+File.separator+"hexasense"
						// +File.separator + wordsYouSaid[foundWord]+".jpg"
								
								BitmapFactory.decodeFile(Environment
										.getExternalStorageDirectory().getAbsolutePath()
										.toString()
										+ File.separator
										+ "hexasense"
										+ File.separator
										+"bonjour.jpg"));//filename));//file.getName()));
										//file.toString()));
										 * 
										 */
								/*Environment
										.getExternalStorageDirectory()
										+ File.separator
										+ "hexasense"
										+ File.separator
										+ wordsYouSaid[foundWord]
										+ ".jpg"));*/
						Log.d("trying to print", Environment
								.getExternalStorageDirectory().getAbsolutePath()
								.toString()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+file.getName());// wordsYouSaid[foundWord] + ".jpg");

						 image.setImageBitmap(BitmapFactory.decodeFile(Environment
									.getExternalStorageDirectory().getAbsolutePath()
									.toString()
									+ File.separator
									+ "hexasense"
									+ File.separator
									+filename+".jpg"));
					        
					        rotateFromEXIF(image,filename);//file.getName().toLowerCase());//wordsYouSaid[foundWord]);
						
						
						image
								.setContentDescription(filename);//file.getName());//wordsYouSaid[foundWord]);
						
						//ScrollView scrollViewList = (ScrollView) findViewById(R.id.scrollViewList);
						//View linearLayoutDir = (View) findViewById(R.id.linearLayoutDir);
						
						//((ViewGroup) messageView).addView(btnImageView4);
						// messageView.buildDrawingCache();//.btnImageView4.bringToFront();
						//((ViewGroup) linearLayoutDir).addView(btnImageView4);
						//this.addViews(btnImageView4);//messageView);
						//scrollViewList.addView(btnImageView4);
						//scrollViewList.addView(btnImageView4,0 );
					
						image.setOnClickListener(new OnClickListener() {

							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								// Toast.makeText(getApplicationContext(),
								// "clickon Image"+hscrollLayout5.getChildCount(),
								// Toast.LENGTH_SHORT).setView(v);

								Toast.makeText(
										getApplicationContext(),
										"clickon Image" + v.getContentDescription()
												+ " " + v.toString(),
										Toast.LENGTH_SHORT).show();

							}
						});
						
						registerForContextMenu(image);
					
						
						//Works but interfer with context menu
						image
								.setOnLongClickListener(new OnLongClickListener() {

									@Override
									public boolean onLongClick(View v) {
										/*File file;
										file = new File(Environment
												.getExternalStorageDirectory()
												+ File.separator
												+ "hexasense"
												+ File.separator
												+ v.getContentDescription()
												+ ".jpg");

										showFileChooser();
										*/
										lastOnMediaLongClick = v
												.getContentDescription().toString();// v.getContentDescription.;
										
										
										
										
										/*
										 * Erase the old File and make a photo to
										 * replace it if
										 * (file.exists())file.delete();
										 * getPhoto(Environment
										 * .getExternalStorageDirectory() +
										 * File.separator + "hexasense" +
										 * File.separator
										 * +v.getContentDescription()+".jpg");
										 * 
										 * Toast.makeText(getApplicationContext(),
										 * "Long click on Image: "
										 * +v.getContentDescription
										 * ()+"    toString "+v.toString(),
										 * Toast.LENGTH_SHORT).show();
										 */
						
						
									return false;
									}
								});
						//builder.create();
						// builder.show();
						linearLayout.addView(image);
						linearLayout.refreshDrawableState();
						linearLayout.invalidate();
						}
					
				}
				
			}

	        
	        
			//ScrollView scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
			//scrollView1.addView(btnImageView4,0 );
			//(ScrollView) findViewById(R.id.scrollView1).addView(btnImageView4,0 );
	        //findViewbyId();
			//hscrollLayout2.addView(btnImageView4,0 );
			
			
	        
			//messageView.getParent().
		
		 //builder.setView(btnImageView4);
//	processRequest(filename);
		// builder.getContext().
		//this.removeDialog(R.)
		
			//builder.create();
	     //  builder.show();
		// builder
			//linearLayout.(image);
		      //  builder.create();
		        //builder.show();
	        
	        
	        
	    }
	   protected void showValidation4(){//display hardcoded images
		   
			  ImageView image = new ImageView(this);
			  ImageView image2 = new ImageView(this);
			  ImageView image3 = new ImageView(this);
			  ImageView image4 = new ImageView(this);
			  LinearLayout linearLayout=new LinearLayout(this);		
			  
			  View view=new View(this);
			  ScrollView scrollView=new ScrollView(this);
		//scrollView.arrowScroll(direction)
			  scrollView.setOnClickListener(new OnClickListener(){
				  @Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						// Toast.makeText(getApplicationContext(),
						// "clickon Image"+hscrollLayout5.getChildCount(),
						// Toast.LENGTH_SHORT).setView(v);

						Toast.makeText(
								getApplicationContext(),
								"clickon View" + v.getContentDescription()
										+ " " + v.toString(),
								Toast.LENGTH_SHORT).show();

					}
				});
			  
			  //scrollView.addView(image,0);
			 // scrollView.addView(image2,1);
		    
			  // image.setImageResource(R.drawable.virolo);
		        File file = new File(Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense" + File.separator
						+ "bonjour.jpg");// wordsYouSaid[foundWord] + ".jpg");
		      //  image2.setBackgroundResource(R.drawable.acid);// resid);(file);// wordsYouSaid[foundWord]+".jpg");
		        image2.setImageResource(R.drawable.aller);
		        image4.setImageResource(R.drawable.bact);
		        image3.setImageResource(R.drawable.incendi);
		        image.setImageBitmap(BitmapFactory.decodeFile(Environment
						.getExternalStorageDirectory().getAbsolutePath()
						.toString()
						+ File.separator
						+ "hexasense"
						+ File.separator
						+"bonjour.jpg"));
		        
		        rotateFromEXIF(image,"bonjour");//file.getName().toLowerCase());//wordsYouSaid[foundWord]);
		       
		        image
				.setContentDescription("bonjour");//file.getName());//wordsYouSaid[foundWord]);
		        image.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						// Toast.makeText(getApplicationContext(),
						// "clickon Image"+hscrollLayout5.getChildCount(),
						// Toast.LENGTH_SHORT).setView(v);

						Toast.makeText(
								getApplicationContext(),
								"clickon Image" + v.getContentDescription()
										+ " " + v.toString(),
								Toast.LENGTH_SHORT).show();

					}
				});
				
				registerForContextMenu(image);
			
				
				//Works but interfer with context menu
				image
						.setOnLongClickListener(new OnLongClickListener() {

							@Override
							public boolean onLongClick(View v) {
								/*File file;
								file = new File(Environment
										.getExternalStorageDirectory()
										+ File.separator
										+ "hexasense"
										+ File.separator
										+ v.getContentDescription()
										+ ".jpg");

								showFileChooser();
								*/
								lastOnMediaLongClick = v
										.getContentDescription().toString();// v.getContentDescription.;
								
								
								
								
								/*
								 * Erase the old File and make a photo to
								 * replace it if
								 * (file.exists())file.delete();
								 * getPhoto(Environment
								 * .getExternalStorageDirectory() +
								 * File.separator + "hexasense" +
								 * File.separator
								 * +v.getContentDescription()+".jpg");
								 * 
								 * Toast.makeText(getApplicationContext(),
								 * "Long click on Image: "
								 * +v.getContentDescription
								 * ()+"    toString "+v.toString(),
								 * Toast.LENGTH_SHORT).show();
								 */
				
				
							return false;
							}
						});
		        
		        
		        //this.addViews(view);
				linearLayout.setClickable(true);
				linearLayout.setLongClickable(true);
				linearLayout.setMotionEventSplittingEnabled(true);
				//linearLayout.setOnTouchListener(l)
				linearLayout.setOrientation(1);
				
				 linearLayout.addView(image3, 0);
		        linearLayout.addView(image2, 1);
				 linearLayout.addView(image, 2);
				 linearLayout.addView(image4, 3);
				 scrollView.addView(linearLayout);
				 
		        AlertDialog.Builder builder = 
		                new AlertDialog.Builder(this).
		                setMessage("Message above the image").
		                setPositiveButton("sdf", new DialogInterface.OnClickListener() {                     
		                    @Override
		                    public void onClick(DialogInterface dialog, int which) {
		                            dialog.dismiss();
		                    }
		                }).
		                
		                setView(scrollView);
		        builder.create().show();
			 
		 }
	   
	 protected void showValidation3(){//RealName Showimage
		  ImageView image = new ImageView(this);
	       // image.setImageResource(R.drawable.virolo);
	        File file = new File(Environment.getExternalStorageDirectory()
					+ File.separator + "hexasense" + File.separator
					+ "bonjour.jpg");// wordsYouSaid[foundWord] + ".jpg");
	        //image.setBackgroundResource(R.drawable.acid);// resid);(file);// wordsYouSaid[foundWord]+".jpg");
	       
	        image.setImageBitmap(BitmapFactory.decodeFile(Environment
					.getExternalStorageDirectory().getAbsolutePath()
					.toString()
					+ File.separator
					+ "hexasense"
					+ File.separator
					+"bonjour.jpg"));
	        
	        rotateFromEXIF(image,"bonjour");//file.getName().toLowerCase());//wordsYouSaid[foundWord]);
	        
	        AlertDialog.Builder builder = 
	                new AlertDialog.Builder(this).
	                setMessage("Message above the image").
	                setPositiveButton("sdf", new DialogInterface.OnClickListener() {                     
	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                            dialog.dismiss();
	                    }
	                }).
	                
	                setView(image);
	        builder.create().show();
		 
	 }
	   protected void showValidation2() {//cleanTxtFile related to images
	        // Inflate the about message contents
	        View messageView = getLayoutInflater().inflate(R.layout.validation, null, false);
	 
	        // When linking text, force to always use default color. This works
	        // around a pressed color state bug.
	        TextView textView = (TextView) messageView.findViewById(R.id.about_credits);
	        int defaultColor = textView.getTextColors().getDefaultColor();
	        textView.setTextColor(defaultColor);
	        AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        builder.setIcon(R.drawable.ic_launcher);
	        builder.setTitle(R.string.app_name);
	        //builder.setView(messageView);
	        //builder.create();
	       // builder.show();
        
	      
	        
	    	LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT);

	    	File path =new File(Environment.getExternalStorageDirectory()
					+ File.separator + "hexasense");
	    	//FileFilter fFilter;
	    	//fFilter.accept(path);
	    	
	    	File [] files= path.listFiles(); //	path.list(fFilter);
	    	
			for (int foundWord = 0; foundWord < files.length; foundWord++) {
				//wordsYouSaidCounter; foundWord++) {
				File file=files[foundWord];
				//String fileName=
				/*File file = new File(Environment.getExternalStorageDirectory()
						+ File.separator + "hexasense" + File.separator
						+ wordsYouSaid[foundWord] + ".jpg");
				*/
				//at com.google.android.speech.embedded.Greco3RecognitionEngine.startRecognition(Greco3RecognitionEngine.java:118)
				//android.speech.embedded.Greeco3RecognitionEngine
				 //android.speech.RecognitionService   speechembedded;
				 //speechembedded.
				String filename=file.getName().substring(0, file.getName().length()-4);
				if (file.getName().toLowerCase().endsWith(".txt")) {
					if (file.exists()) {
						// advancedDownload(wordsYouSaid[foundWord]);
						file.delete();
					}}
				
				if (file.getName().toLowerCase().endsWith(".jpg")) {
					if (file.exists()) {
						// advancedDownload(wordsYouSaid[foundWord]);
						
						//lparams.height = LayoutParams.MATCH_PARENT;
						if ( imageSizePref>0)lparams.height=imageSizePref;
						
						
						//lparams.width = lparams.height + 200;
						lparams.width = lparams.height ;

						ImageView btnImageView4 = new ImageView(this);
						
						btnImageView4.setLayoutParams(lparams);
						// lparams.height=100;
						// lparams.width=100;//LayoutParams.MATCH_PARENT;//LayoutParams.WRAP_CONTENT*2;//
						// lparams.height=LayoutParams.MATCH_PARENT;
						// lparams.height=LayoutParams.MATCH_PARENT;
						// lparams.width=lparams.height*2;
						btnImageView4.setScaleType(ScaleType.FIT_XY);// FIT_CENTER);//.CENTER_CROP);//.CENTER_INSIDE);//.FIT_XY);
						// btnImageView4.setBackgroundResource(
						// words2ImageResult[i].imageID);
						
						//rotateFromEXIF(btnImageView4,file.getName().toLowerCase());//wordsYouSaid[foundWord]);
						
						/////////////////////////////////
						//hscrollLayout2.addView(btnImageView4,0 );
						
						
						//btnImageView4.
						Log.v("setGoogleImageBitmap", "" +file.getName().toLowerCase());//wordsYouSaid[foundWord]);
						/*	btnImageView4.setImageBitmap(
						// Environment.getExternalStorageDirectory()+File.separator+"hexasense"
						// +File.separator + wordsYouSaid[foundWord]+".jpg"
								
								BitmapFactory.decodeFile(Environment
										.getExternalStorageDirectory().getAbsolutePath()
										.toString()
										+ File.separator
										+ "hexasense"
										+ File.separator
										+"bonjour.jpg"));//filename));//file.getName()));
										//file.toString()));
										 * 
										 */
								/*Environment
										.getExternalStorageDirectory()
										+ File.separator
										+ "hexasense"
										+ File.separator
										+ wordsYouSaid[foundWord]
										+ ".jpg"));*/
						Log.d("trying to print", Environment
								.getExternalStorageDirectory().getAbsolutePath()
								.toString()
								+ File.separator
								+ "hexasense"
								+ File.separator
								+file.getName());// wordsYouSaid[foundWord] + ".jpg");

						btnImageView4
								.setContentDescription(file.getName());//wordsYouSaid[foundWord]);
						//ScrollView scrollViewList = (ScrollView) findViewById(R.id.scrollViewList);
						//View linearLayoutDir = (View) findViewById(R.id.linearLayoutDir);
						
						((ViewGroup) messageView).addView(btnImageView4);
						 messageView.buildDrawingCache();//.btnImageView4.bringToFront();
						//((ViewGroup) linearLayoutDir).addView(btnImageView4);
						//this.addViews(btnImageView4);//messageView);
						//scrollViewList.addView(btnImageView4);
						//scrollViewList.addView(btnImageView4,0 );
						 builder.setView(btnImageView4);
						 //builder.setView(btnImageView4);
				//	processRequest(filename);
						// builder.getContext().
						//this.removeDialog(R.)
						 builder.create();
					       builder.show();
						// builder
						btnImageView4.setOnClickListener(new OnClickListener() {

							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								// Toast.makeText(getApplicationContext(),
								// "clickon Image"+hscrollLayout5.getChildCount(),
								// Toast.LENGTH_SHORT).setView(v);

								Toast.makeText(
										getApplicationContext(),
										"clickon Image" + v.getContentDescription()
												+ " " + v.toString(),
										Toast.LENGTH_SHORT).show();

							}
						});
						
						registerForContextMenu(btnImageView4);
					
						
						//Works but interfer with context menu
						btnImageView4
								.setOnLongClickListener(new OnLongClickListener() {

									@Override
									public boolean onLongClick(View v) {
										/*File file;
										file = new File(Environment
												.getExternalStorageDirectory()
												+ File.separator
												+ "hexasense"
												+ File.separator
												+ v.getContentDescription()
												+ ".jpg");

										showFileChooser();
										*/
										lastOnMediaLongClick = v
												.getContentDescription().toString();// v.getContentDescription.;
										
										
										
										
										/*
										 * Erase the old File and make a photo to
										 * replace it if
										 * (file.exists())file.delete();
										 * getPhoto(Environment
										 * .getExternalStorageDirectory() +
										 * File.separator + "hexasense" +
										 * File.separator
										 * +v.getContentDescription()+".jpg");
										 * 
										 * Toast.makeText(getApplicationContext(),
										 * "Long click on Image: "
										 * +v.getContentDescription
										 * ()+"    toString "+v.toString(),
										 * Toast.LENGTH_SHORT).show();
										 */
						
						
									return false;
									}
								});}}}

	        
	        
			//ScrollView scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
			//scrollView1.addView(btnImageView4,0 );
			//(ScrollView) findViewById(R.id.scrollView1).addView(btnImageView4,0 );
	        //findViewbyId();
			//hscrollLayout2.addView(btnImageView4,0 );
			
			
	        
			//messageView.getParent().
	        
			  
		      //  builder.create();
		        //builder.show();
	        
	        
	        
	    }
	   
	   
	   protected void showHelp() {
	        // Inflate the about message contents
	        View messageView = getLayoutInflater().inflate(R.layout.options, null, false);
	 
	        // When linking text, force to always use default color. This works
	        // around a pressed color state bug.
	        
	        
	        TextView textView = (TextView) messageView.findViewById(R.id.options_lang);
	        int defaultColor = textView.getTextColors().getDefaultColor();
	        textView.setTextColor(defaultColor);
	 
	        
	        
	        AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        builder.setIcon(R.drawable.ic_launcher);
	        builder.setTitle(R.string.app_name);
	        builder.setView(messageView);
	        builder.create();
	        
	        builder.show();
	        
	        
	        //Not used Button is defined in XML
	        ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton1);
	        //toggle.setChecked(SLVideoActivated);
	       /* toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
	            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	                if (isChecked) {
	                    Log.d("is checked","");
	                } else {
	                    // The toggle is disabled
	                }
	            }
	        });
	        */
	        
	        //findViewById(R.id.toggleButton1).setOnClickListener(this);
	    }
	   
	   protected void showViews() {
	        // Inflate the about message contents
	        View messageView = getLayoutInflater().inflate(R.layout.views, null, false);
	 
	        // When linking text, force to always use default color. This works
	        // around a pressed color state bug.
	        
	        
	      /*  TextView textView = (TextView) messageView.findViewById(R.id.options_lang);
	        int defaultColor = textView.getTextColors().getDefaultColor();
	        textView.setTextColor(defaultColor);*/
	        
	        Log.d("ToggleButton","GoogleActivated"+ GoogleActivated );
	        try {
				ToggleButton toggle = (ToggleButton) messageView.findViewById(R.id.GoogleViewTogglebutton);
				toggle.setChecked(GoogleActivated);
				toggle.setButtonDrawable(android.R.drawable.ic_search_category_default);
				//toggle.toggle();
				toggle.invalidate();
			
				
				 toggle = (ToggleButton) messageView.findViewById(R.id.SWSpellViewTogglebutton);
				toggle.setChecked(SWSpellingActivated);
				toggle.setButtonDrawable(android.R.drawable.ic_menu_sort_alphabetically);
				//toggle.toggle();
				toggle.invalidate();
				

				toggle = (ToggleButton) messageView.findViewById(R.id.SecurityViewTogglebutton);
				toggle.setChecked(SecurityActivated);
				toggle.setButtonDrawable(android.R.drawable.ic_dialog_alert);
				//toggle.toggle();
				toggle.invalidate();
				
				toggle = (ToggleButton) messageView.findViewById(R.id.VideoViewTogglebutton);
				toggle.setChecked(SLVideoActivated);
				toggle.setButtonDrawable(android.R.drawable.ic_media_play);//setIcon(R.drawable.ic_launcher)
				//toggle.toggle();
				toggle.invalidate();
				
				//toggle.addChildrenForAccessibility(children);
				//toggle.setButtonDrawable(R.drawable.ic_launcher);//setIcon(R.drawable.ic_launcher)
				
			} catch (Exception e) {
				Log.e("ToggleButton","e"+e.toString());
				// TODO: handle exception
			}
	        
	        
	        AlertDialog.Builder builder = new AlertDialog.Builder(this);
	        builder.setIcon(R.drawable.ic_launcher);
	        builder.setTitle(R.string.app_name);
	        builder.setView(messageView);
	        builder.create();
	        builder.setIcon(android.R.drawable.ic_menu_view);//ic_menu_slideshow
	        
	       
			builder.show();
	      
	       
	        
	        //Not used Button is defined in XML
	     //   ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton1);
	        //toggle.setChecked(SLVideoActivated);
	       /* toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
	            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	                if (isChecked) {
	                    Log.d("is checked","");
	                } else {
	                    // The toggle is disabled
	                }
	            }
	        });
	        */
	        
	        //findViewById(R.id.toggleButton1).setOnClickListener(this);
	    }
	   
	   
	   
	   
	   void raw2SD (int raw,String out){
	  // String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
	   String fileName = out;//+".mp3";
	   Uri rawUri = Uri.parse("android.resource://" + getPackageName() + "/" 
				+ raw); //do not add any extension
				//if your file is named xxx.mp4 and placed in /raw
				//use R.raw.xxx
	   
	  // File newSoundFile = new File(baseDir, fileName);
	   File newSoundFile = new File(fileName);
	   try {
	       byte[] readData = new byte[1024*500];
	       InputStream fis = getResources().openRawResource(raw);
	      // InputStream fis = getResources().openRawResource(this.getApplicationContext().getResources().getIdentifier(raw,"raw", this.getApplicationContext().getPackageName()));
	       FileOutputStream fos = new FileOutputStream(newSoundFile);
	       int i = fis.read(readData);

	       while (i != -1) {
	           fos.write(readData, 0, i);
	           i = fis.read(readData);
	       }

	       fos.close();
	   } catch (IOException io) {
	   }
	   }
	
	   
	   
	   public void showAlertDialog() {
		    new AlertDialog.Builder(this)
		        .setIcon(android.R.drawable.ic_dialog_alert)
		        .setTitle("Closing Activity")
		        .setMessage("Are you sure you want to close this activity?")
		        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
		    {
		        @Override
		        public void onClick(DialogInterface dialog, int which) {
		            finish();   
		            
		            
		            
		        }

		    })
		    .setNegativeButton("No", null)
		    .show();
		}
	   
	   public void vibrate(int ms){
		   Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		   // Vibrate for 500 milliseconds
		   v.vibrate(ms);
		   
		   
		   }
	   public void vibrateReady(){
		// Get instance of Vibrator from current Context
		   Vibrator mVibrator  = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		    
		   // This code snippet will cause the phone to vibrate "SOS" in Morse Code
		   // In Morse Code, "s" = "dot-dot-dot", "o" = "dash-dash-dash"
		   // There are pauses to separate dots/dashes, letters, and words
		   // The following numbers represent millisecond lengths
		   /*int dot = 200;      // Length of a Morse Code "dot" in milliseconds
		   int dash = 500;     // Length of a Morse Code "dash" in milliseconds
		   int short_gap = 200;    // Length of Gap Between dots/dashes
		   int medium_gap = 500;   // Length of Gap Between Letters
		   int long_gap = 1000;    // Length of Gap Between Words*/
		  
		   int dot = 50;      // Length of a Morse Code "dot" in milliseconds
		   int dash = 100;     // Length of a Morse Code "dash" in milliseconds
		   int short_gap = 50;    // Length of Gap Between dots/dashes
		   int medium_gap = 100;   // Length of Gap Between Letters
		   int long_gap = 1000;    // Length of Gap Between Words
		   
		   
		   long[] SOSPattern = {
		       0,  // Start immediately
		       dot, short_gap, dot, short_gap, dot,    // s
		       medium_gap,
		       dash, short_gap, dash, short_gap, dash, // o
		       medium_gap,
		       dot, short_gap, dot, short_gap, dot,    // s
		       long_gap
		   };
		   
		   long[] pattern = {
			       0,  // Start immediately
			       dot, short_gap, dot//,medium_gap, dash//dot, short_gap, dot,medium_gap, dash, dot, short_gap, dot
			       
			   };
		   
		   
		   // Only perform this pattern one time (-1 means "do not repeat")
		   mVibrator.vibrate(pattern, -1);
	   }
	   
	   public void launchRingDialog(View view) {
		   	        final ProgressDialog ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...", "Downloading Image ...", true);
		   	        ringProgressDialog.setCancelable(true);
		   	        new Thread(new Runnable() {
		   	            @Override
		   	            public void run() {
		   	                try {
		   	                    // Here you should write your time consuming task...
		   	                    // Let the progress ring for 10 seconds...
		   	                    Thread.sleep(10000);
		   	                } catch (Exception e) {
		   	 
		   	                }
		   	                ringProgressDialog.dismiss();
		   	            }
		   	        }).start();
		   	    }	 
	   
	   void setTitle(String title,String subTitle){
		   ActionBar actionBar = getActionBar();
			if (subTitle!=null) actionBar.setSubtitle(subTitle);
			actionBar.setTitle(title);
		   
	   }
	   
	   void blueTooth(String string){
		   AudioManager am;
		   am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
		   if (am.isBluetoothScoAvailableOffCall()){
		    	am.setBluetoothScoOn(true);
		  
		    registerReceiver(new BroadcastReceiver() {

		        @Override
		        public void onReceive(Context context, Intent intent) {
		            int state = intent.getIntExtra(AudioManager.EXTRA_SCO_AUDIO_STATE, -1);
		            Log.d("blueTooth", "Audio SCO state: " + state);

		            if (AudioManager.SCO_AUDIO_STATE_CONNECTED == state) { 
		                /* 
		                 * Now the connection has been established to the bluetooth device. 
		                 * Record audio or whatever (on another thread).With AudioRecord you can record with an object created like this:
		                 * new AudioRecord(MediaRecorder.AudioSource.MIC, 8000, AudioFormat.CHANNEL_CONFIGURATION_MONO,
		                 * AudioFormat.ENCODING_PCM_16BIT, audioBufferSize);
		                 *
		                 * After finishing, don't forget to unregister this receiver and
		                 * to stop the bluetooth connection with am.stopBluetoothSco();
		                 */
		                unregisterReceiver(this);
		            }

		        }
		    }, new IntentFilter(AudioManager.ACTION_SCO_AUDIO_STATE_CHANGED));

		    Log.d("BlueTooth", "starting bluetooth");
		    am.startBluetoothSco();
		   
		 
		   }
	   }
	   
	   
		 int readSharedPrefInt(String string) {
			 
			 SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
			   Log.d ("read SharedPref"," "+((int) sharedPref.getInt(string, 200)));
			   return ((int) sharedPref.getInt(string, 200));
			 
	
		}
	   
	   Boolean readSharedPrefBoolean(String key){
		   
		   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		   Log.d ("read SharedPref"," "+((boolean) sharedPref.getBoolean("lol",false)));
		   return ((boolean) sharedPref.getBoolean(key,false));
	   }
	   Boolean readSharedPrefBoolean(String key,Boolean state){
		   
		   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		   Log.d ("read SharedPref"," "+((boolean) sharedPref.getBoolean("lol",false)));
		   return ((boolean) sharedPref.getBoolean(key,state));
	   }
	   String readSharedPref(String key){
		   
		   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		   Log.d ("read SharedPref"," "+((String) sharedPref.getString(key, "") ));
		   return((String) sharedPref.getString(key, "") );
	   }
	   
 void writeSharedPrefBool(String key,Boolean value){
		   
		   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		   sharedPref.edit().putBoolean(key, value).commit();
		   Log.d ("writeBool SharedPref",""+ key+" "+value+ "  "+sharedPref.toString());
		   
	   }
 void writeSharedPrefString(String key,String value){
	   
	   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
	   sharedPref.edit().putString(key, value).commit();
	   Log.d ("writeString SharedPref",""+ key+" "+value+ "  "+sharedPref.toString());
 }
 void writeSharedPrefInt(String key,int value){
	   
	   SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
	   sharedPref.edit().putInt(key, value).commit();
	   Log.d ("writeBool SharedPref",""+ key+" "+value+ "  "+sharedPref.toString());
	   
 }
 void runBrowser(String url){
	 Uri uri = Uri.parse(url);//"http://www.ateraction.com");
	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	 startActivity(intent);

 }
	   
	   
}// EOF

