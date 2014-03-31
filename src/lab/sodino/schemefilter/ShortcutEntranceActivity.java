package lab.sodino.schemefilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Sodino E-mail:sodino@qq.com
 * @version Time：2014年3月31日 上午11:00:12
 */
public class ShortcutEntranceActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shortcut);
		TextView txtView = (TextView) findViewById(R.id.txtView);
		
		Intent intent = getIntent();  
		String action = intent.getAction();  
		  
		if(Intent.ACTION_VIEW.equals(action)){  
		    Uri uri = intent.getData();  
		    if(uri != null){
		        String paramFrom = uri.getQueryParameter("from");  
		        String paramDo= uri.getQueryParameter("do");
		        
		        StringBuffer sb = new StringBuffer();
		        sb.append("\n\n\n");
		        sb.append("from=" + paramFrom);
		        sb.append("\n");
		        sb.append("do=" + paramDo);
		        sb.append("\n");
		        sb.append("host:"+uri.getHost());
		        sb.append("\n");
		        sb.append("port:"+uri.getPort());
		        sb.append("\n");
		        sb.append("scheme:"+uri.getScheme());
		        sb.append("\n");
		        sb.append("path:"+uri.getPath());
		        sb.append("\n");
		        sb.append("pathSegments:"+uri.getPathSegments().toString());
		        txtView.setText(sb.toString());
		    }
		}
	}
}
