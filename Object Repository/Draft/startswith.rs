<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>startswith</name>
   <tag></tag>
   <elementGuidId>b31b713b-71eb-407e-8bb3-05daf216a63a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>android.widget.TextView</value>
      <webElementGuid>85214e99-4dc9-4b05-a4c9-90a7a3adb5ec</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>starts with</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${Verify}</value>
      <webElementGuid>9e5e8909-fd36-4189-abdd-98f6e18ac936</webElementGuid>
   </webElementProperties>
   <locator>//*[@class = 'android.widget.TextView' and (starts-with(@text, '${Verify}') or starts-with(., '${Verify}'))]</locator>
   <locatorStrategy>ATTRIBUTES</locatorStrategy>
</MobileElementEntity>
