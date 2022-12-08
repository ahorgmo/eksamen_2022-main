resource "aws_cloudwatch_metric_alarm" "cart_above_5" {
  alarm_name                = "cart-sum-above-5"
  namespace                 = "1038"
  metric_name               = "carts_count.value"

  comparison_operator       = "GreaterThanThreshold"
  threshold                 = "5"
  evaluation_periods        = "3"
  period                    = "300"

  statistic                 = "Maximum"

  alarm_description         = "This alarm goes off as soon as the total amount of carts over 3 repeating periods on 5 minutes exceeds 5"
  insufficient_data_actions = []
  alarm_actions       = [aws_sns_topic.alarms.arn]
}



resource "aws_sns_topic" "alarms" {
  name = "alarm-topic-${var.candidate_id}"
}



resource "aws_sns_topic_subscription" "user_updates_sqs_target" {
  topic_arn = aws_sns_topic.alarms.arn
  protocol  = "email"
  endpoint  = var.candidate_email
}