package com.lxf.yuaiagent.tools;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.io.IOException;

public class WebScrapingTool {

    @Tool(description = "Scrape the content of a web page")
    public String scrapeWebPage(@ToolParam(description = "URL of the web page to scrape") String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            // 提取纯文本内容，避免返回 HTML 标签
            String text = doc.body().text();
            // 限制返回长度，避免过长内容
            if (text.length() > 3000) {
                text = text.substring(0, 3000) + "...";
            }
            return text;
        } catch (IOException e) {
            return "Error scraping web page: " + e.getMessage();
        }
    }
}
