package org.thoughtcrime.redphone.ui;

import android.content.Intent;
import android.os.Bundle;

import org.thoughtcrime.redphone.R;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class CountrySelectionActivity extends SherlockFragmentActivity
                                      implements CountrySelectionFragment.CountrySelectedListener

{

  @Override
  public void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    this.setContentView(R.layout.country_selection);
  }

  @Override
  public void countrySelected(String countryName, int countryCode) {
    Intent result = getIntent();
    result.putExtra("country_name", countryName);
    result.putExtra("country_code", countryCode);

    this.setResult(RESULT_OK, result);
    this.finish();
  }
}
