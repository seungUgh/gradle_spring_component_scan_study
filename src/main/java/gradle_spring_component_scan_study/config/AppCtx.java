package gradle_spring_component_scan_study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import gradle_spring_component_scan_study.spring.ChangePasswordService;
import gradle_spring_component_scan_study.spring.MemberDao;
import gradle_spring_component_scan_study.spring.MemberInfoPrinter;
import gradle_spring_component_scan_study.spring.MemberListPrinter;
import gradle_spring_component_scan_study.spring.MemberPrinter;
import gradle_spring_component_scan_study.spring.MemberRegisterService;
import gradle_spring_component_scan_study.spring.MemberSummaryPrinter;
import gradle_spring_component_scan_study.spring.VersionPrinter;

@Configuration
//@ComponentScan(basePackages = {"gradle_spring_component_scan_study.spring"},
//				excludeFilters = @Filter(type = FilterType.REGEX,
//										pattern = "gradle_spring_component_scan_study.spring\\..*Dao"))
@ComponentScan(basePackages = {"gradle_spring_component_scan_study.spring" }, 
				excludeFilters = @Filter(type = FilterType.ASPECTJ, 
											pattern = "gradle_spring_component_scan_study.spring.*Dao"))
public class AppCtx {
	
	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	
	
}
