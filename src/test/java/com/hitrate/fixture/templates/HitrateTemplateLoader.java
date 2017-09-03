package com.hitrate.fixture.templates;

import java.text.SimpleDateFormat;

import com.hitrate.entity.Hitrate;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class HitrateTemplateLoader implements TemplateLoader {
	@Override
	public void load() {
		Fixture.of(Hitrate.class).addTemplate("valid", new Rule() {
			{
				add("id", random(Integer.class, range(1, 200)));
				add("visitDate", randomDate("2011-04-15", "2011-11-07", new SimpleDateFormat("yyyy-MM-dd")));
				add("website", random("www.google.com", "www.facebook.com"));
				add("visits", random(Integer.class, range(1, 200)));
			}
		});
	}
}
